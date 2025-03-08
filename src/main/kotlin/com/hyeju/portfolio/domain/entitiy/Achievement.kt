package com.hyeju.portfolio.domain.entitiy

import jakarta.persistence.*

@Entity
class Achievement : BaseEntity()  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "achievement_id")
    var id: Long? = null

}