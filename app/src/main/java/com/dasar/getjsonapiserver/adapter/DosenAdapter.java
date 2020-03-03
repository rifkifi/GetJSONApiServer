package com.dasar.getjsonapiserver.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.dasar.getjsonapiserver.R;
import com.dasar.getjsonapiserver.model.SemuadosenItem;

import java.util.List;
import java.util.Random;

import androidx.recyclerview.widget.RecyclerView;

public class DosenAdapter extends RecyclerView.Adapter<DosenAdapter.DosenHolder>{

    List<SemuadosenItem> semuadosenItemList;
    Context mContext;

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public DosenAdapter(Context context, List<SemuadosenItem> dosenList){
        this.mContext = context;
        semuadosenItemList = dosenList;
    }

    @Override
    public DosenHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dosen, parent, false);
        return new DosenHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DosenHolder holder, int position) {
        final SemuadosenItem semuadosenitem = semuadosenItemList.get(position);
        holder.tvNamaDosen.setText(semuadosenitem.getNama());
        holder.tvNamaMatkul.setText(semuadosenitem.getMatkul());

        String namaDosen = semuadosenitem.getNama();
        String firstCharNamaDosen = namaDosen.substring(0,1);
        TextDrawable drawable = TextDrawable.builder()
                .buildRound(firstCharNamaDosen, getColor());
        holder.ivTextDrawable.setImageDrawable(drawable);
    }

    @Override
    public int getItemCount() {
        return semuadosenItemList.size();
    }

    public class DosenHolder extends RecyclerView.ViewHolder{
        ImageView ivTextDrawable;
        TextView tvNamaDosen;
        TextView tvNamaMatkul;

        public DosenHolder(View itemView) {
            super(itemView);
            ivTextDrawable = itemView.findViewById(R.id.ivTextDrawable);
            tvNamaDosen = itemView.findViewById(R.id.tvNamaDosen);
            tvNamaMatkul = itemView.findViewById(R.id.tvNamaMatkul);
        }
    }

    public int getColor() {
        String color;

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
