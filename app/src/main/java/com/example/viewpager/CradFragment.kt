package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager.databinding.FragmentCradBinding

class CradFragment : Fragment() {


    private var _fragmentBinding: FragmentCradBinding? = null
    private val fragmentBinding get() = _fragmentBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _fragmentBinding = FragmentCradBinding.inflate(
            layoutInflater,
            container,
            false
        )
        return fragmentBinding.root
    }
}
