package com.tobyspring.chapter6.transaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.TransientDataAccessResourceException;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class TransactionTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void TRNASACTION() {
        Person save = transactionService.save(new Person());
    }

    @Test
    public void readOnlyTransaction에_저장하면_예외를_던진다() {
        /*
            H2에서는 실패한다 Mysql에서는 정상작동
         */
        Assertions.assertThrows(
                TransientDataAccessResourceException.class
                ,() -> transactionService.saveReadOnly(new Person())
        );

    }
}
