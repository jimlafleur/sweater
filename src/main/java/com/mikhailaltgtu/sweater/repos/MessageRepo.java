package com.mikhailaltgtu.sweater.repos;

import com.mikhailaltgtu.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {



}
