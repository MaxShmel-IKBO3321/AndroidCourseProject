package com.example.shadowfighthandbook.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shadowfighthandbook.EquipPage;
import com.example.shadowfighthandbook.R;
import com.example.shadowfighthandbook.model.Equips;

import java.util.List;

public class EquipAdapter extends RecyclerView.Adapter<EquipAdapter.EquipViewHolder> {

    Context context;
    List<Equips> equips;

    public EquipAdapter(Context context, List<Equips> equips) {
        this.context = context;
        this.equips = equips;
    }

    @NonNull
    @Override
    public EquipViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View equipItems = LayoutInflater.from(context).inflate(R.layout.eqipment_item, parent, false);
        return new EquipAdapter.EquipViewHolder(equipItems);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.equipBg.setBackgroundColor(Color.parseColor(equips.get(position).getColor()));
        int imageID = context.getResources().getIdentifier(equips.get(position).getImg(), "drawable", context.getPackageName());
        holder.equipImage.setImageResource(imageID);
        holder.equipTitle.setText(equips.get(position).getTitle());
        holder.equipFaction.setText(equips.get(position).getFaction());
        holder.equipChapter.setText(equips.get(position).getChapter());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EquipPage.class);
                intent.putExtra("equipBg", Color.parseColor(equips.get(position).getColor()));
                intent.putExtra("equipPageImage", imageID);
                intent.putExtra("textView3", equips.get(position).getTitle());
                intent.putExtra("equipPageFaction", equips.get(position).getFaction());
                intent.putExtra("equipPageChapter", equips.get(position).getChapter());
                intent.putExtra("textView4", equips.get(position).getText());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return equips.size();
    }

    public static final class EquipViewHolder extends RecyclerView.ViewHolder{

        LinearLayout equipBg;
        ImageView equipImage;

        TextView equipTitle;
        TextView equipFaction;
        TextView equipChapter;

        public EquipViewHolder(@NonNull View itemView) {
            super(itemView);

            equipBg = itemView.findViewById(R.id.equipBg);
            equipImage = itemView.findViewById(R.id.equipImage);
            equipTitle = itemView.findViewById(R.id.equipTitle);
            equipFaction = itemView.findViewById(R.id.equipFaction);
            equipChapter = itemView.findViewById(R.id.equipChapter);
        }


    }
}
