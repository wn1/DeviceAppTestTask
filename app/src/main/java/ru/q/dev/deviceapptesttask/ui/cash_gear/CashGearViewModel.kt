package ru.q.dev.deviceapptesttask.ui.cash_gear

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.q.dev.deviceapptesttask.model.cash_gear.common.CashGearCommon
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

    //Сигнал о статусе первоначальной установки модели
    private var firstSetup = true

    val cashGear = MutableLiveData<CashGearCommon>()

    //Установка, для фрагментов после события onActivityCreated
    // Можно сюда поместить действия при каждой инициализации View во фрагменте
    fun setup (setupView: CashGearView) {
        viewRef = WeakReference(setupView)
        if (firstSetup) {
            firstSetup = false
            view?.onModelFirstInit()
        }
    }

    // Первая инициализация параметров.
    // Сюда помещаем действия по установке конфигурации модели при первом создании фрагмента,
    // после onModelFirstInit
    fun initParams() {

    }

    //Настройка классов кассы, может быть обновлено для загрузки из хранимых параметров или БД

    // ТЗ: Одна из касс при печати чека обрамляет его в "звездочки", другая в "плюсики", третья просто печатает.
    //Третья касса не имеет функционала открытия и закрытия смены.
    //Все три кассы печатают на бумаге.
    //Есть четвертая касса (виртуальная), она печатает в файл, но имеет все 4е метода.
    fun initCashGear() {

    }
}