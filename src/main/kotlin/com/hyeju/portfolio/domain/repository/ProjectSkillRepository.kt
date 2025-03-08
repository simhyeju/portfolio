package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository:JpaRepository<ProjectSkill, Long> {

}