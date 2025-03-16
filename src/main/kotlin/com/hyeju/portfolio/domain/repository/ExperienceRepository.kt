package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Experience
import com.hyeju.portfolio.domain.entitiy.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository:JpaRepository<Experience, Long> {

    fun findAllByIsActive(isActive: Boolean) : List<Experience>

}