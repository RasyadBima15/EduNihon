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

import com.example.edunihon.Adapter.UnivAdapter;
import com.example.edunihon.Data.DataSource;
import com.example.edunihon.Model.University;
import com.example.edunihon.R;

import java.util.ArrayList;

public class UniversityFragment extends Fragment {

    Context context;

    public UniversityFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_university, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SearchView searchView = view.findViewById(R.id.search_view);

        RecyclerView univRv = view.findViewById(R.id.rv_univ);
        UnivAdapter univAdapter = new UnivAdapter(DataSource.universities, context);
        univRv.setAdapter(univAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<University> filteredList = filterUniversities(newText, DataSource.universities);
                univAdapter.updateList(filteredList);
                return false;
            }
        });
    }

    private ArrayList<University> filterUniversities(String query, ArrayList<University> universities) {
        ArrayList<University> filteredList = new ArrayList<>();
        for (University university : universities) {
            if (university.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(university);
            }
        }
        return filteredList;
    }
}