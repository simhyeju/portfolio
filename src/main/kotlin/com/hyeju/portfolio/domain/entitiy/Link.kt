package com.hyeju.portfolio.domain.entitiy

import jakarta.persistence.*

@Entity
class Link(
    name: String,
    content: String,
    isActive: Boolean
) : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    //?물음표는 null을 허용한다.
    var id: Long? =null

    var name: String = name

    var content: String = content

    var isActive : Boolean =isActive


}