package ru.sbt.my.socnet;

// "*" - помечены связи с другими модулями

public interface ISearch { // интерфейс для поиска/добавления друзей

    void searchFriend(String my_id, String name_surname, boolean country, boolean town, boolean ageFrom, boolean ageTo); // поиск друга с возможностью более точного поиска

    void offerFriendshipFromSearch(String my_id, String user_id); // предложение дружбы из результатов поиска

    void decideFriendship(String my_id, String user_id); // согласие/несогласие на предложение дружбы

    // * рекомендации при поиске (тут пока не ясно)

    void goToWebsiteFromSearch(String participant_id); // * перейти на страницу пользователя из результатов поиска
                                             // очень похожий метод, как в модуле Chat

    void offerFriendshipFromProfile(String my_id, String user_id); // * отправить предложение дружбы со страницы пользователя

    void displayPhotoInSearch(String participant_id); // * отображение миниатюры фото пользователя в результатах поиска
                                              // похожий метод, как в модуле Chat

    void renounceFriendship(String my_id, String user_id); // * (?) удаление из друзей

}
