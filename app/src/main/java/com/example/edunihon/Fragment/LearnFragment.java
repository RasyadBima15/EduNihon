package com.example.edunihon.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edunihon.Adapter.LearnAdapter;
import com.example.edunihon.Data.DataSource;
import com.example.edunihon.R;

public class LearnFragment extends Fragment {
    Context context;
    public LearnFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_learn, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView learnRv = view.findViewById(R.id.rv_learn);
        LearnAdapter learnAdapter = new LearnAdapter(DataSource.learns, context);
        learnRv.setAdapter(learnAdapter);
    }
}