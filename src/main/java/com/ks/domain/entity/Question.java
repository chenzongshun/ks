package com.ks.domain.entity;

import lombok.Data;

/**
 * 问题表
 */
@Data
public class Question {
    /**
     * 题目id
     */
    private Integer id;

    /**
     * 题目
     */
    private String text;

    /**
     * 1选择题2判断题3问答题...待扩展
     */
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}