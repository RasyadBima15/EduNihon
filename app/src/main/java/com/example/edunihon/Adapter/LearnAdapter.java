package com.example.edunihon.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edunihon.Fragment.AboutFragment;
import com.example.edunihon.Fragment.LearnDetailFragment;
import com.example.edunihon.Model.Learn;
import com.example.edunihon.R;

import java.util.ArrayList;
import java.util.Objects;

public class LearnAdapter extends RecyclerView.Adapter<LearnAdapter.ViewHolder>{
    private final ArrayList<Learn> learns;
    Context context;

    public LearnAdapter(ArrayList<Learn> learns, Context context) {
        this.learns = learns;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.learn_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Learn learn = learns.get(position);
        holder.setData(learn);
    }

    @Override
    public int getItemCount() {
        return learns.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView appName, level;
        private final ImageView imageApp, flag;
        private final LinearLayout flagLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageApp = itemView.findViewById(R.id.imageApp);
            flag = itemView.findViewById(R.id.flag);
            appName = itemView.findViewById(R.id.appName);
            level = itemView.findViewById(R.id.level);
            flagLayout = itemView.findViewById(R.id.flagLayout);
        }

        public void setData(Learn learn) {
            appName.setText(learn.getName());
            level.setText(learn.getLevel());
            imageApp.setImageResource(learn.getImageLearn());

            GradientDrawable drawablePemula = new GradientDrawable();
            drawablePemula.setColor(Color.parseColor("#1DFC33"));
            drawablePemula.setCornerRadius(6);

            GradientDrawable drawableMahir = new GradientDrawable();
            drawableMahir.setColor(Color.parseColor("#FE9191"));
            drawableMahir.setCornerRadius(6);

            if (Objects.equals(learn.getLevel(), "Pemula")){
                level.setBackground(drawablePemula);
            } else if (Objects.equals(learn.getLevel(), "Mahir")){
                level.setBackground(drawableMahir);
            }

            ArrayList<Integer> flags = learn.getCountry();
            if (flags.size() > 1){
                ImageView newImageView = new ImageView(context);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        70,
                        110
                );
                params.setMargins(0, 7, 9, 0);
                newImageView.setLayoutParams(params);
                flag.setImageResource(flags.get(0));
                newImageView.setImageResource(flags.get(1));
                flagLayout.addView(newImageView);
            } else {
                flag.setImageResource(flags.get(0));
            }

            LearnDetailFragment learnDetailFragment = new LearnDetailFragment(context);

            itemView.setOnClickListener(v -> {
                Bundle bundle = new Bundle();
                bundle.putInt("idLearn", learn.getId());

                learnDetailFragment.setArguments(bundle);
                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, learnDetailFragment, LearnDetailFragment.class.getSimpleName())
                        .commit();
            });
        }
    }
}
