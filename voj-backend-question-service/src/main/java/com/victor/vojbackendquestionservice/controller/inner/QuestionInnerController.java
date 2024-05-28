package com.victor.vojbackendquestionservice.controller.inner;


import com.victor.vojbackendmodel.model.entity.Question;
import com.victor.vojbackendmodel.model.entity.QuestionSubmit;
import com.victor.vojbackendquestionservice.service.QuestionService;
import com.victor.vojbackendquestionservice.service.QuestionSubmitService;
import com.victor.vojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*
 *Author：Victor_htq
 *Package：com.victor.vojbackenduserservice.controller.inner
 *Project：voj-backend-microservice
 *name：UserInnerController
 *Date：2024/5/28  15:03
 *Filename：UserInnerController
 */
@RestController()
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;
    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    };
    @Override
    @GetMapping("question_submit/get/id")
    public QuestionSubmit getQuestionSumbitById(@RequestParam("questionSubmitId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    };
    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    };

}
