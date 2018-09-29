package com.star.webapp.service;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.star.webapp.dao.BoardDao;
import com.star.webapp.dao.UserDao;
import com.star.webapp.model.Board;
import com.star.webapp.model.News;
import com.star.webapp.model.UserInfo;

@Repository
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private BoardDao boardDao;

    /**
     * 获取我的主页信息的方法
     * 
     * @author shaoxin
     * @param user_id
     * */
    public JSONObject myInfo(int user_id) {
        JSONObject jsonObject = new JSONObject();
        List<UserInfo> users = new ArrayList<UserInfo>();
        users = userDao.getUsers();
        List<News> news = new ArrayList<News>();
        news = userDao.FindAllNews();
        List<Board> boards = new ArrayList<Board>();
        boards = boardDao.likeBoards();
        JSONArray otherUsers = JSONArray.fromObject(users);
        JSONArray interests = JSONArray.fromObject(news);
        JSONArray likeBoards = JSONArray.fromObject(boards);
        jsonObject.put("otherUsers", otherUsers);
        jsonObject.put("interests", interests);
        jsonObject.put("likeBoards", likeBoards);
        return jsonObject;
    }

    /**
     * 获取我的基本信息的方法
     * 
     * @author shaoxin
     * @param user_id
     * */
    public JSONObject myBaseInfo(int user_id) {
        JSONObject jsonObject = new JSONObject();
        UserInfo userInfo = new UserInfo();
        userInfo=userDao.myUserInfo(user_id);
        jsonObject = JSONObject.fromObject(userInfo);
        return jsonObject;
    }

}
