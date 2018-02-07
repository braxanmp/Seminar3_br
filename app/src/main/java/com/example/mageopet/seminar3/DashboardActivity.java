package com.example.mageopet.seminar3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void dashboardProxy(View view) {
        Intent dashboardIntent;
        if(view.equals(findViewById(R.id.button_get_quotations))){
            Intent intent = new Intent(this, QuotationActivity.class);
            startActivity(intent);

        }else if(view.equals(findViewById(R.id.button_favourite_quotations))){
            Intent intent = new Intent(this, FavouriteActivity.class);
            startActivity(intent);
        }
        else if(view.equals(findViewById(R.id.button_settings))){
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }
        else if(view.equals(findViewById(R.id.button_about))){
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }

    }
}
