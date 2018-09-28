package com.star.webapp.mapper;

import java.util.List;

import com.star.webapp.model.Board;

public interface BoardMapper {
    public List<Board> myBorders(int user_id);
    public List<Board> likeBoards();
}
