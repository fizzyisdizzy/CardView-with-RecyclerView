package com.example.fizzy.cardviewwithrecyclerview;

/**
 * Created by Fizzy on 31/08/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<Places> placesList;

    public CardAdapter() {
        super();
        placesList = new ArrayList<Places>();
        Places place = new Places();
        place.setName("London");
        place.setThumbnail(R.drawable.london);
        placesList.add(place);

        place = new Places();
        place.setName("New York");
        place.setThumbnail(R.drawable.ny);
        placesList.add(place);

        place = new Places();
        place.setName("San Francisco");
        place.setThumbnail(R.drawable.sanfran);
        placesList.add(place);

        place = new Places();
        place.setName("Tokyo");
        place.setThumbnail(R.drawable.tokyo);
        placesList.add(place);

        place = new Places();
        place.setName("Budapest");
        place.setThumbnail(R.drawable.budapest);
        placesList.add(place);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Places place = placesList.get(i);
        viewHolder.placeName.setText(place.getName());
        viewHolder.placeImage.setImageResource(place.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView placeImage;
        public TextView placeName;
        public Context context;

        public ViewHolder(final View itemView) {
            super(itemView);
            placeImage = (ImageView) itemView.findViewById(R.id.place_image);
            placeName = (TextView) itemView.findViewById(R.id.place_name);
            context = itemView.getContext();
        }

    }
}





