package com.example.kideatproject

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_mypage.*

class MyPageFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView : View = inflater.inflate(R.layout.fragment_mypage, container, false)
        val textBtn : Button = rootView.findViewById(R.id.textBtn)
        val sendBtn : Button = rootView.findViewById(R.id.sendBtn)

        textBtn.setOnClickListener {
            startActivity(Intent(context,LoginActivity::class.java))
        }
        sendBtn.setOnClickListener {
            startActivity(Intent(context,SendMoneyActivity::class.java))
        }

        return rootView
    }

    companion object {

    }
}