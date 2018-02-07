package com.example.mageopet.seminar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuotationActivity extends AppCompatActivity {
    TextView textView_author, textView_quote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotation);
        textView_author = findViewById(R.id.textView_author);
        textView_quote = findViewById(R.id.textView_quote);
        modifyName("brayan");
    }

    private void modifyName(String name){
        textView_quote.setText(String.format(getResources().getString(R.string.quotation_refresh),name));


    }

    public void newQuotation(View view) {
        textView_author.setText(R.string.quotation_sample_author);
        textView_quote.setText(R.string.quotation_sample_quotation);
    }
}
