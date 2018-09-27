package com.star.webapp.model;

/** 
 * Created By shaoxin On 2018-09-27
 * 画板的模型类
 * */
public class Board {
    private int board_id;
    private int user_id;
    private int board_num;
    private String board_name;
    private String board_cover;
    
    public Board(int board_id, int user_id, int board_num, String board_name,
            String board_cover) {
        super();
        this.board_id = board_id;
        this.user_id = user_id;
        this.board_num = board_num;
        this.board_name = board_name;
        this.board_cover = board_cover;
    }

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBoard_num() {
        return board_num;
    }

    public void setBoard_num(int board_num) {
        this.board_num = board_num;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }

    public String getBoard_cover() {
        return board_cover;
    }

    public void setBoard_cover(String board_cover) {
        this.board_cover = board_cover;
    }

    @Override
    public String toString() {
        return "Board [board_id=" + board_id + ", user_id=" + user_id
                + ", board_num=" + board_num + ", board_name=" + board_name
                + ", board_cover=" + board_cover + "]";
    }
    
}
