package com.hyeju.portfolio.domain.repository

import com.hyeju.portfolio.domain.entitiy.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository:JpaRepository<HttpInterface, Long> {

}