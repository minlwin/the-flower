package com.jdc.flower.repo;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

import com.jdc.flower.base.BaseRepository;

public interface ProductRepo extends BaseRepository<Producer, Integer>{

}
