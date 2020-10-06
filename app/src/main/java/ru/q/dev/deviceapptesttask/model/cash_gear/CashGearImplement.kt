package ru.q.dev.deviceapptesttask.model.cash_gear

import android.content.Context
import ru.q.dev.deviceapptesttask.R
import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearCommon
import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearShiftInterface
import ru.q.dev.deviceapptesttask.model.cash_gear.implements.CashGearDriverNormal
import ru.q.dev.deviceapptesttask.model.cash_gear.implements.CashGearNormal
import java.lang.Exception

//Фабричный класс реализации параметров и интерфейсов для кассы.

class CashGearImplement (val context: Context) {

    var shiftInterface: CashGearShiftInterface? = null

    //Устанавливает возможность использования интерфейса открытия и закрытия кассы
    fun withShiftInterface(shiftInterface: CashGearShiftInterface) : CashGearImplement {
        this.shiftInterface = shiftInterface
        return this
    }

    fun implementOf(type: CashGearType): CashGearCommon {
        when (type) {
            CashGearType.WithStarBorder -> return CashGearNormal(
                CashGearDriverNormal(context),
                type.typeName,
                shiftInterface
            )
            // TODO реализация и настройка других типов касс
            else -> {
                throw Exception(context.getString(R.string.unknown_type_gear))
            }
        }

    }
}