package com.star.webapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.star.webapp.dao.CollectionDao;
import com.star.webapp.model.Collection;

@Repository
public class CollectionService {
    @Autowired
    private CollectionDao collectionDao;

    /**
     * 获取我的采集列表的方法
     * 
     * @author shaoxin
     * @param user_id
     * @return List<Collections> 采集列表
     * */
    public List<Collection> myCollections(int user_id) {
        List<Collection> collections = new ArrayList<Collection>();
        collections = collectionDao.findMyCollections(user_id);
        return collections;
    }

    /**
     * 获取我的喜欢列表的方法
     * 
     * @author shaoxin
     * @return List<Collections> 采集列表
     * */
    public List<Collection> otherCollections() {
        List<Collection> collections = new ArrayList<Collection>();
        collections = collectionDao.findOtherCollections();
        return collections;
    }
}
