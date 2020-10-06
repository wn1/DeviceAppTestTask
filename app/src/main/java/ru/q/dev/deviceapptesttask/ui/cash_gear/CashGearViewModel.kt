package ru.q.dev.deviceapptesttask.ui.cash_gear

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearCommon
import ru.q.dev.deviceapptesttask.model.cash_gear.CashGearSelectedModel
import java.lang.ref.WeakReference

interface CashGearView {
    fun onModelFirstInit()
}

class CashGearViewModel : ViewModel() {

    // Подключаем одну View к модели.
    private var viewRef: WeakReference<CashGearView>? = null
    val view: CashGearView?
        get () {
           return viewRef?.get()
        }

    //Модель для управления значениями выбранного типа кассы
    lateinit var cashGearSelectedModel: CashGearSelectedModel

    //Сигнал о статусе первоначальной установки модели
    private var firstSetup = true

    val cashGear = MutableLiveData<CashGearCommon>()

    //Установка, для фрагментов после события onActivityCreated
    // Можно сюда поместить действия при каждой инициализации View во фрагменте
    fun setup (setupView: CashGearView, cashGearSelectedModel: CashGearSelectedModel) {
        this.cashGearSelectedModel = cashGearSelectedModel
        viewRef = WeakReference(setupView)
        if (firstSetup) {
            firstSetup = false
            view?.onModelFirstInit()
        }

        cashGearSelectedModel.selectedGearField.observeForever {
            cashGear.postValue(it)
        }
    }

    // Первая инициализация параметров.
    // Сюда помещаем действия по установке конфигурации модели при первом создании фрагмента,
    // после onModelFirstInit
    fun initParams() {

    }
}