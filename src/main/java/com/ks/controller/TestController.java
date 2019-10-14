package com.ks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "/test")
@Controller
public class TestController {

    /**
     * 根据系统名称获取系统配置数据
     *
     * @param systemName 系统名称
     * @return RMap
     */
    @RequestMapping(value = "/index")
    @ResponseBody
    public String getCfgSysBySystemName(String systemName) {
        return "Hello World！";
    }
}
