package com.example.EncryptedTrafficRecognition.response;

import com.example.EncryptedTrafficRecognition.domain.AppSta;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class appStaResponse extends Response{

    private AppSta appSta;

    public appStaResponse() {
    }

    public AppSta getAppSta() {
        return appSta;
    }

    public void setAppSta(AppSta appSta) {
        this.appSta = appSta;
    }
}
