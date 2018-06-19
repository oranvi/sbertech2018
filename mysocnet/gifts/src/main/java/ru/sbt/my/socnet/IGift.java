package ru.sbt.my.socnet;

// * - помечены связи с другими модулями

public interface IGift { // интерфейс для отправления подарков

    void choiceGift(String my_id);// выбор подарка

    void makeGift(String my_id, String gift_id, String friend_id, String text_gift); // * содержит choiceGift()

    void makeGiftConfidentially(String my_id, String gift_id, String friend_id, String text_gift); // * содержит choiceGift()

    // * отображение подарков на странице пользователя (получателя)

}
