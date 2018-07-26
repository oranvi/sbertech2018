package ru.sbt.my.socnet;

// "*" - помечены связи с другими модулями

import ru.sbt.my.socnet.dto.Gift;

public interface IGift { // интерфейс для отправления подарков

    Gift chooseGift(int giftID); // выбор подарка

    void makeGift(int friendID, String giftText, boolean is_confidentially); // * подарить с возможностью подарить скрыто
                                                                                  // содержит choiceGift()

    //void displayGifts(int friendID); // * отображение подарков на странице пользователя (получателя)

}
