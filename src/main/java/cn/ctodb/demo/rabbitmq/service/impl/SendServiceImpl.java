package cn.ctodb.demo.rabbitmq.service.impl;

import cn.ctodb.demo.rabbitmq.service.ISendService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SendServiceImpl implements ISendService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendMsg(String routingkey, String content) {
        rabbitTemplate.convertAndSend(routingkey, content);
    }


}
