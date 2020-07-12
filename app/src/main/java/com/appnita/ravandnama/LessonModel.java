package com.appnita.ravandnama;

public class LessonModel {
    private int id ;
    private int lesson;
    private int isRead = 0;
    private int issum = 0;
    private int test = 0;





    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }

    public int getIssum() {
        return issum;
    }

    public void setIssum(int issum) {
        this.issum = issum;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
