package ru.q.dev.deviceapptesttask.model.cash_gear.implements

import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearCommon
import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearDriverCommon
import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearShiftInterface

//Касса нормального типа

class CashGearNormal(
    cashGearDriverCommon: CashGearDriverCommon? = null,
    idName: String,
    val shiftInterface: CashGearShiftInterface? = null,
    val borderChar: Char? = null //Если значение не null, то печатает обрамление из символа Char
) : CashGearCommon(cashGearDriverCommon, idName), CashGearShiftInterface {

    //  Если не имеет функционала открытия и закрытия смены, то false. Иначе true
    val isShiftInterfacePresent: Boolean
        get() {
            return shiftInterface != null
        }

    // Т Если касса отпечатывает вокруг текста другие символы,
    // то true, иначе false
    val isBorderedWithChar: Boolean
        get() {
            return borderChar != null
        }

    override fun printCheque() {
        TODO("Not yet implemented")
    }

    override fun printBackCheque() {
        TODO("Not yet implemented")
    }

    override fun openShift() {
        TODO("Not yet implemented")
    }

    override fun closeShift() {
        TODO("Not yet implemented")
    }

}