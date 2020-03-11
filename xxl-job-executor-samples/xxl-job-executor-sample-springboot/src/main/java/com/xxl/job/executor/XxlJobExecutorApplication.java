package com.xxl.job.executor;

import com.xxl.job.core.executor.XxlJobExecutor;
import com.xxl.job.executor.service.jobhandler.DemoJobHandler;
import com.xxl.job.executor.service.jobhandler.SampleXxlJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
public class XxlJobExecutorApplication {

    public static void main(String[] args) throws Exception {
        XxlJobExecutor exe = new XxlJobExecutor();
        exe.setPort(9999);
        exe.setAppName("testmain");
        exe.setAdminAddresses("http://127.0.0.1:9998/xxl-job-admin");
        exe.setLogPath("/data/testmain");
        XxlJobExecutor.registJobHandler("demoJobHandler1", new DemoJobHandler());
        exe.start();
        Thread.sleep(1000000000);
//		SpringApplication.run(XxlJobExecutorApplication.class, args);
    }

}