package com.viagra.design.behavioral.pub_sub.publisher;


import com.viagra.design.behavioral.pub_sub.pubsub.Message;
import com.viagra.design.behavioral.pub_sub.service.PubSubService;

/**
 * @Auther: viagra
 * @Date: 2019/11/23 16:48
 * @Description:
 */

public class PublisherImpl implements Publisher {
    //Publishes new message to PubSubService
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}