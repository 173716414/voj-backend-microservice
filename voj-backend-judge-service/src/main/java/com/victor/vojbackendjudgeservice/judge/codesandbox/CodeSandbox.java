package com.victor.vojbackendjudgeservice.judge.codesandbox;


import com.victor.vojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.victor.vojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
