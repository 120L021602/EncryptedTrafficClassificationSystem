package com.example.EncryptedTrafficRecognition.response;

public class Response {
    private Boolean success;
    private String msg;

    public Response() {
        this.success = false;
        this.msg = "";
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
