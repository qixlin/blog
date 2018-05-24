package io.redos.blog.controller;

import io.redos.blog.dao.CodeMapper;
import io.redos.blog.model.Code;
import io.redos.blog.model.TypeEnum;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @RequestMapping("/a")
    public String getMain(){
        return "index";
    }

    @RequestMapping(value = {"/","","/page"})
    public String mainPage(HttpServletRequest context){
        return "chopstack";
//        return context.getServletContext().getAttribute("value").toString();
    }
    @RequestMapping(value = {"/archive"})
    public String archivePage(HttpServletRequest context){
        return "archive";
    }

    @RequestMapping(value = {"/post"})
    public String postPage(HttpServletRequest context){
        return "post";
    }
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        SqlSession s = sqlSessionFactory.openSession();
        CodeMapper cm = s.getMapper(CodeMapper.class);
        Code code = new Code();
        code.setField("123");
        code.setName("一二三");
        code.setType(TypeEnum.GLOABLE_CONFIG);
        code.setValue("123yiersan");
        int i =  cm.addCode(code);
        s.commit();
        s.close();
        return i+"";
    }
}
