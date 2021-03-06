package com.example.li.springboot_filter_interceptor_demo.filter.method1;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Li
 * @date 2019/4/5-20:54
 * 过滤器一定要继承Filter
 */
public class MyFilter3 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*省略过滤方法*/

        //放行前
        System.out.println("方法1 放行前 过滤器3-----------------------");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
        //放行后
        System.out.println("方法1 放行后 过滤器3-----------------------");
    }

    @Override
    public void destroy() {

    }
}
