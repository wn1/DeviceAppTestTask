package ru.q.dev.deviceapptesttask.model.cash_gear

//Типы касс

enum class CashGearType (val typeName: String) {
    WithStarBorder("1 > обр. \"звездочки\""),
    WithPlusBorder("2 > обр. \"плюсики\""),
    NormalNoShiftActions("3 > не работает со сменой"),
    FilePrint("4 > печатает в файл")
}