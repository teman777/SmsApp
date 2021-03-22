package com.artemvoronov.SmsApp.repository;

import com.artemvoronov.SmsApp.pojo.MessageJ;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<MessageJ, Integer> {

    List<MessageJ> findByCreatedDate(LocalDate date);

    //List<MessageJ> findBy

}
