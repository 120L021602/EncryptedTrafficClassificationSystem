package com.example.EncryptedTrafficRecognition.dao;

import com.example.EncryptedTrafficRecognition.domain.AppSta;
import com.example.EncryptedTrafficRecognition.domain.ComPortSta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppStaRepository extends JpaRepository<AppSta, Integer> {
}
