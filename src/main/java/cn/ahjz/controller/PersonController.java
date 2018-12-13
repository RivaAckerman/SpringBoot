package cn.ahjz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wind on 2018/12/6.
 */

@RestController
@RequestMapping("/mydemo")
public class PersonController {
    //获取yml中的值
    @Value("${person.name}")
    private String name;

    @RequestMapping("/p")
    public String getperson(){

        return name;
    }

}
