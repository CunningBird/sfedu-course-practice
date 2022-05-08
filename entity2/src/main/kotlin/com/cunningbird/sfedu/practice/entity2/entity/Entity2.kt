package com.cunningbird.sfedu.practice.entity2.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Entity2(
    @Id
    val id: Long? = null,

    val email: String? = null,
    val password: String? = null,

    val firstName: String? = null,
    val secondName: String? = null,
)
