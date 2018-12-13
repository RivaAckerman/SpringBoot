package cn.ahjz.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

/**
 * Created by wind on 2018/12/6.
 * 将yml中每个属性值映射到对象中
 * prefix yml中配置的标识
 */
@Component
//@ConfigurationProperties(prefix = "person")
//@Validated//校验
public class Person {

//    value方式赋值
//    @Value("3")
    private int id;
//    @Value("fafa")
//    @Email //email邮件校验
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
