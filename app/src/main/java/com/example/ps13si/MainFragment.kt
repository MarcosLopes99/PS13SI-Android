package com.example.ps13si

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ps13si.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.let {
            with(it) {

                btBootcampsMain.setOnClickListener {
                    findNavController()
                        .navigate(
                            R.id.action_mainFragment_to_bootcampsFragment
                        )
                }

                btRegistrationMain.setOnClickListener {
                    findNavController()
                        .navigate(
                            R.id.action_mainFragment_to_bootcampRegistrationFragment
                        )
                }

                btInfoMain.setOnClickListener {
                    findNavController()
                        .navigate(
                            R.id.action_mainFragment_to_infoFragment
                        )
                }

                btExitMain.setOnClickListener {
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