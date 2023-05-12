package com.example.wxonlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wxonlineexam.domain.Question;
import com.example.wxonlineexam.service.QuestionService;
import com.example.wxonlineexam.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author hongxiaobin
* @description 针对表【question】的数据库操作Service实现
* @createDate 2023-05-10 15:22:21
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




