package com.example.EncryptedTrafficRecognition.request;

import lombok.Data;

@Data
public class SinglePacket {
    private String catalogue;

    private Integer port;

    private String protocol;
}
