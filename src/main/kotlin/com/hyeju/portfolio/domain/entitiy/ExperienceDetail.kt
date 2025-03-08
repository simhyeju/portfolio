package com.hyeju.portfolio.domain.entitiy

import jakarta.persistence.*

@Entity
class ExperienceDetail : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    //?물음표는 null을 허용한다.
    var id: Long? =null
}