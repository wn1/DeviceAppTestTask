package ru.q.dev.deviceapptesttask.model.cash_gear.common

// Класс, представляющий драйвер кассы

class CashGearDriverCommon (
    val printer: ChequePrinterCommon //Принтер для печати чеков
) {
    //Печать чека
    fun printCheque(cheque: ChequeCommon) {
        printer.print(cheque)
    }
}