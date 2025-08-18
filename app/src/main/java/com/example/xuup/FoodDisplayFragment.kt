package com.example.xuup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.xuup.databinding.FragmentFoodDisplayBinding


class FoodDisplayFragment : Fragment() {
private var _binding: FragmentFoodDisplayBinding?=null
   private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFoodDisplayBinding.inflate(inflater,container,false)
        val view = binding.root
        binding.nextButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_foodDisplayFragment_to_foodEntryFragment)
        }
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}