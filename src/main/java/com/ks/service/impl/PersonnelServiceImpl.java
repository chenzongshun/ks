package com.ks.service.impl;

import com.ks.domain.entity.Personnel;
import com.ks.domain.mapper.PersonnelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelServiceImpl implements PersonnelService {

    @Autowired
    PersonnelMapper personnelMapper;

    @Override
    public Personnel selectById(Integer id) {
        return personnelMapper.selectById(id);
    }
}
