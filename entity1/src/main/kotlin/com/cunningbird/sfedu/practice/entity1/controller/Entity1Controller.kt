package com.cunningbird.sfedu.practice.entity1.controller

import com.cunningbird.sfedu.practice.entity1.entity.Entity1
import com.cunningbird.sfedu.practice.entity1.service.Entity1Service
import org.springframework.web.bind.annotation.*

@RestController
class Entity1Controller(
    private val service: Entity1Service
) {

    @GetMapping
    fun getAll(): List<Entity1> {
        return service.index()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Long): Entity1 {
        return service.get(id)
    }

    @PutMapping
    fun update(@RequestBody entity: Entity1): Entity1 {
        return service.update(entity)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) {
        service.delete(id)
    }
}