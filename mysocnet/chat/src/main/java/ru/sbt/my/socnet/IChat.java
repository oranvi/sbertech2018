package ru.sbt.my.socnet;

public interface IChat {

    void createChat(String my_id, String participant_id); // * создание чата (тет-а-тет или группового)
                                                          // participant - участник (друг или нет)

    void addNewParticipant(Chat chat, String participant_id); // * добавление собеседника/ов в существующий чат
                                                              // Chat - сущность

    void chooseChat(Chat chat); // * выбор чата (из доступных пользователю)

    void sendMessage(String my_id, String friend_id, String text_message); // отправка сообщения
                                                                           // или вместо String text_message Message message?

    void uploadPicture(Chat chat, Picture picture); // (*?) загрузка изображения для отправки через чат
                                                   // Picture - сущность

    void displayPhoto(Chat chat, String participant_id); // * отображение миниатюры фото собеседника в чате

    void displayTimeDate(Message message); // * отображение времени/даты сообщения

    void goToWebsite(String participant_id); // * переход на страницу друга из чата





}
