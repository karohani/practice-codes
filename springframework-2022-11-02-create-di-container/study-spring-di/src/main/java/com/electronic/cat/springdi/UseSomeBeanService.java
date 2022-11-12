package com.electronic.cat.springdi;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.processing.Generated;
import java.util.Optional;

@Component
public class UseSomeBeanService {

    private SomeBean someBean; // field명에 set

    // 여기를 자동생성해줍니다.
    // SomeBean이 없으면 Application이 안 뜸
//    @Autowired(required = false)
    // lombok의 @RequiredArgsConstructor
    // field선언은 왠마하면 final로 한다.
//    public UseSomeBeanService(@Nullable SomeBean someBean) {
//        this.someBean = someBean;
//        System.out.println("!!!!!!!!!!! UseSomeBean Called !!!!!!!!!!!!!!!!!");
//        System.out.println("!!!!!!!!!!! some bean : [" + someBean + "] !!!!!!!!!!!!!!!!!");
//    }
    @PostConstruct
    public void init() {
        System.out.println("!!!!!!!!!!! UseSomeBean Called !!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!! some bean : [" + someBean + "] !!!!!!!!!!!!!!!!!");
    }

//    @Autowired
//    public void setSomeBean(Optional<SomeBean> someBean) {
//
//        System.out.println("!!!!!!!!!!! UseSomeBean Called !!!!!!!!!!!!!!!!!");
//        System.out.println("!!!!!!!!!!! some bean : [" + someBean + "] !!!!!!!!!!!!!!!!!");
//    }
}
