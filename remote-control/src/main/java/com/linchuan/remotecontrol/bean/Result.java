package com.linchuan.remotecontrol.bean;

import java.io.Serializable;

public class Result implements Serializable {
    String content;
    Object detail;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Result{" +
            "content='" + content + '\'' +
            ", detail=" + detail +
            '}';
    }
}
