package com.star.webapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.star.webapp.mapper.CollectionMapper;
import com.star.webapp.model.Collection;

@Repository
public class CollectionDao implements CollectionMapper {
    @Autowired
    private CollectionMapper collectionMapper;

    @Override
    public List<Collection> findMyCollections(int user_id) {
        return collectionMapper.findMyCollections(user_id);
    }

    @Override
    public List<Collection> findOtherCollections() {
        return collectionMapper.findOtherCollections();
    }

}
