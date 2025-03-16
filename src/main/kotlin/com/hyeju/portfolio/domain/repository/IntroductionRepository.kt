package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Achievement
import com.hyeju.portfolio.domain.entitiy.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository:JpaRepository<Introduction, Long> {

    //select * from introduction where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean) : List<Introduction>
}