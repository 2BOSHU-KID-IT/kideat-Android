package com.example.kideatproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Toast

class TestActivityKt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_kt)

        val webView : WebView = findViewById(R.id.webViewT)
        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(WebAppInterface(this),"BlackJin")
        webView.loadUrl("file:///android_asset/sample.html")




    }
    class WebAppInterface(private val mContext: Context?) {
        @JavascriptInterface
        fun showToast(toast: String) {
            Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()

        }
    }
}