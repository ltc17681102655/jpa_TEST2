package provider;

import domain.Event;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 生产者发送消息
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Resource(name = "taskQueue")
    private Queue queue;

    @PostConstruct
    public void test1() {
        this.send();
    }

    public void send() {

        // 发送对象类型的消息
        Event event = new Event(); //实现Serializable接口
        event.setId(1101);
        event.setName("printscreen event");
        event.setCreateTimestamp(System.currentTimeMillis());
        event.setUpdateTimestamp(System.currentTimeMillis());

        System.out.println(queue.getName());
        rabbitTemplate.convertAndSend(queue.getName(), event.toString()); // 队列名称，消息
    }
}
