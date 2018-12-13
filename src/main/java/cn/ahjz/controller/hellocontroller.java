package cn.ahjz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wind on 2018/12/6.
 */

@Controller
@RequestMapping("/hello")
public class hellocontroller {

    @RequestMapping("/success")
    public String success(Map<String,Object> map){

        map.put("test","hello");

        List<String> list = new ArrayList<>();

        for(int i =0;i<4;i++){
            list.add("my"+i+"name");
        }

        map.put("list",list);

        return "success";
    }

}
