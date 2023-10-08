package com.example.adzan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adzan.databinding.FragmentDisplayDataBinding

class DisplayDataFragment : Fragment() {
    private lateinit var binding: FragmentDisplayDataBinding

    companion object {
        private const val ARG_DATA = "data"

        fun newInstance(data: String): DisplayDataFragment {
            val fragment = DisplayDataFragment()
            val args = Bundle()
            args.putString(ARG_DATA, data)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDisplayDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receivedData = arguments?.getString(ARG_DATA)
        binding.tvDisplayData.text = receivedData
    }
}