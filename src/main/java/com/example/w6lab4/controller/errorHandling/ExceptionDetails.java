package com.example.w6lab4.controller.errorHandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data @NoArgsConstructor @AllArgsConstructor
public class ExceptionDetails {
    private String feildName;
    private  String feildValue;

    public ExceptionDetails(String feildName, String feildValue) {
        this.feildName = feildName;
        this.feildValue = feildValue;
    }

    public ExceptionDetails() {

    }

    public String getFeildName() {
        return feildName;
    }

    public void setFeildName(String feildName) {
        this.feildName = feildName;
    }

    public String getFeildValue() {
        return feildValue;
    }

    public void setFeildValue(String feildValue) {
        this.feildValue = feildValue;
    }
}
