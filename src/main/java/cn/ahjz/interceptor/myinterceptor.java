package cn.ahjz.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wind on 2018/12/5.
 */
public class myinterceptor implements HandlerInterceptor {

    /**
     * 开始进入登录请求地址拦截
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String test = request.getParameter("firstname");
//        System.out.println(test);

        Object user = request.getSession().getAttribute("username");

        if (user == null) {
            //未登录 拦截请求
            request.getRequestDispatcher("/").forward(request, response);
            return false;
        } else

        {//已登录 放行请求
            return true;
        }


        //返回值为trun 才放行

    }

    /**
     * 处理请求完成后的处理操作
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("处理请求完成后的处理操作");
    }

    /**
     * 视图渲染之后的操作
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("视图渲染之后的操作");
    }
}
