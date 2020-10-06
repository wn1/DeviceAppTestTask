package ru.q.dev.deviceapptesttask.model.cash_gear.common

import android.media.Image
import android.util.Size

//Класс для работы с чеками

typealias ListLine = List<String> //Строки в чеке

abstract class ChequeCommon {
    val lines: ListLine = mutableListOf()
    abstract fun prepareImage(size: Size) : Image
}