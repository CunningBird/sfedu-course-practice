package com.cunningbird.sfedu.practice.entity1.repository

import com.cunningbird.sfedu.practice.entity1.entity.Entity1
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Entity1Repository : JpaRepository<Entity1, Long> {
}