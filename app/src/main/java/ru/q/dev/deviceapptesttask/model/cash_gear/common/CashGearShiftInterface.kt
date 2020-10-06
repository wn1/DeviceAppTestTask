package ru.q.dev.deviceapptesttask.model.cash_gear.common

// Интерфейс работы со сменой
// В кассах может не быть такого интерфейса

interface CashGearShiftInterface {


    fun openShift() //Открыть смену

    fun closeShift() //Закрыть смену
}