package com.star.webapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.star.webapp.dao.BoardDao;
import com.star.webapp.model.Board;

@Repository
public class BoardService {
    @Autowired
    private BoardDao boardDao;

    /**
     * 获取我的画板列表的方法
     * 
     * @author shaoxin
     * @param user_id
     * @return List<Boards> 画板列表
     * */
    public List<Board> myBoards(int user_id) {
        List<Board> boards = new ArrayList<Board>();
        boards = boardDao.myBorders(user_id);
        return boards;
    }
    
}
