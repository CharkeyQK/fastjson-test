package com.charkey.fastjson.domain;

public class MsgHeader<V> {

    String messageId;

    V value;

    public MsgHeader() {
        this.messageId = "msg10010101";
    }

    public MsgHeader(V v) {
        this.messageId = "msg1020102";
        this.setValue(v);
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }


    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}