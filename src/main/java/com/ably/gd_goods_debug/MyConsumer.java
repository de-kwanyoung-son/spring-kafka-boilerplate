package com.ably.gd_goods_debug;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {
    private final KafkaTemplate<GenericRecord, GenericRecord> kafkaTemplate;

    public MyConsumer(KafkaTemplate<GenericRecord, GenericRecord> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "my-consume-topic")
    public void consumeMessage(ConsumerRecord<GenericRecord, GenericRecord> record) {
        // Consumer code here!
        kafkaTemplate.send("my-produce-topic", record.key(), record.value());   // produce
    }

}
