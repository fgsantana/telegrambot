package com.test.telegrambot.dto;

public class ResultMessageS {
    private boolean ok;
    private Message result;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public Message getResult() {
        return result;
    }

    public void setResult(Message result) {
        this.result = result;
    }
}
