package com.daniyal.i201806;

public class Model {

    String id , name , num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Model(String id, String name, String num){
        this.id = id;
        this.name = name;
        this.num = num;

    }
}
