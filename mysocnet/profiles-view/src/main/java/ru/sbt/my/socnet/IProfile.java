package ru.sbt.my.socnet;

/*
    IProfile - интерфейс "Профиль" - профиль пользователя mysocnet

 */

import java.util.ArrayList;
import java.util.Date;

public interface IProfile {

    // Метод создает профиль в соцсети
    public void createProfile(int Id, Date dateReg, String login, String firstName,
                              String lastName, int age);

    // Метод удаляет профиль из соцсети
    public void deleProfile(int Id);

    // Метод возвращает Id профиля - уникальное поле
    public int getProfileId();

    // Метод возвращает возраст пользователя
    public int getProfileAge();

    // Метод возвращает true - если пользователь онлайн,
    public boolean isOnline();

    // Метод возвращает true если sender - друг, иначе false
    public boolean isFriend(Profile sender);

    // Метод добавляет профиль sender в друзья
    public void addFriend(Profile sender);

    // Метод удаляет профиль sender из друзей
    public void delFriend(Profile sender);

    // Метод полсылает сообщение message от sender
    // Возвращает Message
    public Message sendMessage(Profile sender, String message);

    // Метод удаляет сообщение message
    public void delMessage(Message message);

    // Метод возвращает Фотографии профиля
    public ArrayList<Photo> viewPhotos(Profile profile);


}
