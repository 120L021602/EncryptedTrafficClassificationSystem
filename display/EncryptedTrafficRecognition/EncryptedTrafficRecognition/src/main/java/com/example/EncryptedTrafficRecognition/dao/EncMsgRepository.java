package com.example.EncryptedTrafficRecognition.dao;

import com.example.EncryptedTrafficRecognition.domain.EncryptedMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EncMsgRepository extends JpaRepository<EncryptedMessage, Integer> {

    List<EncryptedMessage> findAllByPort(Integer port);

    List<EncryptedMessage> findAllByProtocol(String protocol);

    List<EncryptedMessage> findAllByCatalogue(String catalogue);
}
