package com.example.viewpagernavigation.modules.library

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewpagernavigation.R
import com.example.viewpagernavigation.modules.library.BookFragment.Companion.KEY_DATE
import com.example.viewpagernavigation.modules.library.BookFragment.Companion.KEY_TITLE
import kotlinx.android.synthetic.main.fragment_library.*

class LibraryFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v("LibraryFragment","onViewCreated")
        awesome_book.setOnClickListener {
            val bundle = Bundle().apply {
                putString(KEY_TITLE, "Winds of Winter")
                putString(KEY_DATE, "2018")
            }

            findNavController().navigate(R.id.action_read, bundle)
        }
    }

}
