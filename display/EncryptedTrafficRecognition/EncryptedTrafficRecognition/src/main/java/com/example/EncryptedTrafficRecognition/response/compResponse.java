package com.example.EncryptedTrafficRecognition.response;

import com.example.EncryptedTrafficRecognition.domain.EncryptedMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class compResponse extends Response{

    private List<EncryptedMessage> encMsgList;

    public compResponse() {
    }

    public List<EncryptedMessage> getEncMsgList() {
        return encMsgList;
    }

    public void setEncMsgList(List<EncryptedMessage> encMsgList) {
        this.encMsgList = encMsgList;
    }
}
