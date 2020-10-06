package ru.q.dev.deviceapptesttask.model.cash_gear.common


//Класс, в котором записаны общие для всех касс интерфейсы

abstract class CashGearCommon (
    //Установка драйвера кассы
    val cashGearDriverCommon: CashGearDriverCommon? = null,
    //Название кассы, нужно для правильной идентификации
    // (название|&номер&|адрес регистрации&|регистратор)
    var idName: String
) {
    //Печать

    abstract fun printCheque() //прямой чек

    abstract fun printBackCheque() //возвратный чек

}