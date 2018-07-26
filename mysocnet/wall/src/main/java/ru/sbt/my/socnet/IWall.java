package ru.sbt.my.socnet;

// здесь все методы видимо связаны с другим/другими модулями

public interface IWall {

    void addWallMessage(int senderID, int receiverID, String messageText); // создать сообщение на своей стене или стене друга

    void createComment(int senderID, Message message, String commentText); // создание комментария к сообщению на стене

    void createLike(int senderID, Message message, boolean isLike); // лайк

    void displayAmountView(Message message); // отображение количества просмотров (? нужно или нет)

    // void addLinkToWall(Link link); // (? нужно или нет) добавить ссылку на сообщение из сообщества // Link - сущность

    //void uploadPictureToWall(Picture picture); // добавить в сообщение на стене картинку

    //void displayTimeDate(Message message); // подумать // отображение времени/даты сообщения

}
