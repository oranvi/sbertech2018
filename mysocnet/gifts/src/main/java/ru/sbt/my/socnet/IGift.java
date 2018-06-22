package ru.sbt.my.socnet;

// "*" - помечены связи с другими модулями

public interface IGift { // интерфейс для отправления подарков

    void chooseGift(String my_id, String gift_id); // выбор подарка

    void makeGift(String friend_id, String text_gift, boolean is_confidentially); // * подарить с возможностью подарить скрыто
                                                                                  // содержит choiceGift()

    void displayGifts(String friend_id); // * отображение подарков на странице пользователя (получателя)

}
