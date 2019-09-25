package com.dotplays.slide3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView lvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lvList = findViewById(R.id.lvList);

        final String[] fruits = {"Happy New Year","Happy Birthday","Take me to your heart","My heart will go on",
                "We dont talk anymore","Banana","Mango","Bomb","Grape",
        "Lemon","WaterMelon","Coconut","Kiwi","Cherry"};

        ArrayAdapter<String> stringArrayAdapter =
                new ArrayAdapter<>(MainActivity.this,R.layout.fruit,fruits);


        lvList.setAdapter(stringArrayAdapter);


        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // xay ra su kien click
                Log.e("ABC","ABC " + fruits[position]);
                Toast.makeText(MainActivity.this,fruits[position],Toast.LENGTH_SHORT).show();
            }
        };
        lvList.setOnItemClickListener(onItemClickListener);

    }
}
