package cn.ahjz.demo;

import cn.ahjz.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wind on 2018/12/5.
 */
@Component
public class test {

    @Value("&{person.name}")
    private String name;

    public static void main(String[] args){
    }
}
