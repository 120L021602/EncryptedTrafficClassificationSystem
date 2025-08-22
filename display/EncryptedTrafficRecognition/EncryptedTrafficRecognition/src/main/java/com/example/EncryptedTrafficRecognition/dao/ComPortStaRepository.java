package com.example.EncryptedTrafficRecognition.dao;

import com.example.EncryptedTrafficRecognition.domain.ComPortSta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComPortStaRepository extends JpaRepository<ComPortSta, Integer> {
}
