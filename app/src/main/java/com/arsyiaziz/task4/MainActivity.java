package com.arsyiaziz.task4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvComputer;
    private List<ComputerModel> models = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvComputer = findViewById(R.id.rv_computer);
        rvComputer.setHasFixedSize(true);

        models.addAll(ComputerDatabase.getListData());

        rvComputer.setLayoutManager(new LinearLayoutManager(this));
        ComputerRecyclerAdapter adapter = new ComputerRecyclerAdapter(models);
        adapter.setOnItemClickCallback(new ComputerRecyclerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ComputerModel data) {
                moreInfo(data);
            }
        });
        rvComputer.setAdapter(adapter);
    }
    void moreInfo(ComputerModel data) {
        Intent intent = new Intent(MainActivity.this, MoreInfoActivity.class);
        intent.putExtra(MoreInfoActivity.name, data.getName());
        intent.putExtra(MoreInfoActivity.summary, data.getSummary());
        intent.putExtra(MoreInfoActivity.photo, data.getPhoto());
        intent.putExtra(MoreInfoActivity.releaseDate, data.getReleaseDate());
        intent.putExtra(MoreInfoActivity.developer, data.getDeveloper());
        intent.putExtra(MoreInfoActivity.introductoryPrice, data.getIntroductoryPrice());
        startActivity(intent);
    }
}