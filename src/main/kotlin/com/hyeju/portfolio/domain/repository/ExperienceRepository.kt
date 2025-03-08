package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository:JpaRepository<Experience, Long> {

}