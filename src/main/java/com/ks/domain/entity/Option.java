package com.ks.domain.entity;

import lombok.Data;

/**
 * 选项表
 */
@Data
public class Option {
    private Integer id;

    /**
     * 所属问题
     */
    private Integer qid;

    /**
     * 选项的显示文本
     */
    private String text;

    /**
     * 0不正确1正确...
     */
    private Integer answer;

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

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }
}