package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Project
import com.hyeju.portfolio.domain.entitiy.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectSkillRepository:JpaRepository<ProjectSkill, Long> {

    //select * from project_skill where project_id = :project_id and skill_id = :skill_id
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): Optional<ProjectSkill>

}