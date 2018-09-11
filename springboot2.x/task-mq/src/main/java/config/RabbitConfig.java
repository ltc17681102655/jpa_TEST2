package config;

/**
 * 创建配置类：
 * 用来配置队列、交换器、路由等高级信息
 * 2018-3-19 10:17:29
 */

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String QUEUE_NAME = "task-queue mytest 2018-6-20";

    @Bean(name = "taskQueue")
    public Queue queue() {
        return new Queue(RabbitConfig.QUEUE_NAME);
    }
}
