package com.artemvoronov.SmsApp.repository;

import com.artemvoronov.SmsApp.pojo.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findByDate(LocalDate CreatedDate);

    @Query(value = "select * " +
                     "from Message m " +
                     "join NumberMessageRelation n " +
                       "on n.MessageID = m.ID " +
                    "where n.Number = :number", nativeQuery = true)
    List<Message> findByNumber(Long number);

    @Query(value = "select * " +
                     "from Message m " +
                     "join NumberMessageRelation n " +
                       "on n.MessageID = m.ID " +
                    "where n.Number = :number" +
                     " and m.CreatedDate = :createdDate", nativeQuery = true)
    List<Message> findByNumberAndDate(LocalDate createdDate, Long number);



    List<Message> findAll();





}
