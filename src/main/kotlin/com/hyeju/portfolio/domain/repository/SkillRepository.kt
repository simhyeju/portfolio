package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository:JpaRepository<Skill, Long> {

}