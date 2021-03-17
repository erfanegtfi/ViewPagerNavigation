package com.example.viewpagernavigation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class AuthenticationActivity : AppCompatActivity(){

    companion object {
        private const val OPEN_TYPE = "OPEN_TYPE"
        const val OPEN_TYPE_LOGIN = 1
        const val OPEN_TYPE_REGISTER = 2
        private const val openType = OPEN_TYPE_LOGIN

        fun start(context: Context, openType: Int) {
            val i = Intent(context, AuthenticationActivity::class.java)
            Bundle().apply {
                putInt(OPEN_TYPE, openType)
                i.putExtras(this)
            }

            context.startActivity(i)
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
    }
}