package com.star.webapp.model;

/** 
 * Created By shaoxin On 2018-09-27
 * 兴趣的模型类
 * */
public class News {
    private int news_id;
    private String news_cover;
    private String news_text;
    
    public News() {
        super();
    }

    public News(int news_id, String news_cover, String news_text) {
        super();
        this.news_id = news_id;
        this.news_cover = news_cover;
        this.news_text = news_text;
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public String getNews_cover() {
        return news_cover;
    }

    public void setNews_cover(String news_cover) {
        this.news_cover = news_cover;
    }

    public String getNews_text() {
        return news_text;
    }

    public void setNews_text(String news_text) {
        this.news_text = news_text;
    }

    @Override
    public String toString() {
        return "News [news_id=" + news_id + ", news_cover=" + news_cover
                + ", news_text=" + news_text + "]";
    }
    
}
