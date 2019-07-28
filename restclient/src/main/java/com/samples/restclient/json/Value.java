package com.samples.restclient.json;

import java.io.Serializable;

public class Value implements Serializable {

    private String id;
    private String joke;

    public Value() {
    }

    public Value(String id, String joke) {
        this.id = id;
        this.joke = joke;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}