package com.example.mageopet.seminar3;

/**
 * Created by bmeci on 16/02/2018.
 */

public class Quotation {
    private String text, author;

    public Quotation(String text, String author){
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
