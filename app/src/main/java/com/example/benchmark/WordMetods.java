package com.example.benchmark;

import java.io.Serializable;
import java.util.ArrayList;


public class WordMetods implements Serializable {
    String backwards;
    ArrayList<String> words = new ArrayList<>();

    public String getBackwards() {
        return backwards;
    }
    void backWards(String string){
        backwards = new StringBuilder(string).reverse().toString();
    }

    void storeData(String string){
        words.add(string);
    }
   ArrayList<String> printData(){
        return words;
    }
}
