package com.star.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.star.webapp.dao.UserDao;
import com.star.webapp.model.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public void getUsers(HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=utf-8");
//        JSONArray jsonArray = new JSONArray();
        List<UserInfo> users = userDao.getUsers();
        response.getWriter().println(users.toString());
    }

}