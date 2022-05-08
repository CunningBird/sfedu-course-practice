package com.cunningbird.sfedu.practice.entity2.repository

import com.cunningbird.sfedu.practice.entity2.entity.Entity2
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Entity2Repository : JpaRepository<Entity2, Long> {
}