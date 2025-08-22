package com.example.EncryptedTrafficRecognition.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@Data
@EqualsAndHashCode(callSuper = true)
public class portResponse extends Response{

    //portList中按顺序保存所有的端口号
    private ArrayList<Integer> portList;

    //idList中按顺序保存所有协议的编号
    private ArrayList<Integer> idList;


    public portResponse() {
        portList = new ArrayList<>();
        idList = new ArrayList<>();
    }

    public ArrayList<Integer> getPortList() {
        return portList;
    }

    public void setPortList(ArrayList<Integer> portList) {
        this.portList = portList;
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

    public void addPortList(Integer port){
        this.portList.add(port);
    }
}
