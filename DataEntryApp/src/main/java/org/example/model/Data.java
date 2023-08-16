package org.example.model;

public class Data {

    private String name;
    private int age;
    private String title;
    private String hometown;

    public Data (){}
    public Data(String name, int age, String title, String hometown) {
        this.name = name;
        this.age = age;
        this.title = title;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
