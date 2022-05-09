package com.cunningbird.sfedu.practice.entity1.service

import com.cunningbird.sfedu.practice.entity1.entity.Entity1
import com.cunningbird.sfedu.practice.entity1.repository.Entity1Repository
import org.springframework.stereotype.Service

@Service
class Entity1Service(
    private val repository: Entity1Repository
) {

    fun index(): List<Entity1> {
        return repository.findAll()
    }

    fun get(id: Long): Entity1 {
        return repository.findById(id).orElseThrow { Exception("Entity not found") }
    }

    fun update(entity: Entity1): Entity1 {
        repository.save(entity)
        return entity
    }

    fun delete(id: Long) {
        val entity = repository.findById(id).orElseThrow { Exception("Entity not found") }
        repository.delete(entity)
    }
}