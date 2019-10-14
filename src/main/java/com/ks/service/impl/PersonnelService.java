package com.ks.service.impl;

import com.ks.domain.entity.Personnel;
import lombok.Data;

import java.util.Date;

/**
 * 考生表
 */
public interface PersonnelService {

    Personnel selectById(Integer id);
}