package com.omer_akkoyun.fragmentlerledialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button butonCikis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butonCikis=(Button) findViewById(R.id.buton_cikis);

        butonCikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DialogFragment fragment = new DialogFragment();
               fragment.show(getSupportFragmentManager(),"dialog");


            }
        });





    }
}
