// 
// 
// 

package cn.oza.logistic.shiro.filter;

import org.apache.shiro.subject.Subject;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter
{
    protected boolean isAccessAllowed(final ServletRequest request, final ServletResponse response, final Object mappedValue) {
        if (this.isLoginRequest(request, response) && this.isLoginSubmission(request, response)) {
            final Subject subject = this.getSubject(request, response);
            if (subject.getPrincipal() != null) {
                subject.logout();
            }
        }
        return super.isAccessAllowed(request, response, mappedValue);
    }
}
