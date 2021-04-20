package com.arsyiaziz.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MoreInfoActivity extends AppCompatActivity {
    public final static String name = "COMPUTER_NAME";
    public final static String summary = "COMPUTER_SUMMARY";
    public final static String releaseDate = "COMPUTER_RELEASE_DATE";
    public final static String photo = "COMPUTER_PHOTO";
    public final static String introductoryPrice = "INTRODUCTORY_PRICE";
    public final static String developer = "DEVELOPER";

    private ImageView ivComputerPhoto;
    private TextView tvComputerName;
    private TextView tvComputerReleaseDate;
    private TextView tvComputerSummary;
    private TextView tvComputerDeveloper;
    private TextView tvComputerIntroductoryPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        ivComputerPhoto = findViewById(R.id.iv_computer_photo);
        tvComputerName = findViewById(R.id.tv_computer_name);
        tvComputerReleaseDate = findViewById(R.id.tv_computer_release_date);
        tvComputerSummary = findViewById(R.id.tv_computer_summary);
        tvComputerDeveloper = findViewById(R.id.tv_computer_developer);
        tvComputerIntroductoryPrice = findViewById(R.id.tv_computer_introductory_price);


        tvComputerName.setText(getIntent().getStringExtra(name));
        ivComputerPhoto.setImageResource(getIntent().getIntExtra(photo, 0));
        tvComputerReleaseDate.setText(getIntent().getStringExtra(releaseDate));
        tvComputerSummary.setText(getIntent().getStringExtra(summary));
        tvComputerDeveloper.setText(getIntent().getStringExtra(developer));
        tvComputerIntroductoryPrice.setText(getIntent().getStringExtra(introductoryPrice));
    }
}