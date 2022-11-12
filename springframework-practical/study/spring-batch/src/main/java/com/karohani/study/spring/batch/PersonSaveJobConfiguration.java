package com.karohani.study.spring.batch;

import com.karohani.study.spring.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.*;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;


@Configuration
@RequiredArgsConstructor
public class PersonSaveJobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;

    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job testJob() {
        return jobBuilderFactory.get("TEST_JOB")
                .start(myTestStep())
                .build();
    }

    @Bean
    public Step myTestStep() {
        return stepBuilderFactory.get("TEST_STEP")
                .chunk(1)
                .reader(myItemReader())
                .processor(new ItemProcessor<Object, Object>() {
                    @Override
                    public Object process(Object item) throws Exception {
                        System.out.println("PROCESSOR");
                        return null;
                    }
                })
                .writer(new ItemWriter<Object>() {
                    @Override
                    public void write(List<?> items) throws Exception {
                        System.out.println("Writer");
                    }
                })
                .build();
    }

    @Bean
    public ListItemReader<User> myItemReader() {
        return new ListItemReader<User>(Arrays.asList(new User("테스트유저", 10), new User("테스트유저", 20)));
    }

}
