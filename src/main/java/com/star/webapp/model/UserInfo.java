package com.star.webapp.model;
/** 
 * Created By shaoxin On 2018-09-27
 * 用户信息的模型类
 * */
public class UserInfo {
    
    private int user_id;
    private String nick_name;
    private String avatar;
    private String city;
    private String job;
    private int fans_num;   // 粉丝数
    private int board_num; //画板数
    private int collection_num;
    private int like_num;
    private int subscribe_num;
    
    /**
     * 必须要无参构造方法
     * */
    public UserInfo() {
        super();
    }
    public UserInfo(int user_id, String nick_name, String avatar, String city,
            String job, int fans_num, int board_num, int collection_num,
            int like_num, int subscribe_num) {
        super();
        this.user_id = user_id;
        this.nick_name = nick_name;
        this.avatar = avatar;
        this.city = city;
        this.job = job;
        this.fans_num = fans_num;
        this.board_num = board_num;
        this.collection_num = collection_num;
        this.like_num = like_num;
        this.subscribe_num = subscribe_num;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getNick_name() {
        return nick_name;
    }
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getFans_num() {
        return fans_num;
    }
    public void setFans_num(int fans_num) {
        this.fans_num = fans_num;
    }
    public int getBoard_num() {
        return board_num;
    }
    public void setBoard_num(int board_num) {
        this.board_num = board_num;
    }
    public int getCollection_num() {
        return collection_num;
    }
    public void setCollection_num(int collection_num) {
        this.collection_num = collection_num;
    }
    public int getLike_num() {
        return like_num;
    }
    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }
    public int getSubscribe_num() {
        return subscribe_num;
    }
    public void setSubscribe_num(int subscribe_num) {
        this.subscribe_num = subscribe_num;
    }
    @Override
    public String toString() {
        return "UserInfo [user_id=" + user_id + ", nick_name=" + nick_name
                + ", avatar=" + avatar + ", city=" + city + ", job=" + job
                + ", fans_num=" + fans_num + ", board_num=" + board_num
                + ", collection_num=" + collection_num + ", like_num="
                + like_num + ", subscribe_num=" + subscribe_num + "]";
    }
    
}
