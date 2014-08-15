package com.sevenlist.springbootplayground.model

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@ToString(includeFields = true, includeNames = true)
class GreetingMessage {

    @Id
    @GeneratedValue
    private long id

    private String message = 'Hello, World!'
}
