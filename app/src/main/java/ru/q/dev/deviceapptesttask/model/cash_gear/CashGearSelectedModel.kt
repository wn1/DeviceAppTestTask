package ru.q.dev.deviceapptesttask.model.cash_gear

import android.content.Context
import androidx.lifecycle.MutableLiveData
import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearCommon

//Модель для управления значениями выбранного типа кассы.
//Хранит значение выбранной кассы, сохраняет и восстанавливает это значение при пересоздании
class CashGearSelectedModel(val context: Context) {

    //Для уведомлений об изменениях выбранной кассы
    var selectedGearField: MutableLiveData<CashGearCommon?> = MutableLiveData(null)

    init {
        initCashGear()
    }

    //Настройка классов кассы, может быть обновлено для загрузки из хранимых параметров или БД

    // Есть разные типы касс, отличаются возможность разных дополнений к печати и типом носителя
    fun initCashGear() {
        //   TODO загрузка выбранных значений
        selectedGearField.value = CashGearImplement(context).implementOf(CashGearType.WithStarBorder)
    }

}