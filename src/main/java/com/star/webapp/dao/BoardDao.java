package com.star.webapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.star.webapp.mapper.BoardMapper;
import com.star.webapp.model.Board;

@Repository
public class BoardDao implements BoardMapper {
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<Board> myBorders(int user_id) {
        return boardMapper.myBorders(user_id);
    }

    @Override
    public List<Board> likeBoards() {
        return boardMapper.likeBoards();
    }

}
