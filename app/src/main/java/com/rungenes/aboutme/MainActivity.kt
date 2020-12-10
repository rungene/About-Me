package com.rungenes.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.rungenes.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Samuel Nyambura")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //  val buttonNickName:Button = findViewById(R.id.complete_button)

        binding.myName = myName


        binding.completeButton.setOnClickListener {
            nickName(it)


        }


    }

    fun nickName(view: View) {


        binding.apply {
            myName?.nickName = nicknameEdittext.text.toString()
            nicknameTextview.text = nicknameEdittext.text
            nicknameEdittext.visibility = View.GONE
            completeButton.visibility = View.GONE
            nicknameTextview.visibility = View.VISIBLE

        }


        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)


    }


}