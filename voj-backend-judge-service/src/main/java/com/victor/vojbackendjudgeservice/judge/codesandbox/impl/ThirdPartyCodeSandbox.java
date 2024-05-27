package com.victor.vojbackendjudgeservice.judge.codesandbox.impl;


import com.victor.vojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.victor.vojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.victor.vojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
