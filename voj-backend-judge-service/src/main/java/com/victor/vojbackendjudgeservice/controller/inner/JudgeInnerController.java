package com.victor.vojbackendjudgeservice.controller.inner;



import com.victor.vojbackendjudgeservice.judge.JudgeService;
import com.victor.vojbackendmodel.model.entity.QuestionSubmit;
import com.victor.vojbackendserviceclient.service.JudgeFeignClient;
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
@RestController("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    @Resource
    private JudgeService judgeService;
    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId) {
        return judgeService.doJudge(questionSubmitId);
    };

}
