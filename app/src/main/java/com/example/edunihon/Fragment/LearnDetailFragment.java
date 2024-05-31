package com.example.edunihon.Fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.edunihon.Data.DataSource;
import com.example.edunihon.Model.Learn;
import com.example.edunihon.Model.Scholarship;
import com.example.edunihon.R;

import java.util.ArrayList;
import java.util.Objects;

public class LearnDetailFragment extends Fragment {
    Context context;
    int idLearn;

    public LearnDetailFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_learn_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayout back = view.findViewById(R.id.back);
        back.setOnClickListener( v -> {
            LearnFragment learnFragment = new LearnFragment(context);
            FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, learnFragment, LearnFragment.class.getSimpleName())
                    .commit();
        });

        TextView appName = view.findViewById(R.id.appName);
        ImageView appImg = view.findViewById(R.id.appImg);
        TextView level = view.findViewById(R.id.level);
        ImageView flag =  view.findViewById(R.id.flag);
        LinearLayout flagContainer = view.findViewById(R.id.flag_container);
        TextView desc = view.findViewById(R.id.desc);
        LinearLayout btnCta = view.findViewById(R.id.btn_cta);

        Bundle bundle = getArguments();
        if (bundle != null){
            idLearn= bundle.getInt("idLearn");
        }

        for (Learn learn: DataSource.learns) {
            if (learn.getId() == idLearn){
                appName.setText(learn.getName());
                appImg.setImageResource(learn.getImageLearn());
                level.setText(learn.getLevel());

                GradientDrawable drawablePemula = new GradientDrawable();
                drawablePemula.setColor(Color.parseColor("#1DFC33"));
                drawablePemula.setCornerRadius(20);

                GradientDrawable drawableMahir = new GradientDrawable();
                drawableMahir.setColor(Color.parseColor("#FE9191"));
                drawableMahir.setCornerRadius(20);

                if (Objects.equals(learn.getLevel(), "Pemula")){
                    level.setBackground(drawablePemula);
                } else if (Objects.equals(learn.getLevel(), "Mahir")){
                    level.setBackground(drawableMahir);
                }

                ArrayList<Integer> flags = learn.getCountry();
                if (flags.size() > 1){
                    ImageView flagImageView = new ImageView(context);

                    flagImageView.setId(View.generateViewId());

                    int width = 100;
                    int height = ViewGroup.LayoutParams.MATCH_PARENT;

                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
                    int marginEnd = 2;
                    layoutParams.setMarginEnd(marginEnd);
                    flag.setImageResource(flags.get(0));
                    flagImageView.setImageResource(flags.get(1));
                    flagImageView.setLayoutParams(layoutParams);
                    flagContainer.addView(flagImageView);
                } else {
                    flag.setImageResource(flags.get(0));
                }
                desc.setText(learn.getDesc());
                btnCta.setOnClickListener( v -> {
                    String url = learn.getApp();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                });
            }
        }
    }
}