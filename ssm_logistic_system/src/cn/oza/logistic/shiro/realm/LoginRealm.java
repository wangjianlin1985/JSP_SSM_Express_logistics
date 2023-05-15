// 
// 
// 

package cn.oza.logistic.shiro.realm;

import java.util.Date;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.util.ByteSource;
import cn.oza.logistic.ssm.pojo.UserExample;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import java.util.Iterator;
import cn.oza.logistic.ssm.pojo.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import java.util.List;
import cn.oza.logistic.ssm.pojo.PermissionExample;
import java.util.ArrayList;
import cn.oza.logistic.ssm.pojo.User;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import cn.oza.logistic.ssm.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.service.UserService;
import org.apache.shiro.realm.AuthorizingRealm;

public class LoginRealm extends AuthorizingRealm
{
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;
    
    protected AuthorizationInfo doGetAuthorizationInfo(final PrincipalCollection principals) {
        final User user = (User)principals.getPrimaryPrincipal();
        final String permissionIdsStr = user.getRole().getPermissionIds();
        final String[] ids = permissionIdsStr.split(",");
        final List<Long> permissionIds = new ArrayList<Long>();
        String[] array;
        for (int length = (array = ids).length, i = 0; i < length; ++i) {
            final String id = array[i];
            permissionIds.add(Long.valueOf(id));
        }
        final PermissionExample permissionExample = new PermissionExample();
        final PermissionExample.Criteria criteria = permissionExample.createCriteria();
        criteria.andPermissionIdIn(permissionIds);
        final List<Permission> permissions = this.permissionService.selectByExample(permissionExample);
        final SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (final Permission permission : permissions) {
            simpleAuthorizationInfo.addStringPermission(permission.getExpression());
        }
        return (AuthorizationInfo)simpleAuthorizationInfo;
    }
    
    protected AuthenticationInfo doGetAuthenticationInfo(final AuthenticationToken token) throws AuthenticationException {
        final String username = String.valueOf(token.getPrincipal());
        final UserExample userExample = new UserExample();
        final UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        final List<User> users = this.userService.selectByExample(userExample);
        if (users.size() > 0) {
            final User user = users.get(0);
            user.setRoleName(user.getRole().getRolename());
            final String hashedCredentials = user.getPassword();
            final String salt = user.getSalt();
            return (AuthenticationInfo)new SimpleAuthenticationInfo((Object)user, (Object)hashedCredentials, ByteSource.Util.bytes(salt), this.getName());
        }
        return null;
    }
}
