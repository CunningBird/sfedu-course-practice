package com.cunningbird.sfedu.practice.client

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GatewayClientTest {

    @Autowired
    private lateinit var client: GatewayClient

    @Test
    fun testGetAll() {
        val entity1List = client.getAllEntity1()
        val entity2List = client.getAllEntity2()

        Assertions.assertEquals(listOf<Entity1Dto>(), entity1List)
        Assertions.assertEquals(listOf<Entity1Dto>(), entity2List)
    }
}