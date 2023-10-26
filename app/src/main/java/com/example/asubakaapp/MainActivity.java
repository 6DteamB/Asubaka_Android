package com.example.asubakaapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.WebView);

        // WebViewの設定
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);  // JavaScriptを有効にする


        // WebアプリケーションのURL
        myWebView.loadUrl("https://");
    }
}
