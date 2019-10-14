package com.ks.domain.mapper;

import com.ks.domain.entity.Option;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 选项表
 */
@Repository
public interface OptionMapper {
    int delete(Integer id);

    int insert(Option option);

    int insertDynamic(Option option);

    int updateDynamic(Option option);

    int update(Option option);

    Option selectById(Integer id);

    List<Option> findPageWithResult(Option option);

    Integer findPageWithCount(Option option);
}