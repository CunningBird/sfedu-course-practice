package com.cunningbird.sfedu.practice.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.*

@FeignClient(value = "gateway", url = "http://localhost:8079/")
interface GatewayClient {

    @GetMapping("/entity1")
    fun getAllEntity1(): List<Entity1Dto>

    @GetMapping("/entity1/{id}")
    fun getEntity1(@PathVariable("id") id: Long)

    @PutMapping("/entity1")
    fun updateEntity1(@RequestBody entity: Entity1Dto): Entity1Dto

    @DeleteMapping("/{id}")
    fun deleteEntity1(@PathVariable("id") id: Long)

    @GetMapping("/entity2")
    fun getAllEntity2(): List<Entity2Dto>

    @GetMapping("/entity2/{id}")
    fun getEntity2(@PathVariable("id") id: Long)

    @PutMapping("/entity2")
    fun updateEntity2(@RequestBody entity: Entity2Dto): Entity2Dto

    @DeleteMapping("/{id}")
    fun deleteEntity2(@PathVariable("id") id: Long)
}