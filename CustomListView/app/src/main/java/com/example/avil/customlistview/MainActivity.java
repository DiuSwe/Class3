package com.example.avil.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[]array;
    int[]flags={R.drawable.comunity,R.drawable.searchplace,R.drawable.monitoring,R.drawable.location,R.drawable.locupdate,R.drawable.log};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.list_view_id);
        array=getResources().getStringArray(R.array.res);
        CustomAdapter adapter= new CustomAdapter(this,array,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You click:"+position, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
