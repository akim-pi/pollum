package com.example.pollum.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pollum.adapter.PageAdapter
import com.example.pollum.data.PhotoData
import com.example.pollum.data.PhotoItem
import com.example.pollum.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: PageAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = PageAdapter(PhotoItem.itemList)
        binding.rvPhoto.layoutManager = LinearLayoutManager(requireContext())
        binding.rvPhoto.adapter = adapter
    }
}