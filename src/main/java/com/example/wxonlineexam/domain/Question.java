package com.example.wxonlineexam.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author hongxiaobin
 * @TableName question
 */
@TableName(value = "question")
@Data
public class Question {
    /**
     *
     */
    @TableField(value = "qbid")
    private String qbid;

    /**
     *
     */
    @TableField(value = "qid")
    private String qid;

    /**
     *
     */
    @TableField(value = "content")
    private String content;

    /**
     *
     */
    @TableField(value = "options")
    private String options;

    /**
     *
     */
    @TableField(value = "answers")
    private String answers;

    /**
     *
     */
    @TableField(value = "type")
    private String type;

    @Override
    public String toString() {
        return "Question{" +
                "qbid='" + qbid + '\'' +
                ", qid='" + qid + '\'' +
                ", content='" + content + '\'' +
                ", options='" + options + '\'' +
                ", answers='" + answers + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}