package com.example.edunihon.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edunihon.Activity.MainActivity;
import com.example.edunihon.Fragment.LearnDetailFragment;
import com.example.edunihon.Fragment.ScholarsDetailFragment;
import com.example.edunihon.Fragment.ScholarshipFragment;
import com.example.edunihon.Model.Scholarship;
import com.example.edunihon.Model.University;
import com.example.edunihon.R;

import java.util.ArrayList;
import java.util.Objects;

public class ScholarsAdapter extends RecyclerView.Adapter<ScholarsAdapter.ViewHolder>{
    private ArrayList<Scholarship> scholarships;
    Context context;

    public ScholarsAdapter(ArrayList<Scholarship> scholarships, Context context) {
        this.scholarships = scholarships;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.scholarship_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Scholarship scholarship = scholarships.get(position);
        holder.setData(scholarship);
    }

    @Override
    public int getItemCount() {
        return scholarships.size();
    }

    public void updateList(ArrayList<Scholarship> newList) {
        scholarships = newList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageScholars;
        private final TextView nameScholars, provider, availability, typeScholars;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageScholars = itemView.findViewById(R.id.imageScholars);
            nameScholars = itemView.findViewById(R.id.nameScholars);
            provider = itemView.findViewById(R.id.provider);
            availability = itemView.findViewById(R.id.availability);
            typeScholars = itemView.findViewById(R.id.typeScholars);
        }

        public void setData(Scholarship scholarship) {
            imageScholars.setImageResource(scholarship.getImageScholarship());
            nameScholars.setText(scholarship.getName());
            provider.setText(scholarship.getProvider());
            availability.setText(scholarship.getAvailability());

            GradientDrawable drawableClosed = new GradientDrawable();
            drawableClosed.setColor(Color.parseColor("#ABABAB"));
            drawableClosed.setCornerRadius(12);

            GradientDrawable drawablePaid = new GradientDrawable();
            drawablePaid.setColor(Color.parseColor("#00E0FF"));
            drawablePaid.setCornerRadius(12);
            if (Objects.equals(scholarship.getAvailability(), "Closed")){
                availability.setBackground(drawableClosed);
            }
            typeScholars.setText(scholarship.getStatusPaid());
            if (Objects.equals(scholarship.getStatusPaid(), "Fully Paid")){
                typeScholars.setBackground(drawablePaid);
            }

            ScholarsDetailFragment scholarsDetailFragment = new ScholarsDetailFragment(context);

            itemView.setOnClickListener(v -> {
                InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(itemView.getWindowToken(), 0);

                Bundle bundle = new Bundle();
                bundle.putInt("idScholars", scholarship.getId());

                scholarsDetailFragment.setArguments(bundle);

                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, scholarsDetailFragment, ScholarsDetailFragment.class.getSimpleName())
                        .commit();
            });
        }
    }
}
