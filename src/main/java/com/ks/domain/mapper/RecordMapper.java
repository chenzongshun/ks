package com.ks.domain.mapper;

import com.ks.domain.entity.Record;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 答题记录
 * @author shun
 */
@Repository
public interface RecordMapper {
    int delete(Integer id);

    int insert(Record record);

    int insertDynamic(Record record);

    int updateDynamic(Record record);

    int update(Record record);

    Record selectById(Integer id);

    List<Record> findPageWithResult(Record record);

    Integer findPageWithCount(Record record);
}