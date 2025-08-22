package com.example.EncryptedTrafficRecognition.dao;

import com.example.EncryptedTrafficRecognition.domain.ComProSta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComProStaRepository extends JpaRepository<ComProSta, Integer> {
}
