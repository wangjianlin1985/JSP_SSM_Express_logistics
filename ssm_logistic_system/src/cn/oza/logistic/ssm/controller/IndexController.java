// 
// 
// 

package cn.oza.logistic.ssm.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController
{
    @RequiresPermissions({ "system:index" })
    @RequestMapping({ "/index", "" })
    public String index() {
        return "index";
    }
    
    @RequestMapping({ "/welcome" })
    @RequiresPermissions({ "system:index" })
    public String welcome() {
        return "welcome";
    }
    
    @RequestMapping({ "/login" })
    public String login(final HttpServletRequest request, final Model m) {
        final String shiroLoginFailure = String.valueOf(request.getAttribute("shiroLoginFailure"));
        if (UnknownAccountException.class.getName().equals(shiroLoginFailure)) {
            m.addAttribute("errorMsg", (Object)"\u8d26\u6237\u4e0d\u5b58\u5728");
        }
        else if (IncorrectCredentialsException.class.getName().equals(shiroLoginFailure)) {
            m.addAttribute("errorMsg", (Object)"\u5bc6\u7801\u9519\u8bef");
        }
        return "login";
    }
    
    @RequestMapping({ "/checkVerifyCode" })
    @ResponseBody
    public Boolean checkVerifyCode(final String verifyCode, final HttpSession session) {
        final String randCode = String.valueOf(session.getAttribute("rand"));
        if (randCode.compareToIgnoreCase(verifyCode) == 0) {
            return true;
        }
        return false;
    }
    
    @RequestMapping({ "/unauthorized" })
    public String unauthorized() {
        return "unauthorized";
    }
}
