package com.sidu.mq;

import org.springframework.stereotype.Component;

/**
 * Created by junjun on 2017/2/14.
 */

@Component
public class RabbitMqReceive {

//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(value = "myQueue", durable = "true"),
//            exchange = @Exchange(value = "amq.fanout",ignoreDeclarationExceptions = "true"),
//            key = "zyKey")
//    )
//    public void user(@Payload User user){
//        System.out.println("Username ===> " + user.getUsername());
////        System.out.println("Email ===> " + user.getEmail());
//    }

//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(value = "myQueue", durable = "true"),
//            exchange = @Exchange(value = "amq.direct",ignoreDeclarationExceptions = "true"),
//            key = "zyKey")
//    )
//    public void user2(Message message) throws UnsupportedEncodingException {
////        System.out.println("Username ===> " + user.getUsername());
////        System.out.println("Email ===> " + user.getEmail());
//       String s =  new String(message.getBody(), "UTF-8");
//        System.out.println("message #### " + s);
//    }

}
