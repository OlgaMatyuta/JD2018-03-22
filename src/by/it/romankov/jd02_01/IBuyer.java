package by.it.romankov.jd02_01;

public interface IBuyer {
        void enterToMarket(); //вошел в магазин (мгновенно)
        void chooseGoods(); //выбрал товар (от 0,5 до 2 секунд)
        void goToOut(); //отправился на выход(мгновенно)
    }
