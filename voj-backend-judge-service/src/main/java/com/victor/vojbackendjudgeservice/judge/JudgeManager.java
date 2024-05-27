package com.victor.vojbackendjudgeservice.judge;

import com.victor.vojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.victor.vojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.victor.vojbackendjudgeservice.judge.strategy.JudgeContext;
import com.victor.vojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.victor.vojbackendmodel.model.codesandbox.JudgeInfo;
import com.victor.vojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
