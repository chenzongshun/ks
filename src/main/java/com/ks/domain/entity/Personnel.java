package com.ks.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * 考生表
 */
@Data
public class Personnel {
    private Integer id;

    /**
     * 考生姓名
     */
    private String name;

    /**
     * 考生点完开始做题的时间
     */
    private Date starttime;

    /**
     * 考生点完提交的时间
     */
    private Date endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}