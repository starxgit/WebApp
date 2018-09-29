package com.star.webapp.model;

/**
 * Created By shaoxin On 2018-09-27 采集的模型类
 * */
public class Collection {
    private int collection_id;
    private String collection_name;
    private String collection_image;
    private int re_collection_num;
    private int like_num;
    private String avatar;
    private String nick_name;
    private String board_name;

    public Collection() {
        super();
    }

    public int getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public String getCollection_name() {
        return collection_name;
    }

    public void setCollection_name(String collection_name) {
        this.collection_name = collection_name;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }

    @Override
    public String toString() {
        return "Collection [collection_id=" + collection_id
                + ", collection_name=" + collection_name
                + ", collection_image=" + collection_image
                + ", re_collection_num=" + re_collection_num + ", like_num="
                + like_num + ", avatar=" + avatar + ", nick_name=" + nick_name
                + ", board_name=" + board_name + "]";
    }

}