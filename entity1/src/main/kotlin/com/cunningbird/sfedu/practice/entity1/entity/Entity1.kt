package com.cunningbird.sfedu.practice.entity1.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Entity1(
    @Id
    val id: Long? = null,

    val title: String? = null,
    val price: Double? = null
)
