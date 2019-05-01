package com.miss.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tahajud, witir, rawatib, dhuha, istikhoroh, tahiyyatulmasjid, shalatsyuruk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajud = findViewById(R.id.tahajud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        istikhoroh = findViewById(R.id.istikhoroh);
        tahiyyatulmasjid = findViewById(R.id.tahiyyatulmasjid);
        shalatsyuruk =findViewById(R.id.shalatsyuruk);


        tahajud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
        tahiyyatulmasjid.setOnClickListener(this);
        shalatsyuruk.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
switch (v.getId()){

    case  R.id.tahajud:
        Intent tahajud = new Intent(MainActivity.this, Deskripsi.class);
        tahajud.putExtra("sunnah", "https://wisatanabawi.com/sholat-tahajud/");
        break;

    case  R.id.witir:
        Intent witir = new Intent(MainActivity.this, Deskripsi.class);
        witir.putExtra("sunnah", "https://bersamadakwah.net/sholat-witir/");

        break;

    case  R.id.rawatib:
        Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
        rawatib.putExtra("sunnah", "https://muslim.or.id/4602-tuntunan-shalat-sunnah-rawatib.html");

        break;

    case  R.id.dhuha:
Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
dhuha.putExtra("sunnah", "https://wisatanabawi.com/doa-sholat-dhuha/");
        break;

    case  R.id.istikhoroh:
        Intent istikhoroh = new Intent(MainActivity.this, Deskripsi.class);
        istikhoroh.putExtra("sunnah", "https://rumaysho.com/881-panduan-shalat-istikhoroh.html");

        break;

    case  R.id.tahiyyatulmasjid:
Intent tahiyyatulmasjid = new Intent(MainActivity.this,Deskripsi.class );
        tahiyyatulmasjid.putExtra("sunnah", "https://almanhaj.or.id/1744-shalat-tahiyatul-masjid.html");
        break;

    case  R.id.shalatsyuruk:
Intent shalatsyuruk = new Intent(MainActivity.this,Deskripsi.class);
shalatsyuruk.putExtra("sunnah","https://aitarus.com/sholat-syuruq-isyraq/");
        break;


}

    }

}
