package ru.sbt.my.socnet;

public class Photo {
    int id;
    Profile profile;
    String photoUrl;

    public Photo(String url){
        this.photoUrl = url;
    }
}
