package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository:JpaRepository<Link, Long> {

}