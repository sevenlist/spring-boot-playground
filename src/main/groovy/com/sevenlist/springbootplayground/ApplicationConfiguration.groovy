package com.sevenlist.springbootplayground

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.AdviceMode
import org.springframework.context.annotation.ComponentScan
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableAutoConfiguration
@ComponentScan
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
class ApplicationConfiguration {
}
