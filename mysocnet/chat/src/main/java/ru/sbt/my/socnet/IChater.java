package ru.sbt.my.socnet;

import ru.sbt.my.socnet.exception.ChatDenyException;
import ru.sbt.my.socnet.dto.Chat;


public interface IChater {

    void sendMessage( User sender, User receiver, String message ) throws ChatDenyException; // отправка сообщения // содержит uploadPictureToChat

    void createChat(int creatorID, int participantID); // * создание приватного чата // participant - участник (друг или нет)

    void createChat(int creatorID, int[] participantsID); // * создание группового чата

    void addNewParticipant(int chatID, int participantID); // * добавление собеседника/ов в существующий чат // Chat - сущность

    Chat chooseChat(int chatID); // * выбор чата из доступных пользователю

    void goToProfileFromChat(int participantID); // подумать // * переход на страницу друга из чата



















    //void uploadPictureToChat(Picture picture); // модуль photo-upload-view // загрузка изображения для отправки через чат

    //void displayPhotoInChat(Chat chat, int participantID); // подумать, в каком модуле // * отображение миниатюры фото собеседника в чате

    //void displayTimeDate(Message message); // подумать // * отображение времени/даты сообщения







}
