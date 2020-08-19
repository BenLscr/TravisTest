package com.benlscr.travistest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    fun substrateOnMyWallet(substrate: Int): Int {
        var wallet: Int = 100
        wallet -= substrate
        return wallet
    }
}