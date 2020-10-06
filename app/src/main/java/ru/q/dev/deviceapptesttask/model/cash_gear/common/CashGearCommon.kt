package ru.q.dev.deviceapptesttask.model.cash_gear.common


//Класс, в котором записаны общие для всех касс интерфейсы

abstract class CashGearCommon (
    //С каждой из касс приложение работает через свой драйвер кассы.
    val cashGearDriverCommon: CashGearDriverCommon? = null,
    //Название кассы, нужно для правильной идентификации
    // (название|&номер&|адрес регистрации&|регистратор)
    var idName: String
) {
    //У каждой из касс есть возможность напечатать

    abstract fun printCheque() //прямой чек

    abstract fun printBackCheque() //возвратный чек

}