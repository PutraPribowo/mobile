package com.developerputra.prihasi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomPenyakitIbuHamil extends RecyclerView.Adapter<CustomPenyakitIbuHamil.MyViewHolder> {

    private ArrayList<InfolearningModel> dataSet;
    Boolean check=false;
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView namalearning,deskripsi,gambar;
        RelativeLayout expandable;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.expandable= (RelativeLayout)itemView.findViewById(R.id.expandableLayout);
            this.namalearning= (TextView)itemView.findViewById(R.id.namalearningText);
            this.deskripsi = (TextView) itemView.findViewById(R.id.deskripsiText);
            this.gambar = (TextView) itemView.findViewById(R.id.linkGambar);
        }
    }

    public CustomPenyakitIbuHamil(ArrayList<InfolearningModel> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_row_infolearning, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check)
                {
                    myViewHolder.expandable.animate()
                            .alpha(0.0f)
                            .setDuration(1000);

                    myViewHolder.expandable.setVisibility(View.GONE);
                    check=true;


                }
                else {
                    myViewHolder.expandable.setVisibility(View.VISIBLE);
                    myViewHolder.expandable.animate()
                            .alpha(1.0f)
                            .setDuration(1000);

                    check=false;

                }
            }
        });

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView namalearning1= holder.namalearning;
        TextView deskripsi1 = holder.deskripsi;
        TextView gambar1 = holder.gambar;

        namalearning1.setText(dataSet.get(listPosition).getNamalearning());
        deskripsi1.setText(dataSet.get(listPosition).getDeskripsi());
        gambar1.setText(dataSet.get(listPosition).getGambar());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
