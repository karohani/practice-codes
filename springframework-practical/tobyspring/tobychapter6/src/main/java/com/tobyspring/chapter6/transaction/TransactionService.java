package com.tobyspring.chapter6.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final PersonRepository personRepository;

    @Transactional
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Transactional(readOnly = true)
    public Person saveReadOnly(Person person) {
        // Update => Exception
        return personRepository.save(person);
    }
    public void allSave() {
        this.save(new Person());
    }
}
