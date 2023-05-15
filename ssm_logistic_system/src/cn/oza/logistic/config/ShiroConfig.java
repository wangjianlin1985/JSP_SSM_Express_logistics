// 
// 
// 

package cn.oza.logistic.config;

import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import java.util.Properties;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import java.util.Map;
import cn.oza.logistic.shiro.filter.MyFormAuthenticationFilter;
import javax.servlet.Filter;
import java.util.LinkedHashMap;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import cn.oza.logistic.shiro.realm.LoginRealm;
import org.apache.shiro.realm.Realm;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig
{
    @Bean
    public Realm realm() {
        final LoginRealm loginRealm = new LoginRealm();
        final HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        credentialsMatcher.setHashIterations(3);
        credentialsMatcher.setHashAlgorithmName("md5");
        loginRealm.setCredentialsMatcher((CredentialsMatcher)credentialsMatcher);
        return (Realm)loginRealm;
    }
    
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        final DefaultShiroFilterChainDefinition shiroFilterChainDefinition = new DefaultShiroFilterChainDefinition();
        return (ShiroFilterChainDefinition)shiroFilterChainDefinition;
    }
    
    @Bean
    public CacheManager cacheManager() {
        final EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManagerConfigFile("classpath:shiro-ehcache.xml");
        return (CacheManager)ehCacheManager;
    }
    
    @Bean
    protected ShiroFilterFactoryBean shiroFilterFactoryBean(final SessionsSecurityManager securityManager) {
        final ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager((SecurityManager)securityManager);
        final Map<String, Filter> filterMap = new LinkedHashMap<String, Filter>();
        filterMap.put("authc", (Filter)new MyFormAuthenticationFilter());
        shiroFilterFactoryBean.setFilters((Map)filterMap);
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setSuccessUrl("/index");
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");
        final Map<String, String> filterChain = new LinkedHashMap<String, String>();
        filterChain.put("/lib/**", "anon");
        filterChain.put("/static/**", "anon");
        filterChain.put("/verifyCode.jsp", "anon");
        filterChain.put("/checkVerifyCode", "anon");
        filterChain.put("/logout", "logout");
        filterChain.put("/login", "authc");
        filterChain.put("/**", "user");
        shiroFilterFactoryBean.setFilterChainDefinitionMap((Map)filterChain);
        return shiroFilterFactoryBean;
    }
    
    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        final SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
        final Properties properties = new Properties();
        properties.setProperty("org.apache.shiro.authz.AuthorizationException", "unauthorized");
        simpleMappingExceptionResolver.setExceptionMappings(properties);
        return simpleMappingExceptionResolver;
    }
    
    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        final DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setUsePrefix(true);
        return defaultAdvisorAutoProxyCreator;
    }
}
