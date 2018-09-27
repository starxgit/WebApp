package com.star.webapp.controller;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("index")
    public void index(HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        System.out.println("访问到了");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "shaoxin");
        jsonObject.put("age", 22);
        response.getWriter().println(jsonObject.toString());
    }
}