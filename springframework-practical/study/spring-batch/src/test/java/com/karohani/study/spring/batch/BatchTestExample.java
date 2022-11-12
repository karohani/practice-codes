package com.karohani.study.spring.batch;

import org.junit.jupiter.api.Test;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBatchTest
public class BatchTestExample {

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test
    public void test() throws Exception {
        jobLauncherTestUtils.launchJob();
    }

}
