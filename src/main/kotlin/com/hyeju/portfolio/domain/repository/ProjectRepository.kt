package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository:JpaRepository<Project, Long> {

}