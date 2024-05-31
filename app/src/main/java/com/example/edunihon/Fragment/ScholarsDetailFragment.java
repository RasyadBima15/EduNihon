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
import com.example.edunihon.Model.Scholarship;
import com.example.edunihon.R;

import org.w3c.dom.Text;

import java.util.Objects;

public class ScholarsDetailFragment extends Fragment {
    Context context;
    int idScholars;

    public ScholarsDetailFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scholars_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayout back = view.findViewById(R.id.back);
        back.setOnClickListener( v -> {
            ScholarshipFragment scholarsFragment = new ScholarshipFragment(context);
            FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, scholarsFragment, ScholarshipFragment.class.getSimpleName())
                    .commit();
        });

        TextView scholarsName = view.findViewById(R.id.scholars_name);
        ImageView scholarsImg = view.findViewById(R.id.scholarsImg);
        TextView provider = view.findViewById(R.id.provider);
        TextView date = view.findViewById(R.id.date);
        TextView avail = view.findViewById(R.id.avail);
        TextView statusPaid = view.findViewById(R.id.statusPaid);
        TextView desc = view.findViewById(R.id.desc);
        LinearLayout btnCta = view.findViewById(R.id.btn_cta);

        Bundle bundle = getArguments();
        if (bundle != null){
            idScholars = bundle.getInt("idScholars");
        }

        for (Scholarship scholarship: DataSource.scholarships) {
            if (scholarship.getId() == idScholars){
                scholarsName.setText(scholarship.getName());
                scholarsImg.setImageResource(scholarship.getImageScholarship());
                provider.setText(scholarship.getProvider());
                date.setText(scholarship.getStartDate() + " - " + scholarship.getEndDate());
                avail.setText(scholarship.getAvailability());

                GradientDrawable drawableClosed = new GradientDrawable();
                drawableClosed.setColor(Color.parseColor("#ABABAB"));
                drawableClosed.setCornerRadius(12);
                if (Objects.equals(scholarship.getAvailability(), "Closed")){
                    avail.setBackground(drawableClosed);
                }

                statusPaid.setText(scholarship.getStatusPaid());
                GradientDrawable drawablePaid = new GradientDrawable();
                drawablePaid.setColor(Color.parseColor("#00E0FF"));
                drawablePaid.setCornerRadius(12);
                if (Objects.equals(scholarship.getStatusPaid(), "Fully Paid")){
                    statusPaid.setBackground(drawablePaid);
                }

                desc.setText(scholarship.getDesc());
                btnCta.setOnClickListener( v -> {
                    String url = scholarship.getWebUrl();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                });
            }
        }
    }
}