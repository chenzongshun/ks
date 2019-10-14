package com.ks.domain.mapper;

import com.ks.domain.entity.Personnel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 考生表
 */
@Repository
public interface PersonnelMapper {
    int delete(Integer id);

    int insert(Personnel personnel);

    int insertDynamic(Personnel personnel);

    int updateDynamic(Personnel personnel);

    int update(Personnel personnel);

    Personnel selectById(Integer id);

    List<Personnel> findPageWithResult(Personnel personnel);

    Integer findPageWithCount(Personnel personnel);
}