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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val buttonNickName:Button = findViewById(R.id.complete_button)

        buttonNickName.setOnClickListener {
           // nickName(it)



            binding.nicknameTextview.text=binding.nicknameEdittext.text
            binding.nicknameEdittext.visibility =View.GONE
            binding.completeButton.visibility =View.GONE
            binding.nicknameTextview.visibility = View.VISIBLE


        }


    }

 /*   fun nickName(view:View){

        val editTextNickname:EditText = findViewById(R.id.nickname_edittext)
        val textViewNickname:TextView =findViewById(R.id.nickname_textview)

        textViewNickname.text = editTextNickname.text
        editTextNickname.visibility = View.GONE
        view.visibility =View.GONE
        textViewNickname.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)



    }*/


}