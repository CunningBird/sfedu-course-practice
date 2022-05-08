package com.cunningbird.sfedu.practice.entity2.service

import com.cunningbird.sfedu.practice.entity2.entity.Entity2
import com.cunningbird.sfedu.practice.entity2.repository.Entity2Repository
import org.springframework.stereotype.Service

@Service
class Entity2Service(
    private val repository: Entity2Repository
) {

    fun index(): List<Entity2> {
        return repository.findAll()
    }

    fun get(id: Long): Entity2? {
        return repository.findById(id).orElseThrow { Exception("Entity not found") }
    }

    fun update(entity: Entity2): Entity2 {
        repository.save(entity)
        return entity
    }

    fun delete(id: Long) {
        val entity = repository.findById(id).orElseThrow { Exception("Entity not found") }
        repository.delete(entity)
    }
}