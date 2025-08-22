package com.example.EncryptedTrafficRecognition.response;


import com.example.EncryptedTrafficRecognition.domain.ComPortSta;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class portStaResponse extends Response{

    private ComPortSta comPortSta;

    public ComPortSta getComPortSta() {
        return comPortSta;
    }

    public void setComPortSta(ComPortSta comPortSta) {
        this.comPortSta = comPortSta;
    }
}
