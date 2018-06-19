package ru.sbt.my.socnet;

import java.util.ArrayList;
import java.util.Date;


public class Profile implements IProfile {

    int Id;
    Date dateReg;
    String login;
    String firstName;
    String lastName;
    int age;

    ArrayList<Photo> photos;


    public Profile(){

    }

    //Создание профиля
    @Override
    public void createProfile(int Id, Date dateReg, String login, String firstName,
                              String lastName, int age) {
        this.Id = Id;
        this.dateReg = dateReg;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Удаление профиля
    @Override
    public void deleProfile(int Id) {

    }

    //Взять ИД
    @Override
    public int getProfileId() {
        return Id;
    }

    //Взять возраст
    @Override
    public int getProfileAge() {
        return age;
    }

    //Онлайн ?
    @Override
    public boolean isOnline() {
        return false;
    }

    //Друг ?
    @Override
    public boolean isFriend(Profile sender) {
        return false;
    }

    //Добавить в друзья
    @Override
    public void addFriend(Profile sender) {

    }

    //Удалить из друзей
    @Override
    public void delFriend(Profile sender) {

    }

    //Отправить сообщение
    @Override
    public Message sendMessage(Profile sender, String message) {
        return null;
    }


    //Удалить сообщения
    @Override
    public void delMessage(Message messageId) {

    }

    //Взять фотографии
    @Override
    public ArrayList<Photo> viewPhotos(Profile profile) {
        return photos;
    }

    //Метод добавляет фото
    public void addPhoto(String url){
        Photo photo = new Photo(url);
        photos.add(photo);
    }

    //Метод удаляет фото
    public void delPhoto(int id){

    }
}
