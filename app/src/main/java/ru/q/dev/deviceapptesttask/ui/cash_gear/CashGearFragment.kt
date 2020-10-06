package ru.q.dev.deviceapptesttask.ui.cash_gear

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_gear.*
import ru.q.dev.deviceapptesttask.MainActivity
import ru.q.dev.deviceapptesttask.R

// Фрагмент показа текущего состояния кассы. С возможностью выбора кассы

class CashGearFragment : Fragment(), CashGearView {

    private lateinit var viewModel: CashGearViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel =
                ViewModelProviders.of(this).get(CashGearViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gear, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Настраиваем модель при пересоздании view
        viewModel.setup(this, (activity as MainActivity).cashGearSelectedModel)

        viewModel.cashGear.observe(viewLifecycleOwner, Observer {
            // Показываем идентификатор кассы
           cashGear.text = it.idName
        })

        cashGear.setOnClickListener {
        // TODO Показываем диалог переключения касс
        }
    }

    override fun onModelFirstInit() {
        viewModel.initParams() //Настраиваем модель при первом создании фрагмента
    }


}