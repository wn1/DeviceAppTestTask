package ru.q.dev.deviceapptesttask.model.cash_gear.common

// Интерфейс работы со сменой
// ТЗ:   но не у каждой есть возможность открыть смену и закрыть смену

interface CashGearShiftInterface {


    fun openShift() //Открыть смену

    fun closeShift() //Закрыть смену
}