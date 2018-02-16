package com.example.mageopet.seminar3.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mageopet.seminar3.Quotation;
import com.example.mageopet.seminar3.R;

import java.util.List;

/**
 * Created by bmeci on 16/02/2018.
 */

public class QuotationAdapter extends ArrayAdapter {
    private Context context;
    private int resource;
    private List<Quotation> list;

    public QuotationAdapter(Context context, int resource, List<Quotation> list) {
        super(context, resource, list);
        this.context = context;
        this.resource = resource;
        this.list = list;
    }

    public View  getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.quotation_list_row, null);
        }

        Quotation item = list.get(position);
        TextView quotation = (TextView) view.findViewById(R.id.label_quotation);
        quotation.setText(item.getText());
        TextView author = (TextView) view.findViewById(R.id.label_author);
        author.setText(item.getAuthor());

        return view;
    }
}
