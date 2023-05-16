package com.example.mywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btHome;
    private WebView webView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btHome = findViewById(R.id.btHome);
        webView = findViewById(R.id.webView);
        btHome.setOnClickListener(e->toHome());

        //configurando o webView
        WebSettings settings =webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        webView.loadUrl("https://www.unoeste.br");
    }

    private void toHome() {
        webView.loadUrl("https://www.unoeste.br");
    }
}