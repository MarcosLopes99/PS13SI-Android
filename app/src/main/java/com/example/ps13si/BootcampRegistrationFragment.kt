package com.example.ps13si

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.ps13si.databinding.FragmentBootcampRegistrationBinding

class BootcampRegistrationFragment : Fragment() {

    private var binding: FragmentBootcampRegistrationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBootcampRegistrationBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.let {
            with(it) {

                val bootcamps = resources.getStringArray(R.array.bootcamp_type)
                val arrayAdapterBootcamps = ArrayAdapter(requireContext(), R.layout.dropdown_bootcamp_type, bootcamps)
                binding!!.actvSelectBootCamp.setAdapter(arrayAdapterBootcamps)

                btBackRegistration.setOnClickListener {
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