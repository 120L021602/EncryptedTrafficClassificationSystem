package com.example.EncryptedTrafficRecognition.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@Data
@EqualsAndHashCode(callSuper = true)
public class protocolResponse extends Response{

    private ArrayList<String> protocolList;

    private ArrayList<Integer> idList;

    public protocolResponse() {
        this.idList = new ArrayList<>();
        this.protocolList = new ArrayList<>();
    }

    public ArrayList<String> getProtocolList() {
        return protocolList;
    }

    public void setProtocolList(ArrayList<String> protocolList) {
        this.protocolList = protocolList;
    }

    public ArrayList<Integer> getIdList() {
        return idList;
    }

    public void setIdList(ArrayList<Integer> idList) {
        this.idList = idList;
    }

    public void addIdList(Integer id){
        this.idList.add(id);
    }

    public void addProtocolList(String protocol){
        this.protocolList.add(protocol);
    }
}
