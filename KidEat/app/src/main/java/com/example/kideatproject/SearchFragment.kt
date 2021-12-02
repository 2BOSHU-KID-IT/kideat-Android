package com.example.kideatproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class SearchFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView : View = inflater.inflate(R.layout.fragment_search, container, false)

        val webViewSearch : WebView = rootView.findViewById(R.id.webViewSearch)
        webViewSearch.loadUrl("https://boshu-e48e3.web.app/search")
        webViewSearch.settings.javaScriptEnabled = true

        return rootView
    }

    companion object {
    }
}