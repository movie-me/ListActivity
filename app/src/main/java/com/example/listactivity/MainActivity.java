package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.movie_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("겨울왕국");
        m.setYear("2013, 미국");
        m.setPoster(R.drawable.winter1);
        models.add(m);

        m = new Model();
        m.setTitle("겨울왕국2");
        m.setYear("2019, 미국");
        m.setPoster(R.drawable.winter2);
        models.add(m);

        m = new Model();
        m.setTitle("리틀 포레스트 2:겨울과 봄");
        m.setYear("2015, 일본");
        m.setPoster(R.drawable.winter3);
        models.add(m);

        m = new Model();
        m.setTitle("겨울 나그네");
        m.setYear("1986, 한국");
        m.setPoster(R.drawable.winter4);
        models.add(m);

        m = new Model();
        m.setTitle("호랑이보다 무서운 겨울손님");
        m.setYear("2017, 한국");
        m.setPoster(R.drawable.winter5);
        models.add(m);

        return models;
    }
}
