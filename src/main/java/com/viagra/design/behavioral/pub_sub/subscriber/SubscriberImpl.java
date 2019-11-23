package com.viagra.design.behavioral.pub_sub.subscriber;


import com.viagra.design.behavioral.pub_sub.service.PubSubService;

/**
 * @Auther: viagra
 * @Date: 2019/11/23 16:49
 * @Description:
 */

public class SubscriberImpl extends Subscriber{
    //Add subscriber with PubSubService for a topic
    public void addSubscriber(String topic, PubSubService pubSubService){
        pubSubService.addSubscriber(topic, this);
    }

    //Unsubscribe subscriber with PubSubService for a topic
    public void unSubscribe(String topic, PubSubService pubSubService){
        pubSubService.removeSubscriber(topic, this);
    }

    //Request specifically for messages related to topic from PubSubService
    public void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService) {
        pubSubService.getMessagesForSubscriberOfTopic(topic, this);

    }
}
