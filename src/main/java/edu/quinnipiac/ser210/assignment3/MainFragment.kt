//Cole Davignon
package edu.quinnipiac.ser210.Assignment3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toolbar
import androidx.navigation.findNavController

class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val generateButton = view.findViewById<Button>(R.id.generateButton)
        generateButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_basketballFragment)
        }
        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)

        // Inflate the menu resource file
        val menuInflater = MenuInflater(requireContext())
        menuInflater.inflate(R.menu.main_menu, toolbar.menu)

        return view
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
    }

}