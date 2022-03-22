package com.example.kwhotels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class itemsAdapter extends ArrayAdapter<items> {
    List<items> listItems;

    public itemsAdapter(@NonNull Context context, int resource, @NonNull List<items> objects) {
        super(context, resource, objects);

        listItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View view = LayoutInflater.from(getContext()).inflate(R.layout.items, parent, false);

        items currentItem = listItems.get(position);

        TextView itemName = view.findViewById(R.id.name);
        TextView itemPrice = view.findViewById(R.id.price);
        ImageView itemImg = view.findViewById(R.id.image);

        itemName.setText(currentItem.getItemName());
        itemPrice.setText(currentItem.getItemPrice()+"");
        itemImg.setImageResource(currentItem.getItemImg());

        return view;

    }
}
