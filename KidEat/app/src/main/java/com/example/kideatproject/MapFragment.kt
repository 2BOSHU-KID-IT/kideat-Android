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
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_map.*

class MapFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView : View = inflater.inflate(R.layout.fragment_map, container, false)
        val webView_main : WebView = rootView.findViewById(R.id.webView_main)
        val webView : WebView = rootView.findViewById(R.id.webView)
        val bigBtn : Button = rootView.findViewById(R.id.bigBtn)
        val smallBtn : Button = rootView.findViewById(R.id.smallBtn)
        val small : LinearLayout = rootView.findViewById(R.id.small)
        webView_main.loadUrl("https://m.map.kakao.com/")

        webView_main.webViewClient = WebViewClient()
        webView_main.webChromeClient = object : WebChromeClient(){
            override fun onGeolocationPermissionsShowPrompt(
                origin: String?,
                callback: GeolocationPermissions.Callback?
            ) {
                super.onGeolocationPermissionsShowPrompt(origin, callback)
                callback?.invoke(origin,true,false)
            }
        }
        webView_main.settings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()
        webView.webChromeClient = object : WebChromeClient(){
            override fun onGeolocationPermissionsShowPrompt(
                origin: String?,
                callback: GeolocationPermissions.Callback?
            ) {
                super.onGeolocationPermissionsShowPrompt(origin, callback)
                callback?.invoke(origin,true,false)
            }
        }
        webView.settings.javaScriptEnabled = true

        webView.addJavascriptInterface(TestActivityKt.WebAppInterface(context),"BlackJin")
      //  webView.loadUrl("file:///android_asset/sample.html")
        webView.loadUrl("https://boshu-e48e3.web.app/")

        bigBtn.setOnClickListener {
            webView.visibility = View.INVISIBLE
            smallBtn.visibility = View.VISIBLE
            small.visibility = View.VISIBLE
        }
        smallBtn.setOnClickListener{
            webView.visibility = View.VISIBLE
            smallBtn.visibility = View.INVISIBLE
            small.visibility = View.INVISIBLE
        }

        return rootView
    }

    companion object {

    }
}