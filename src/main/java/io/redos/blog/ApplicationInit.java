package io.redos.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/11 14:39
 * @copyright ©2018
 */
@Component
public class ApplicationInit implements ApplicationListener<ContextRefreshedEvent>{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        WebApplicationContext webApplicationContext = (WebApplicationContext) applicationContext;
        ServletContext servletContext = webApplicationContext.getServletContext();
        servletContext.setAttribute("value","nihao");
        //菜单数据，用户数据，
    }
}
