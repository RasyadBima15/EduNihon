package com.example.edunihon.Fragment;

import android.content.Context;
import android.content.SharedPreferences;
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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.edunihon.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Objects;

public class ProfileFragment extends Fragment {

    String education, fullnameText, univText, programText, educationText;
    Context context;
    SharedPreferences preferences;

    public ProfileFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextInputEditText fullname = view.findViewById(R.id.nama_lengkap);
        TextInputEditText univ = view.findViewById(R.id.universitas);
        TextInputEditText program = view.findViewById(R.id.program_studi);

        RadioGroup radioEdu = view.findViewById(R.id.radio_edu);

        LinearLayout saveBtn = view.findViewById(R.id.save_btn);

        preferences = context.getSharedPreferences("profile_pref", Context.MODE_PRIVATE);

        fullnameText = preferences.getString("fullname", "");
        educationText = preferences.getString("education", "");
        univText = preferences.getString("universitas", "");
        programText = preferences.getString("program", "");

        fullname.setText(fullnameText);
        univ.setText(univText);
        program.setText(programText);
        for (int i = 0; i < radioEdu.getChildCount(); i++) {
            View viewRadio = radioEdu.getChildAt(i);
            if (viewRadio instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) viewRadio;
                education = radioButton.getText().toString();
                if (education.equals(educationText)) {
                    radioButton.setChecked(true);
                    break;
                }
            }
        }

        radioEdu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = view.findViewById(checkedId);
                education = radioButton.getText().toString();
            }
        });

        saveBtn.setOnClickListener( v -> {
            fullnameText = fullname.getText().toString().trim();
            univText = univ.getText().toString().trim();
            programText = program.getText().toString().trim();

            if (fullnameText.isEmpty() || education.isEmpty() || univText.isEmpty() || programText.isEmpty()) {
                Toast.makeText(context, "Semua kolom wajib diisi!", Toast.LENGTH_SHORT).show();
            } else {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("fullname", fullnameText);
                editor.putString("education", education);
                editor.putString("universitas", univText);
                editor.putString("program", programText);

                editor.apply();

                Toast.makeText(context, "Profile berhasil disimpan!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}