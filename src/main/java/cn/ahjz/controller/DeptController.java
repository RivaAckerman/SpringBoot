package cn.ahjz.controller;

import cn.ahjz.dao.DeptMapper;
import cn.ahjz.model.Dept;
import cn.ahjz.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wind on 2018/12/3.
 */

@Controller
//@ComponentScan(basePackages={"cn.ahjz.service"})//添加的注解
@RequestMapping("cs")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/demo.html")
    @ResponseBody
    public Dept get(){
        Dept dept= deptService.getDeptByID(5);
        return  dept;
    }

    /**
     * 重定向
     * @return
     */
    @RequestMapping("/demo4")
    public String hello4(){
        System.out.println("11111");
        return  "redirect:hello.html";
    }

    /**
     * 转发
     * @return
     */
    @RequestMapping("/demo5")
    public String hello5(){
        System.out.println("11111");
        return  "hello.html";
    }

    @RequestMapping(value = "res")
    public String df(){
        return "Hello";
    }

    /**
     * 表单提交第一种方式  使用RequestParam 参数 获取
     * @param firstname
     * @param lastname
     * @return
     */
    @RequestMapping(value = "/hello",method =RequestMethod.POST)
    @ResponseBody
    public String hello1(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname){

        System.out.println("username is:"+firstname);
        System.out.println("password is:"+lastname);
        System.out.println("---");
        return  firstname;
    }

    /**
     * 获取表单提交数据第二种方式 使用HttpServletRequest
     * @param request
     * @return
     */
    @RequestMapping(value = "/demo3")
    @ResponseBody
    public String hello2(HttpServletRequest request){

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        System.out.println(firstname+lastname);
        System.out.println("---");
        return  "/hello.html";
    }

    /**
     *
     * @param name  get请求参数
     * @return  http://localhost:8080/demo2?name=tom
     */
    @RequestMapping(value = "/demo2")
    @ResponseBody
    public String hello3(String name){
        System.out.println(name);
        return  name;
    }

    @RequestMapping("/demo6.do")
    public String hello6(Model model){
        model.addAttribute("test","teata");

        return "index";
    }

}
