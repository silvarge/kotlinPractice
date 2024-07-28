package com.example.testappheart.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.testappheart.R

class SelectionFragment : Fragment(), View.OnClickListener {
  
  lateinit var navController: NavController
  
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_selection, container, false)
  }
  
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    
    navController = Navigation.findNavController(view)
    
    view.findViewById<ImageView>(R.id.selectionBackBtn).setOnClickListener(this)
    view.findViewById<TextView>(R.id.option1).setOnClickListener(this)
    view.findViewById<TextView>(R.id.option2).setOnClickListener(this)
    view.findViewById<TextView>(R.id.option3).setOnClickListener(this)
    view.findViewById<TextView>(R.id.option4).setOnClickListener(this)
    
    
  }
  
  override fun onClick(v: View?) {
    when (v?.id) {
      R.id.option1 -> {
        navigateWithIndex(1)
      }
      
      R.id.option2 -> {
        navigateWithIndex(2)
      }
      
      R.id.option3 -> {
        navigateWithIndex(3)
      }
      
      R.id.option4 -> {
        navigateWithIndex(4)
      }
      
      R.id.selectionBackBtn -> {
        navController.popBackStack()
      }
      
    }
  }
  
  fun navigateWithIndex(index: Int) {
    val bundle = bundleOf("index" to index)
    navController.navigate(R.id.action_selectionFragment_to_resultFragment2, bundle)
  }
  
}