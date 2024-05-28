package com.example.edunihon.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.example.edunihon.R;

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CheckBox checkBoxInggris = view.findViewById(R.id.checkbox_inggris);
        CheckBox checkBoxJepang = view.findViewById(R.id.checkbox_jepang);
        RadioGroup radioGroupInggris = view.findViewById(R.id.radioGroup_inggris);
        RadioGroup radioGroupJepang = view.findViewById(R.id.radioGroup_jepang);

        checkBoxInggris.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    radioGroupInggris.setVisibility(View.VISIBLE);
                } else {
                    radioGroupInggris.setVisibility(View.GONE);
                    radioGroupInggris.clearCheck();
                }
            }
        });
        checkBoxJepang.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    radioGroupJepang.setVisibility(View.VISIBLE);
                } else {
                    radioGroupJepang.setVisibility(View.GONE);
                    radioGroupJepang.clearCheck();
                }
            }
        });
    }
}