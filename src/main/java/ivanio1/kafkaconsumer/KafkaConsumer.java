package ivanio1.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "my_consumer")
    public void listen(String message) {
        System.out.println("Recieved message = " + message);
    }
}
