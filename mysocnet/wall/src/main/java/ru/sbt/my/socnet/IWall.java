package ru.sbt.my.socnet;

// здесь все методы видимо связаны с другим/другими модулями

public interface IWall {

    void addWallMessage(String my_id, String friend_id, String text_message, boolean is_picture); // создать сообщение на своей стене или стене друга
                                                                                                  // содержит uploadPictureToWall

    void uploadPictureToWall(Picture picture); // добавить в сообщение на стене картинку

    void addLinkToWall(Link link); // (? нужно или нет) добавить ссылку на сообщение из сообщества
                                   // Link - сущность

    void displayTimeDate(Message message); // отображение времени/даты сообщения

    void createComment(String my_id, Message message, String text_comment); // создание комментария к сообщению на стене

    void createLike(String my_id, Message message, boolean is_like); // лайк

    void displayAmountView(Message message); // (? нужно или нет) отображение количества просмотров

}
