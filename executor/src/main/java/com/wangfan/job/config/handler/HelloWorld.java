package com.wangfan.job.config.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHander;
import org.springframework.stereotype.Component;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/3/10 16:01
 */
@Component
@JobHander(value = "helloWorld")
public class HelloWorld extends IJobHandler {

    @Override
    public ReturnT<String> execute(String... strings) throws Exception {
        System.out.println("你好呀");
        return ReturnT.SUCCESS;
    }
}