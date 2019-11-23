package com.viagra.design.behavioral.pub_sub.publisher;


import com.viagra.design.behavioral.pub_sub.pubsub.Message;
import com.viagra.design.behavioral.pub_sub.service.PubSubService;

/**
 * @Auther: viagra
 * @Date: 2019/11/23 16:47
 * @Description:
 */

public interface Publisher {
    //Publishes new message to PubSubService
    void publish(Message message, PubSubService pubSubService);
}
