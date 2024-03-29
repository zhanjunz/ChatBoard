package com.qtking.chatboard;

/**
 * Created by Think on 2016/12/13.
 */

public class Message {

    private String content;
    private int type;
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SEND = 1;

    public Message(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
