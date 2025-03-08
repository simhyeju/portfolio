package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository:JpaRepository<Achievement, Long> {

}