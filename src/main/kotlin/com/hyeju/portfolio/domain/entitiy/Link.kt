package com.hyeju.portfolio.domain.entitiy

import jakarta.persistence.*

@Entity
class Link : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    //?물음표는 null을 허용한다.
    var id: Long? =null
}