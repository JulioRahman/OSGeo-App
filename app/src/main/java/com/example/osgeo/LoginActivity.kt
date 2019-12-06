package com.example.osgeo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        when (intent.getIntExtra("FROM", 1)) {
            1 -> {
                tvTitle.text = "Trac"
                Glide.with(this).load(R.drawable.logo).into(ivLogo)
                tilUsername.hint = "Username"
            }
            2 -> {
                tvTitle.text = "GitHub"
                Glide.with(this).load(R.drawable.github).into(ivLogo)
                tilUsername.hint = "Username or email address"
            }
        }

        bCancel.setOnClickListener {
            onBackPressed()
        }
    }
}
