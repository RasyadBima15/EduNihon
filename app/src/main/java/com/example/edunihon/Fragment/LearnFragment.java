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
import android.widget.SearchView;

import com.example.edunihon.Adapter.LearnAdapter;
import com.example.edunihon.Data.DataSource;
import com.example.edunihon.Model.Learn;
import com.example.edunihon.Model.Scholarship;
import com.example.edunihon.R;

import java.util.ArrayList;

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

        SearchView searchView = view.findViewById(R.id.search_view);
        RecyclerView learnRv = view.findViewById(R.id.rv_learn);
        LearnAdapter learnAdapter = new LearnAdapter(DataSource.learns, context);
        learnRv.setAdapter(learnAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<Learn> filteredList = filterLearns(newText, DataSource.learns);
                learnAdapter.updateList(filteredList);
                return false;
            }
        });
    }

    private ArrayList<Learn> filterLearns(String query, ArrayList<Learn> learns) {
        ArrayList<Learn> filteredList = new ArrayList<>();
        for (Learn learn : learns) {
            if (learn.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(learn);
            }
        }
        return filteredList;
    }
}