package consume;


import config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收者
 * 2018-3-17 23:18:04
 */
@Component
public class Receiver {

    @RabbitListener(queues = RabbitConfig.QUEUE_NAME) // //监听器监听指定的Queue
    public void receive(String msg) {
        System.out.println("receiver: " + msg);
    }
}
