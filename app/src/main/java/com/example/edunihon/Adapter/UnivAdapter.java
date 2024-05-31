package com.example.edunihon.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edunihon.Fragment.LearnDetailFragment;
import com.example.edunihon.Fragment.ScholarsDetailFragment;
import com.example.edunihon.Fragment.UnivDetailFragment;
import com.example.edunihon.Fragment.UniversityFragment;
import com.example.edunihon.Model.University;
import com.example.edunihon.R;

import java.util.ArrayList;

public class UnivAdapter extends RecyclerView.Adapter<UnivAdapter.ViewHolder>{
    private final ArrayList<University> universities;
    Context context;

    public UnivAdapter(ArrayList<University> universities, Context context) {
        this.universities = universities;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.university_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        University university = universities.get(position);
        holder.setData(university);
    }

    @Override
    public int getItemCount() {
        return universities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imageUniv;
        private final TextView nameUniv, rank, city;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageUniv = itemView.findViewById(R.id.imageUniv);
            nameUniv = itemView.findViewById(R.id.nameUniv);
            rank = itemView.findViewById(R.id.WURrank);
            city = itemView.findViewById(R.id.city);
        }

        public void setData(University university) {
            imageUniv.setImageResource(university.getImageUniv());
            nameUniv.setText(university.getName());
            rank.setText("WUR Ranking: " + String.valueOf(university.getRank()));
            city.setText(university.getCity());

            UnivDetailFragment univDetailFragment = new UnivDetailFragment(context);

            itemView.setOnClickListener(v -> {
                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, univDetailFragment, UniversityFragment.class.getSimpleName())
                        .commit();
            });

            itemView.setOnClickListener( v -> {
                Bundle bundle = new Bundle();
                bundle.putInt("idUniv", university.getId());

                univDetailFragment.setArguments(bundle);
                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, univDetailFragment, UnivDetailFragment.class.getSimpleName())
                        .commit();
            });

        }
    }
}
