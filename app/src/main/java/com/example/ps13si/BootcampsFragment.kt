package com.example.ps13si

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ps13si.databinding.FragmentBootcampsBinding

class BootcampsFragment : Fragment() {

    private var binding: FragmentBootcampsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBootcampsBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.let {
            with(it) {

                ibBCScreenBackButton.setOnClickListener {
                    activity?.onBackPressed()
                }

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }

}