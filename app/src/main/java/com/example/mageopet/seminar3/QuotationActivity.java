package com.example.mageopet.seminar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QuotationActivity extends AppCompatActivity {
    TextView textView_author, textView_quote;
    private static Menu optionsMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotation);
        textView_author = findViewById(R.id.textView_author);
        textView_quote = findViewById(R.id.textView_quote);
        modifyName("brayan");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.quotation_menu, menu);
        optionsMenu = menu;
        optionsMenu.findItem(R.id.item_add).setVisible(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menu){
        switch (menu.getItemId()) {
            case R.id.item_add:
                menu.setVisible(true);
                newQuotation(textView_author.getRootView());
                return true;
            case R.id.item_refresh:
                return true;
            default:
                return false;
        }
    }

    private void modifyName(String name){
        textView_quote.setText(String.format(getResources().getString(R.string.quotation_refresh),name));


    }

    public void newQuotation(View view) {
        textView_author.setText(R.string.quotation_sample_author);
        textView_quote.setText(R.string.quotation_sample_quotation);
    }
}
