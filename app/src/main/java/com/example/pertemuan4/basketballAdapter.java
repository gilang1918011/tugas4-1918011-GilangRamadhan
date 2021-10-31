package com.example.pertemuan4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class itemAdapter extends RecyclerView.Adapter<itemAdapter.ItemViewHolder>{
    private ArrayList<item> dataList;
    public itemAdapter(ArrayList<item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public itemAdapter.ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_basketball, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtNamaclub.setText(dataList.get(position).getNamaclub());
        holder.txtpemilik.setText(dataList.get(position).getDevisi());
        holder.txtasal.setText(dataList.get(position).getNamapemainbintang());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNamaclub, txtpemilik, txtasal;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtNamaclub = (TextView)
                    itemView.findViewById(R.id.txt_namaclub);
            txtpemilik = (TextView)
                    itemView.findViewById(R.id.txt_devisi);
            txtasal = (TextView)
                    itemView.findViewById(R.id.txt_namapemainbintang);
        }
    }
}
