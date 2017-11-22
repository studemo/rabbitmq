package cn.ctodb.demo.rabbitmq.test;

import cn.ctodb.demo.rabbitmq.Application;
import cn.ctodb.demo.rabbitmq.service.ISendService;
import com.rabbitmq.client.Channel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class JUnitTest {

    @Autowired
    private ISendService sendService;

    @Test
    public void send() {
        sendService.sendMsg("topic.message", "test3");
    }

}
