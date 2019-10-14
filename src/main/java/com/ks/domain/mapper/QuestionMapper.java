package com.ks.domain.mapper;

import com.ks.domain.entity.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 问题表
 */
@Repository
public interface QuestionMapper {
    int delete(Integer id);

    int insert(Question question);

    int insertDynamic(Question question);

    int updateDynamic(Question question);

    int update(Question question);

    Question selectById(Integer id);

    List<Question> findPageWithResult(Question question);

    Integer findPageWithCount(Question question);
}