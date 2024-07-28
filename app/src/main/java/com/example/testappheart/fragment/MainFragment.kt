package com.example.testappheart.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.testappheart.R

class MainFragment : Fragment() {
  
  lateinit var navController: NavController
  
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_main, container, false)
  }
  
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    
    navController = Navigation.findNavController(view)
    view.findViewById<ImageView>(R.id.mainNextBtn).setOnClickListener{
      navController.navigate(R.id.action_mainFragment2_to_questionFragment2)
    }
  }
  
}