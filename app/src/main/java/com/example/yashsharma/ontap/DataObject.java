package com.example.yashsharma.ontap;

/**
 * Created by Yash Sharma on 05-10-2016.
 */
public class DataObject {
    private String text1 ;
    private String text2 ;

    DataObject(String text1 , String text2){

        this.text1=text1;
        this.text2= text2 ;

    }
    public void setText1(String text) {

        this.text1=text;
    }
    public void setText2(String text){

        this.text2=text ;
    }

}
