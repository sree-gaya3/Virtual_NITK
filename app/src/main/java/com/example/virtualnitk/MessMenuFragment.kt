package com.example.virtualnitk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MessMenuFragment : Fragment() {

    companion object {
        fun newInstance() : MessMenuFragment {
            return MessMenuFragment()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mess_menub, container, false)
    }
}