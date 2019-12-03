package com.ensk.demo.rocket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerServiceTest {

    @Autowired
    private Producer producer;

    @Test
    public void contextLoads() {
        boolean result = producer.send("EnskDefaultTopic", "Ensk-Tag-1", "Hello RocketMQ");
        assertTrue(result);
    }
}