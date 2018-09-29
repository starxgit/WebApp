package com.star.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.star.webapp.model.Board;
import com.star.webapp.model.Collection;
import com.star.webapp.service.BoardService;
import com.star.webapp.service.CollectionService;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private BoardService boardService;
    @Autowired
    private CollectionService collectionService;

    /**
     * 获取我的画板列表
     * 
     * @author shaoxin
     * @param user_id
     * @return 包括该画板封面，画板名称，数量
     * */
    @RequestMapping(value = "/myBoardList", method = RequestMethod.GET)
    public void myBoardList(HttpServletResponse response,
            @RequestParam Integer user_id) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        List<Board> boards = new ArrayList<Board>();
        boards = boardService.myBoards(user_id);
        JSONArray jsonArray = JSONArray.fromObject(boards);
        response.getWriter().println(jsonArray.toString());
    }

    /**
     * 获取我的采集列表
     * 
     * @author shaoxin
     * @param user_id
     * @return 包括采集图片，采集名称，作者头像，作者名，所属画板名称
     * */
    @RequestMapping(value = "/myCollectionList", method = RequestMethod.GET)
    public void myCollectionList(HttpServletResponse response,
            @RequestParam Integer user_id) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        List<Collection> collections = new ArrayList<Collection>();
        collections = collectionService.myCollections(user_id);
        JSONArray jsonArray = JSONArray.fromObject(collections);
        response.getWriter().println(jsonArray.toString());
    }

    /**
     * 获取我喜欢的采集列表
     * 
     * @author shaoxin
     * @param user_id
     * @return 包括采集图片，采集名称，作者头像，作者名，所属画板，转采次数，喜欢次数
     * */
    @RequestMapping(value = "/myLikeList", method = RequestMethod.GET)
    public void myLikeList(HttpServletResponse response,
            @RequestParam Integer user_id) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        List<Collection> collections = new ArrayList<Collection>();
        collections = collectionService.otherCollections();
        JSONArray jsonArray = JSONArray.fromObject(collections);
        response.getWriter().println(jsonArray.toString());
    }

    /**
     * 获取我关注内容
     * 
     * @author shaoxin
     * @param user_id
     * @return 包括我的兴趣列表(图片，文字)，画板列表（封面，画板名，作者名） 用户列表（头像，用户名，粉丝数）
     * */
    @RequestMapping(value = "/mySubscribeList", method = RequestMethod.GET)
    public void mySubscribeList(HttpServletResponse response,
            @RequestParam Integer user_id) throws Exception {

    }

    /**
     * 获取我的基本信息
     * 
     * @author shaoxin
     * @param user_id
     * @return 包括该用户用户名，用户头像，粉丝数量，地区，职业，画板数，采集数，喜欢数，关注数
     * */
    @RequestMapping(value = "/baseInfo", method = RequestMethod.GET)
    public void myBaseInfo(HttpServletResponse response,
            @RequestParam Integer user_id) throws Exception {

    }

}
