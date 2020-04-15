package com.example.blockcertify_admin;

public class ListType {
    private String Name;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    private String Type;
    public ListType(){

    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public ListType(String name, String type) {
        Name = name;
        Type = type;
    }
}
