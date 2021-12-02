package com.example.kideatproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_send_money.*

class SendMoneyActivity : AppCompatActivity() {
    var money = 0
    val TAG = "SendMoneyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_money)
        sendMoneyText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(sendMoneyText.length()>=1&&money!=0){
                    oneDel.visibility = View.VISIBLE
                    allDel.visibility = View.VISIBLE
                    checkBtn.visibility = View.VISIBLE
                } else{
                    oneDel.visibility = View.INVISIBLE
                    allDel.visibility = View.INVISIBLE
                    checkBtn.visibility = View.INVISIBLE
                }
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })

        num0.setOnClickListener {
            set(0)
        }
        num1.setOnClickListener {
            set(1)
        }
        num2.setOnClickListener {
           set(2)
        }
        num3.setOnClickListener {
            set(3)
        }
        num4.setOnClickListener {
            set(4)
        }
        num5.setOnClickListener {
            set(5)
        }
        num6.setOnClickListener {
            set(6)
        }
        num7.setOnClickListener {
            set(7)
        }
        num8.setOnClickListener {
            set(8)
        }
        num9.setOnClickListener {
            set(9)
        }
        oneDel.setOnClickListener {
            money /= 10
            sendMoneyText.text = money.toString()
            if(money == 0){
                sendMoneyText.text = null
            }
        }
        allDel.setOnClickListener {
            money = 0
            sendMoneyText.text = money.toString()
            if(money == 0){
                sendMoneyText.text = null
            }
        }

        backBtn.setOnClickListener {
            finish()
        }

    }
    private fun set(num:Int){
        if(money*10+num<=50000){
            money = money*10+num
            sendMoneyText.text = money.toString()
        }else{
            Toast.makeText(this,"한번 송금 할때 최대 가격은 5만원 입니다",Toast.LENGTH_SHORT).show()
        }
    }
}