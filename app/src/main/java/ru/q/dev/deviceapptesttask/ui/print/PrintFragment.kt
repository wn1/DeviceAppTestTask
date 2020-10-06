package ru.q.dev.deviceapptesttask.ui.print

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ru.q.dev.deviceapptesttask.R

class PrintFragment : Fragment() {

    private lateinit var printViewModel: PrintViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        printViewModel =
                ViewModelProviders.of(this).get(PrintViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_print, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        printViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}