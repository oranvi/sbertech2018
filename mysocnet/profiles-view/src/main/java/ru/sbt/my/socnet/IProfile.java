package ru.sbt.my.socnet;

/*
    IProfile - интерфейс "Профиль" - профиль пользователя mysocnet

 */

import java.util.ArrayList;

public interface IProfile {

    // Метод возращает Имя пользователя
    public String getProfileName();

    // Метод возвращает Id профиля - уникальное поле
    public int getProfileId();

    // Метод возвращает возраст пользователя
    public int getProfileAge();

    // Метод возвращает true - если пользователь онлайн,
    public boolean isOnline();

    // Метод возвращает true если profileId - друг, иначе false
    public boolean isFriend(int profileId);

    // Метод добавляет профиль profileId в друзья
    public void addFriend(int profileId);

    // Метод удаляет профиль profileId из друзей
    public void delFriend(int profileId);

    // Метод полсылает сообщение message от profileId
    // Возвращает messageId
    public int sendMessage(int profileId, String message);

    // Метод удаляет сообщение messageId
    public void delMessage(int profileId, int messageId);

    public ArrayList<String> getProfile();

}
