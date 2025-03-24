package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime


interface HttpInterfaceRepository:JpaRepository<HttpInterface, Long> {

    //select * from introduction where is_active = :isActive
    fun countAllByCreatedDateTimeBetween(start: LocalDateTime, end:LocalDateTime) :Long
}