package com.ferinabay.klasemenclient.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import com.ferinabay.klasemenclient.Model.Klasemen;
import com.ferinabay.klasemenclient.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KlasemenAdapter extends RecyclerView.Adapter<KlasemenAdapter.ViewHolder> {
    List<Klasemen> klasemenList;
    public KlasemenAdapter(List<Klasemen> mklasemenList){
        klasemenList = mklasemenList;
    }
    @NonNull
    @Override
    public KlasemenAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row, parent, false);
        return new ViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull KlasemenAdapter.ViewHolder holder, int position) {
        holder.txtId_tim.setText("Id Tim = " + klasemenList.get(position).getId_tim());
        holder.txtNama_tim.setText("Nama Tim = " + klasemenList.get(position).getNama_tim());
        holder.txtP.setText("P = " + klasemenList.get(position).getP());
        holder.txtW.setText("W = " + klasemenList.get(position).getW());
        holder.txtD.setText("D = " + klasemenList.get(position).getD());
        holder.txtL.setText("L = " + klasemenList.get(position).getL());
        holder.txtF.setText("F = " + klasemenList.get(position).getF());
        holder.txtA.setText("A = " + klasemenList.get(position).getA());
        holder.txtGd.setText("Gd = " + klasemenList.get(position).getGd());
        holder.txtPts.setText("Pts = " + klasemenList.get(position).getPts());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtId_tim, txtNama_tim, txtP, txtW, txtD, txtL, txtF, txtA, txtGd, txtPts;
        public ViewHolder(View mView) {
            super(mView);
            txtId_tim = mView.findViewById(R.id.idnotabel);
            txtNama_tim = mView.findViewById(R.id.clubname);
            txtP = mView.findViewById(R.id.p);
            txtW = mView.findViewById(R.id.w);
            txtD = mView.findViewById(R.id.d);
            txtL = mView.findViewById(R.id.l);
            txtF = mView.findViewById(R.id.f);
            txtA = mView.findViewById(R.id.a);
            txtGd = mView.findViewById(R.id.gd);
            txtPts = mView.findViewById(R.id.pts);
        }
    }
}
