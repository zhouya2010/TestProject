package com.sidu.dao;

import com.sidu.domain.Station;

public interface StationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
}