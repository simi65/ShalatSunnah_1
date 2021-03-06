package com.miss.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {

    //deklarasi webview

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        //inisialisasi

        webView =findViewById(R.id.webview);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("sunnah");

        //agar java script nya bisa terbaca
        webView.getSettings().getJavaScriptEnabled();
        //agar gambarnya automatis di masukan
        webView.getSettings().setLoadsImagesAutomatically(true);
        //untuk memasukan link nya
webView.loadUrl(link);
    }
}
