package com.example.testappheart.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.testappheart.R

class ResultFragment : Fragment() {
  
  lateinit var navController: NavController
  var option = -1
  
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    option = arguments?.getInt("index") ?: -1
    
    return inflater.inflate(R.layout.fragment_result, container, false)
  }
  
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    navController = Navigation.findNavController(view)
    setResult(view, option)
    
    view.findViewById<ImageView>(R.id.resultNextBtn).setOnClickListener {
      navController.navigate(R.id.action_resultFragment_to_mainFragment)
    }
    
  }
  
  fun setResult(view: View, option: Int) {
    when (option) {
      1 -> {
        view.findViewById<TextView>(R.id.resultTextView).text = "You are a QUITTER!"
        view.findViewById<TextView>(R.id.resultContentTextView).text =
          "Maybe you give up on\nlove too easily..."
      }
      
      2 -> {
        view.findViewById<TextView>(R.id.resultTextView).text = "You should focus on yourself"
        view.findViewById<TextView>(R.id.resultContentTextView).text =
          "You become really clingly to your ex."
        
      }
      
      3 -> {
        view.findViewById<TextView>(R.id.resultTextView).text = "You should take it easy"
        view.findViewById<TextView>(R.id.resultContentTextView).text =
          "You can do crazy things no matter what it takes."
      }
      
      4 -> {
        view.findViewById<TextView>(R.id.resultTextView).text = "You are pretty mature"
        view.findViewById<TextView>(R.id.resultContentTextView).text =
          "You can easily accept the break-up"
      }
      
      -1 -> {
        view.findViewById<TextView>(R.id.resultTextView).text = "Error Exist"
        view.findViewById<TextView>(R.id.resultContentTextView).text =
          "Error Exist?"
      }
      
    }
  }
  
}