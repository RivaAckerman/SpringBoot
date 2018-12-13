package cn.ahjz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by wind on 2018/12/11.
 */

@Controller
public class LoginController {

//    @RequestMapping("/login")
//    public String index() {
//
//        return "login";
//    }

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map, HttpSession session) {

        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            session.setAttribute("username",username);
            //重定向到结果页面
            return "redirect:/main.html";
        } else {
            map.put("msg","error");
            return "login";
        }


    }

}
