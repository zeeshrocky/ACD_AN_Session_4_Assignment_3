package com.example.admin.gridview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView listview = (GridView) findViewById(R.id.listView);

        BaseAdaptorLearn learnadaptor = new BaseAdaptorLearn(this);

        listview.setAdapter(learnadaptor);
    }
}