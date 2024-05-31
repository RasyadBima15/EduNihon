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

import com.example.edunihon.Adapter.ScholarsAdapter;
import com.example.edunihon.Data.DataSource;
import com.example.edunihon.Model.Scholarship;
import com.example.edunihon.Model.University;
import com.example.edunihon.R;

import java.util.ArrayList;

public class ScholarshipFragment extends Fragment {

    Context context;
    SearchView searchView;

    public ScholarshipFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scholarship, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        searchView = view.findViewById(R.id.search_view);
        RecyclerView scholarsRv = view.findViewById(R.id.rv_scholars);
        ScholarsAdapter scholarsAdapter = new ScholarsAdapter(DataSource.scholarships, context);
        scholarsRv.setAdapter(scholarsAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<Scholarship> filteredList = filterScholarships(newText, DataSource.scholarships);
                scholarsAdapter.updateList(filteredList);
                return false;
            }
        });
    }

    private ArrayList<Scholarship> filterScholarships(String query, ArrayList<Scholarship> scholarships) {
        ArrayList<Scholarship> filteredList = new ArrayList<>();
        for (Scholarship scholarship : scholarships) {
            if (scholarship.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(scholarship);
            }
        }
        return filteredList;
    }

    public void resetSearchView() {
        if (searchView != null) {
            searchView.setQuery("", false);
        }
    }
}