package cn.ahjz.config;

import cn.ahjz.interceptor.myinterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 扩展springmvc的功能
 * 自定义拦截器配置 shiro
 * Created by wind on 2018/12/5.
 *
 * @Configuration 指明当前类为配置类  相当spring.xml 中的配置文件
 * extends WebMvcConfigurerAdapter 这种方法已经过时
 * 现在都用implements WebMvcConfigurer
 */
@Configuration
//@EnableWebMvc //完全接管springmvc
public class WebAppconfig extends WebMvcConfigurerAdapter {

    //所有的WebMvcConfigurerAdapter都会一起起作用

    /**
     * 设置首页登录
     *
     * @return
     */
    @Bean//必须将组件注册在容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login"); //  urlpath想到与requestmapping 后面相当于方法返回值
                registry.addViewController("/index.html").setViewName("login");
                //防止表单重复提交
                registry.addViewController("/main.html").setViewName("detail");
            }

            public void addInterceptors(InterceptorRegistry registry) {
                /**
                 * 拦截请求和排除指定请求
                 * 静态资源已经默认不拦截
                 */
                registry.addInterceptor(new myinterceptor()).addPathPatterns("/**").excludePathPatterns("/", "/user/login", "/index.html");
////        registry.addInterceptor(new myinterceptor())    //指定拦截器类
////                .addPathPatterns("/**")
////                .excludePathPatterns("/login", "/submitLogin", "/lib/**", "/kindeditor/**")  exclude排除;
//
//    }
            }
        };
        return adapter;
    }


}
