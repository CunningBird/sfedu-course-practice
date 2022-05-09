package com.cunningbird.sfedu.practice.entity2.controller

import com.cunningbird.sfedu.practice.entity2.entity.Entity2
import com.cunningbird.sfedu.practice.entity2.service.Entity2Service
import org.springframework.web.bind.annotation.*

@RestController
class Entity2Controller(
    private val service: Entity2Service
) {

    @GetMapping
    fun getAll(): List<Entity2> {
        return service.index()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Long): Entity2 {
        return service.get(id)
    }

    @PutMapping
    fun update(@RequestBody entity: Entity2): Entity2 {
        return service.update(entity)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) {
        service.delete(id)
    }
}