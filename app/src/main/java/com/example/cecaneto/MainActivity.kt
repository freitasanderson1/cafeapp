package com.example.cecaneto

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.cecaneto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webView = binding.cafeTO

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://sites.uft.edu.br/cafe")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

    }

    override fun onBackPressed() {
        val webView = binding.cafeTO

        if(webView.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}