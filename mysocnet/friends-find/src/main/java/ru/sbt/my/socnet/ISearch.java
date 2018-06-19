package ru.sbt.my.socnet;

// * - помечены связи с другими модулями  

public interface ISearch { // интерфейс для поиска/добавления друзей

    void searchFriend(String name_surname); // поиск друга

    void searchFriendAccurately(String name_surname, String country, String town, int ageFrom, int ageTo); // точный поиск друга

    void offerFriendship(String user_id); // предложение дружбы из результатов поиска

    // * рекомендации при поиске

    // * перейти на страницу пользователя из результатов поиска

    // * отправить предложение дружбы со страницы пользователя

    // * отображение фото пользователя в результатах поиска

    // * (?) удаление друга

}
