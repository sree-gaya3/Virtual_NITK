package com.example.virtualnitk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class WorkingHrsFragment : Fragment() {

    companion object {
        fun newInstance() : WorkingHrsFragment {
            return WorkingHrsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_working_hrsb, container, false)
    }
}
