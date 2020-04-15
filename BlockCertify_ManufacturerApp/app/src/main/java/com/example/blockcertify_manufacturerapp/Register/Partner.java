package com.example.blockcertify_manufacturerapp.Register;

public class Partner {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String email,type;

    Partner(){

    }

    Partner(String e, String t){
        email = e;
        type = t;
    }


}
