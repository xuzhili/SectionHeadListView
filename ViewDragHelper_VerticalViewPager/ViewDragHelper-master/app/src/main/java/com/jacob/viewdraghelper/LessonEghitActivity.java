package com.jacob.viewdraghelper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LessonEghitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_eghit);

        ListView viewById = (ListView) findViewById(R.id.listview);
//        TextView textView2 = new TextView(this);
//        textView2.setText("hello");
//        textView2.setTextColor(Color.BLUE);
//        viewById.setEmptyView(textView2);
        TextView textView = new TextView(this);
        textView.setText("hello");
        textView.setTextColor(Color.RED);
        viewById.setVisibility(View.GONE);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 0; i++) {
            strings.add("index" + i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        viewById.setAdapter(adapter);
        viewById.addHeaderView(textView);


    }
}
