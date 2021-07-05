package com.creatures.rvlinearlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.view_holder>{

    List<String> titles;
    List<String> sub_titles;
    List<Integer> images;
    LayoutInflater inflater;

    public RecyclerAdapter(Context context, List<String> titles , List<String> sub_titles , List<Integer> images) {

        this.titles = titles;
        this.sub_titles = sub_titles;
        this.images = images;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /* View view = inflater.inflate(R.layout.custom_grid_layout,parent,false);
        return new ViewHolder(view);*?
         */
        View v = inflater.inflate(R.layout.help_cards,parent,false);
        return new view_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.view_holder holder, int position) {

        holder.title.setText(titles.get(position));
        holder.gridIcon.setImageResource(images.get(position));
        holder.sub_title.setText(sub_titles.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    class view_holder extends RecyclerView.ViewHolder{

        TextView title,sub_title;
        ImageView gridIcon;

        public view_holder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.new_text_view_1);
            gridIcon = itemView.findViewById(R.id.image_view_new);
            sub_title= itemView.findViewById(R.id.new_text_view_2);
        }
    }
}
