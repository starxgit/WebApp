package com.star.webapp.mapper;

import java.util.List;

import com.star.webapp.model.Collection;

public interface CollectionMapper {
       public List<Collection> findMyCollections(int user_id);
       public List<Collection> findOtherCollections();
}
