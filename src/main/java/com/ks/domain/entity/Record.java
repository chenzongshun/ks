package com.ks.domain.entity;

import lombok.Data;

/**
 * 答题记录表
 */
@Data
public class Record {

    /**
     * 选择答案分隔符
     */
    public final static String SPLIT = "<`split`>";

    private Integer id;

    /**
     * 关联考生id
     */
    private Integer pid;

    /**
     * 关联题目id
     */
    private Integer qid;

    /**
     * 答案，用<`split`>分割
     */
    private String sid;

    /**
     * 所属考生
     */
    private Personnel personnel;

    /**
     * 所属题目
     */
    private Question question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}