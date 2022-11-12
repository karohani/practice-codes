package com.tobyspring.chapter6.service;

import com.tobyspring.chapter6.aop.annotation.VisionSpringAnnotation;
import org.springframework.stereotype.Service;

@Service
public class CustomAnnotationService {

    @VisionSpringAnnotation // <-- Cache Annotation ?
    // @Cacheable
    public void save() {
        System.out.println( "CALL SAVE" );
        // DB에서 데이터를 가져오고 
        // 1분짜리 연산을 하고 
        // 다시 그 데이터를 반홚
    }
}
