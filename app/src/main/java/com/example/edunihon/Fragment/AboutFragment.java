package com.example.edunihon.Fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.edunihon.MainActivity;
import com.example.edunihon.R;

public class AboutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout univ = view.findViewById(R.id.univ_btn);
        LinearLayout scholars = view.findViewById(R.id.scholars_btn);
        LinearLayout learn = view.findViewById(R.id.learn_btn);

        FragmentManager fragmentManager = getParentFragmentManager();

        UniversityFragment universityFragment = new UniversityFragment();
        ScholarshipFragment scholarshipFragment = new ScholarshipFragment();
        LearnFragment learnFragment = new LearnFragment();
        ProfileFragment profileFragment = new ProfileFragment();

        MainActivity mainActivity = (MainActivity) getActivity();

        univ.setOnClickListener( v -> {
            mainActivity.univ.setBackgroundColor(Color.parseColor("#B2B2B2"));
            mainActivity.scholars.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.learn.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.profile.setBackgroundColor(Color.parseColor("#FFFFFF"));

            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, universityFragment, UniversityFragment.class.getSimpleName())
                    .commit();
        });
        scholars.setOnClickListener( v -> {
            mainActivity.univ.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.scholars.setBackgroundColor(Color.parseColor("#B2B2B2"));
            mainActivity.about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.learn.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.profile.setBackgroundColor(Color.parseColor("#FFFFFF"));

            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, scholarshipFragment, ScholarshipFragment.class.getSimpleName())
                    .commit();
        });
        learn.setOnClickListener( v -> {
            mainActivity.univ.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.scholars.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            mainActivity.learn.setBackgroundColor(Color.parseColor("#B2B2B2"));
            mainActivity.profile.setBackgroundColor(Color.parseColor("#FFFFFF"));

            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, learnFragment, LearnFragment.class.getSimpleName())
                    .commit();
        });
    }
}