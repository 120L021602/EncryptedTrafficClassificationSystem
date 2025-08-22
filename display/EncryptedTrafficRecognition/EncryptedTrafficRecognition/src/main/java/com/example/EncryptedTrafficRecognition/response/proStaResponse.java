package com.example.EncryptedTrafficRecognition.response;


import com.example.EncryptedTrafficRecognition.domain.ComPortSta;
import com.example.EncryptedTrafficRecognition.domain.ComProSta;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class proStaResponse extends Response{
    private ComProSta comProSta;

    public ComProSta getComProSta() {
        return comProSta;
    }

    public void setComProSta(ComProSta comProSta) {
        this.comProSta = comProSta;
    }
}
