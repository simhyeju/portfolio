package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectRepository:JpaRepository<Project, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Project>

}