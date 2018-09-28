package com.star.webapp.model;

/** 
 * Created By shaoxin On 2018-09-27
 * 采集的模型类
 * */
public class Collection {
    private int collection_id;
    private int user_id;
    private String collection_name;
    private int board_id;
    private String collection_image;
    private int re_collection_num;
    private int like_num;
    
    public Collection() {
        super();
    }

    public Collection(int collection_id, int user_id, String collection_name,
            int board_id, String collection_image, int re_collection_num,
            int like_num) {
        super();
        this.collection_id = collection_id;
        this.user_id = user_id;
        this.collection_name = collection_name;
        this.board_id = board_id;
        this.collection_image = collection_image;
        this.re_collection_num = re_collection_num;
        this.like_num = like_num;
    }

    public int getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCollection_name() {
        return collection_name;
    }

    public void setCollection_name(String collection_name) {
        this.collection_name = collection_name;
    }

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public String getCollection_image() {
        return collection_image;
    }

    public void setCollection_image(String collection_image) {
        this.collection_image = collection_image;
    }

    public int getRe_collection_num() {
        return re_collection_num;
    }

    public void setRe_collection_num(int re_collection_num) {
        this.re_collection_num = re_collection_num;
    }

    public int getLike_num() {
        return like_num;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    @Override
    public String toString() {
        return "Collection [collection_id=" + collection_id + ", user_id="
                + user_id + ", collection_name=" + collection_name
                + ", board_id=" + board_id + ", collection_image="
                + collection_image + ", re_collection_num=" + re_collection_num
                + ", like_num=" + like_num + "]";
    }
    
}