package com.ks.controller;

import com.ks.domain.entity.Personnel;
import com.ks.service.impl.PersonnelService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "/test")
@Controller
public class TestController {

    @Autowired
    PersonnelService personnelService;

    /**
     * 根据系统名称获取系统配置数据
     *
     * @param id 考生id
     * @return RMap
     */
    @RequestMapping("/index/{id}")
    @ResponseBody
    public Personnel getCfgSysBySystemName(@PathVariable("id") Integer id) {
        return personnelService.selectById(id);
    }
}
