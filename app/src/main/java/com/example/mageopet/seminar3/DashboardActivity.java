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

        }else if(view.equals(findViewById(R.id.button_favourite_quotations))){

        }
        else if(view.equals(findViewById(R.id.button_settings))){

        }
        else if(view.equals(findViewById(R.id.button_about))){

        }

    }
}
