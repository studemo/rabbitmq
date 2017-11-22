package cn.ctodb.demo.rabbitmq.service;

public interface ISendService {

    void sendMsg(String routingkey, String content);

}
