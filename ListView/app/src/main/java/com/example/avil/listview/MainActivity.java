package com.example.avil.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.list_view_id);
        String[]info= getResources().getStringArray(R.array.info);

        ArrayAdapter<String>adapter= new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.textview_id,info);
        listView.setAdapter(adapter);

    }
}
