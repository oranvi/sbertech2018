package ru.sbt.my.socnet;

// "*" - помечены связи с другими модулями

public interface ISearch { // интерфейс для поиска/добавления друзей

    int searchFriend(int senderID, String nameAndSurname); // поиск друга с возможностью более точного поиска

    void offerFriendshipFromSearch(int senderID, int userID); // предложение дружбы из результатов поиска

    boolean decideFriendship(int senderID, int receiverID); // согласие/несогласие на предложение дружбы

    void goToProfileFromSearch(int userID); // подумать // * перейти на страницу пользователя из результатов поиска
                                             // очень похожий метод, как в модуле Chat

    // * рекомендации при поиске (тут пока не ясно)

    //void offerFriendshipFromProfile(int senderID, int userID); // * отправить предложение дружбы со страницы пользователя

    //void displayPhotoInSearch(int userID); // подумать, в каком модуле // * отображение миниатюры фото пользователя в результатах поиска
                                              // похожий метод, как в модуле Chat

    //void renounceFriendship(int senderID, int userID); // * (?) удаление из друзей

}
