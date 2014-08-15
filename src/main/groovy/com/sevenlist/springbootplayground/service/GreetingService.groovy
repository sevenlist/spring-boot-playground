package com.sevenlist.springbootplayground.service

import com.sevenlist.springbootplayground.model.GreetingMessage
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Service
class GreetingService {

    @PersistenceContext
    private EntityManager entityManager

    @Transactional
    String greet() {
        def msg = new GreetingMessage()
        entityManager.persist(msg)
        msg.message
    }
}
