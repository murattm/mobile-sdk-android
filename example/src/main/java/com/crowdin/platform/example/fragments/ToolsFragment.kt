package com.crowdin.platform.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.crowdin.platform.Crowdin
import com.crowdin.platform.example.R
import com.crowdin.platform.util.inflateWithCrowdin

class ToolsFragment : Fragment() {

    companion object {
        fun newInstance(): ToolsFragment = ToolsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_tools, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<TextView>(R.id.textView3).setOnClickListener {
            // Screenshot functionality. Captures displayed views and sends it to Crowdin platform.
            Crowdin.sendScreenshot(activity!!)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_clear -> {
            }
            R.id.menu_crop -> {
            }
            R.id.menu_refresh -> {
            }
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        // Translate menu items
        inflater.inflateWithCrowdin(R.menu.fragment_menu, menu, resources)
    }
}
