package com.star.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.star.webapp.dao.BoardDao;
import com.star.webapp.dao.UserDao;
import com.star.webapp.model.Board;
import com.star.webapp.model.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private BoardDao boardDao;

    /**
     * 获取我关注的用户列表
     * 包括该用户用户名，用户头像，粉丝数量
     * */
    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public void getUsers(HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        JSONArray jsonArray = new JSONArray();
        List<UserInfo> users = userDao.getUsers();
        jsonArray = JSONArray.fromObject(users);
        response.getWriter().println(jsonArray.toString());
    }
    
    /**
     * 获取我的基本信息
     * 包括我的用户名，用户头像，粉丝数量，所在地区，职业，画板数量，采集数量，喜欢数量，关注数量
     * */
    @RequestMapping(value = "/myUserInfo", method = RequestMethod.GET)
    public void myUserInfo(HttpServletResponse response,
            @RequestParam Integer user_id) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        UserInfo userInfo = userDao.myUserInfo(user_id);
        JSONObject jsonObject = JSONObject.fromObject(userInfo);
        response.getWriter().println(jsonObject.toString());
    }
    
    /**
     * 获取我的画板
     * 包括该用户用户名，用户头像，粉丝数量
     * */
    @RequestMapping(value = "/myBoards", method = RequestMethod.GET)
    public void myBoards(HttpServletResponse response,
            @RequestParam Integer user_id) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        List<Board> myBoards = boardDao.myBorders(user_id);
        JSONArray jsonArray = JSONArray.fromObject(myBoards);
        response.getWriter().println(jsonArray.toString());
    }

}
