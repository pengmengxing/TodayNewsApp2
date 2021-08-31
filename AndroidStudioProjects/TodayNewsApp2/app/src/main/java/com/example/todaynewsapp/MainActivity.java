package com.example.todaynewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private NewsAdapter2 mAdapter = null;
    private ListView listView;
    private Context mContext;
    private LinkedList<News> mData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_layout);
        mContext = this;
        listView = (ListView) findViewById(R.id.listview);
        mData = new LinkedList<News>();

        for (int i = 0;i < 3;i++)
        {
            mData.add(new News("小米发布！MIX4 AND PAD5"," "));
            mData.add(new News("全红蝉发文告别奥运"," ",R.drawable.new_day) );
            mData.add(new News("河南老君山为什么突然火了？"," ",R.drawable.laojunshan1,R.drawable.laojunshan2) );
            mData.add(new News("河南十大美食排行！看看有没有你爱吃的！"," "
                    ,R.drawable.food1,R.drawable.food2,R.drawable.food3) );
        }

        mAdapter = new NewsAdapter2(mData, mContext);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(mContext, "点击了第" + position + " 条数据", Toast.LENGTH_SHORT).show();
                }
            }
        );
    }
}