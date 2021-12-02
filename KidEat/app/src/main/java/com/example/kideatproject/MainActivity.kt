package com.example.kideatproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_map.*

class MainActivity : AppCompatActivity() {

    var mBackWait:Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main, MapFragment()).commit()

        firstBtn.setOnClickListener{
            tran(1)
        }
        secondBtn.setOnClickListener {
            tran(2)
        }
        thirdBtn.setOnClickListener {
            tran(3)
        }
        forthBtn.setOnClickListener {
            tran(4)
        }
    }

    private fun tran(num : Int){
        when(num){
            1->{
                first()
            }
            2->{
                second()
            }
            3->{
                third()
            }
            4->{
               forth()
            }

        }
    }
    private fun first(){
        firstBtn.setImageResource(R.drawable.heart_black)
        secondBtn.setImageResource(R.drawable.map)
        thirdBtn.setImageResource(R.drawable.search)
        forthBtn.setImageResource(R.drawable.mypage)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main, LikeFragment()).commit()
    }
    private fun second(){
        firstBtn.setImageResource(R.drawable.heart)
        secondBtn.setImageResource(R.drawable.map_black)
        thirdBtn.setImageResource(R.drawable.search)
        forthBtn.setImageResource(R.drawable.mypage)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main, MapFragment()).commit()
    }
    private fun third(){
        firstBtn.setImageResource(R.drawable.heart)
        secondBtn.setImageResource(R.drawable.map)
        thirdBtn.setImageResource(R.drawable.search_black)
        forthBtn.setImageResource(R.drawable.mypage)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main, SearchFragment()).commit()
    }
    private fun forth(){
        firstBtn.setImageResource(R.drawable.heart)
        secondBtn.setImageResource(R.drawable.map)
        thirdBtn.setImageResource(R.drawable.search)
        forthBtn.setImageResource(R.drawable.mypage_black)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main, MyPageFragment()).commit()
    }

    override fun onBackPressed() {
        if(System.currentTimeMillis()-mBackWait>=2000){
            mBackWait=System.currentTimeMillis()
            Toast.makeText(this,"'뒤로'버튼 한번 더 누르시면 종료돱나다.",Toast.LENGTH_LONG).show()
        }else{
            finish()
        }
    }
}