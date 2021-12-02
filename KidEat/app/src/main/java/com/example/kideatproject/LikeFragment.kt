package com.example.kideatproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.GeolocationPermissions
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class LikeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_like, container, false)
        val webView : WebView = rootView.findViewById(R.id.webView)

        webView.loadUrl("https://boshu-e48e3.web.app/")
        webView.settings.javaScriptEnabled = true

        return rootView
    }

    companion object {

    }
}