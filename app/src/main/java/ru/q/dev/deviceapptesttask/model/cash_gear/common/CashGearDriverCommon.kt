package ru.q.dev.deviceapptesttask.model.cash_gear.common

// Класс, представляющий драйвер кассы

abstract class CashGearDriverCommon (
    printer: ChequePrinterCommon? //Принтер для печати чеков, если используется другой
) {
    var printer: ChequePrinterCommon? = null

    init {
        if (printer!= null) {
            this.printer = printer
        }
        else
        {
//            TODO стандартный принтер или драйвер чекового принтера
//            this.printer = ChequePrinterCommon()
        }
    }

    //Печать чека
    fun printCheque(cheque: ChequeCommon) {
        printer?.print(cheque)
    }
}