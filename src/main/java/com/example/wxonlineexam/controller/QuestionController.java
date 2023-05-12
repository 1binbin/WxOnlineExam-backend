package com.example.wxonlineexam.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.wxonlineexam.domain.Question;
import com.example.wxonlineexam.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author hongxiaobin
 * @Time 2023/4/30 0030-18:20:00
 */
@RestController
@RequestMapping("/")
public class QuestionController {
    @Resource
    QuestionService questionService;

    @GetMapping("/questions")
    public String getQuestions(@RequestParam(value = "qbid", required = false) String qbid) {
        QueryWrapper<Question> questionQueryWrapper = new QueryWrapper<>();
        questionQueryWrapper.eq("qbid", qbid);
        List<Question> questions = questionService.list(questionQueryWrapper);
        return JSONObject.toJSONString(questions);
    }
}
