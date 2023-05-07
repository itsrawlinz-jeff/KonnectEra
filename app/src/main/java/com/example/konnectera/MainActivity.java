package com.example.konnectera;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView= findViewById(R.id.webview);
        webView.loadUrl("http://konnectera.bsoundsentertainment.com/");

    }
}