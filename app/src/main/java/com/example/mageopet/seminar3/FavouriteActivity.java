package com.example.mageopet.seminar3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mageopet.seminar3.adapters.QuotationAdapter;

import java.util.ArrayList;

import static android.content.Intent.ACTION_VIEW;

public class FavouriteActivity extends AppCompatActivity {
    String authorName = "Albert Einstein";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        ListView lv = (ListView) findViewById(R.id.list_view);
        QuotationAdapter adapter = new QuotationAdapter(
                this, R.layout.quotation_list_row, getMockQuotations());
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                authorName = ((TextView) view.findViewById(R.id.label_author)).getText().toString();
                if (authorName != null && !authorName.isEmpty()) {
                    showAuthorInfo(view);
                } else
                    Toast.makeText(getApplicationContext(), getText(R.string.favourite_author_error), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showAuthorInfo(View view) {
        Intent authorIntent = new Intent();
        authorIntent.setAction(Intent.ACTION_VIEW);
        authorIntent.setData(Uri.parse(getText(R.string.author_uri_wiki) + authorName));
        startActivity(authorIntent);
    }

    public ArrayList<Quotation> getMockQuotations(){
        ArrayList<Quotation> res = new ArrayList<>();
        res.add(new Quotation("El pasado puede doler pero, tal y como yo lo veo, puedes: o huir de él o aprender",
                "Rafiki"));
        res.add(new Quotation("La flor que florece en la adversidad es la más rara y hermosa de todas",
                "Fa Zhou"));
        res.add(new Quotation("Algunas veces el camino correcto no es el más fácil",
                "Abuela Sauce"));
        res.add(new Quotation("Un héroe verdadero no lo es por el tamaño de sus músculos, sino por el de su corazón",
                "Hércules"));
        res.add(new Quotation("Gracias por esta aventura, ¡ahora te toca a ti vivir una nueva!",
                "Ellie"));
        res.add(new Quotation("Prefiero morir mañana que vivir cien años sin haberte conocido",
                "John Smith"));
        res.add(new Quotation("Hay personas por las que vale la pena derretirse",
                "Olaf"));
        res.add(new Quotation("Ohana significa familia",
                "Lilo"));
        res.add(new Quotation("Una dama no empieza peleas, pero puede terminarlas",
                "Marie"));
        res.add(new Quotation("Gatito!",
                "Boo"));
        res.add(new Quotation("Dragón, dragón, no lagarto, yo no hago eso de la lengua",
                "Mushu"));
        return res;
    }
}
