package com.example.myapplication;

public class Group {
    private String name;
    private String use;
    private int imageId;
    public Group(String name,String use,int imageId){
        this.name = name;
        this.use=use;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }
    public String getUse(){
        return use;
    }
    public int getImageId(){
        return imageId;
    }
}
