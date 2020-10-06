package ru.q.dev.deviceapptesttask.model.cash_gear.common

import ru.q.dev.deviceapptesttask.model.cash_gear.common.ChequeCommon

//Класс, ответственный за печать чеков

abstract class ChequePrinterCommon {
    abstract fun print(cheque: ChequeCommon)
}