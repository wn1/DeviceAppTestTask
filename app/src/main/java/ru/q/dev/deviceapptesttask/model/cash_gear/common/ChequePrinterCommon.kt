package ru.q.dev.deviceapptesttask.model.cash_gear.common

//Класс, ответственный за печать чеков

abstract class ChequePrinterCommon {
    abstract fun print(cheque: ChequeCommon)
}