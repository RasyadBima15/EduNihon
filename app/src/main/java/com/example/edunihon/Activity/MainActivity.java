package com.example.edunihon.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.edunihon.Fragment.AboutFragment;
import com.example.edunihon.Fragment.LearnFragment;
import com.example.edunihon.Fragment.ProfileFragment;
import com.example.edunihon.Fragment.ScholarshipFragment;
import com.example.edunihon.Fragment.UniversityFragment;
import com.example.edunihon.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    public LinearLayout univ, scholars, about, learn, profile;
    SharedPreferences preferencesLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferencesLogin = this.getSharedPreferences("login_status", MODE_PRIVATE);

        ImageView userLogo = findViewById(R.id.user_logo);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

        userLogo.setOnClickListener(v -> {
            openDrawer(drawerLayout);
        });

        TextView profileCta = findViewById(R.id.profile);
        TextView logout = findViewById(R.id.logout);

        FragmentManager fragmentManager = getSupportFragmentManager();
        AboutFragment aboutFragment = new AboutFragment();
        Fragment fragmentAbout = fragmentManager.findFragmentByTag(AboutFragment.class.getSimpleName());

        UniversityFragment universityFragment = new UniversityFragment();
        Fragment fragmentUniversity = fragmentManager.findFragmentByTag(UniversityFragment.class.getSimpleName());

        ScholarshipFragment scholarshipFragment = new ScholarshipFragment();
        Fragment fragmentScholarship = fragmentManager.findFragmentByTag(ScholarshipFragment.class.getSimpleName());

        LearnFragment learnFragment = new LearnFragment();
        Fragment fragmentLearn = fragmentManager.findFragmentByTag(LearnFragment.class.getSimpleName());

        ProfileFragment profileFragment = new ProfileFragment();
        Fragment fragmentProfile = fragmentManager.findFragmentByTag(ProfileFragment.class.getSimpleName());

        if (!(fragmentAbout instanceof AboutFragment)){
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, aboutFragment, AboutFragment.class.getSimpleName())
                    .commit();
        }

        profileCta.setOnClickListener( v -> {
            univ.setBackgroundColor(Color.parseColor("#FFFFFF"));
            scholars.setBackgroundColor(Color.parseColor("#FFFFFF"));
            about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            learn.setBackgroundColor(Color.parseColor("#FFFFFF"));
            profile.setBackgroundColor(Color.parseColor("#B2B2B2"));

            closeDrawer(drawerLayout);

            if (!(fragmentProfile instanceof ProfileFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, profileFragment, ProfileFragment.class.getSimpleName())
                        .commit();
            }
        });

        logout.setOnClickListener( v -> {
            showLogoutDialog();
        });

        univ = findViewById(R.id.univ_btn);
        scholars = findViewById(R.id.scholars_btn);
        about = findViewById(R.id.about_btn);
        learn = findViewById(R.id.learn_btn);
        profile = findViewById(R.id.profile_btn);

        univ.setOnClickListener( v -> {
            univ.setBackgroundColor(Color.parseColor("#B2B2B2"));
            scholars.setBackgroundColor(Color.parseColor("#FFFFFF"));
            about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            learn.setBackgroundColor(Color.parseColor("#FFFFFF"));
            profile.setBackgroundColor(Color.parseColor("#FFFFFF"));

            if (!(fragmentUniversity instanceof UniversityFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, universityFragment, UniversityFragment.class.getSimpleName())
                        .commit();
            }
        });

        scholars.setOnClickListener( v -> {
            univ.setBackgroundColor(Color.parseColor("#FFFFFF"));
            scholars.setBackgroundColor(Color.parseColor("#B2B2B2"));
            about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            learn.setBackgroundColor(Color.parseColor("#FFFFFF"));
            profile.setBackgroundColor(Color.parseColor("#FFFFFF"));

            if (!(fragmentScholarship instanceof ScholarshipFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, scholarshipFragment, ScholarshipFragment.class.getSimpleName())
                        .commit();
            }
        });

        about.setOnClickListener( v -> {
            univ.setBackgroundColor(Color.parseColor("#FFFFFF"));
            scholars.setBackgroundColor(Color.parseColor("#FFFFFF"));
            about.setBackgroundColor(Color.parseColor("#B2B2B2"));
            learn.setBackgroundColor(Color.parseColor("#FFFFFF"));
            profile.setBackgroundColor(Color.parseColor("#FFFFFF"));

            if (!(fragmentAbout instanceof AboutFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, aboutFragment, AboutFragment.class.getSimpleName())
                        .commit();
            }
        });

        learn.setOnClickListener( v -> {
            univ.setBackgroundColor(Color.parseColor("#FFFFFF"));
            scholars.setBackgroundColor(Color.parseColor("#FFFFFF"));
            about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            learn.setBackgroundColor(Color.parseColor("#B2B2B2"));
            profile.setBackgroundColor(Color.parseColor("#FFFFFF"));

            if (!(fragmentLearn instanceof LearnFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, learnFragment, LearnFragment.class.getSimpleName())
                        .commit();
            }
        });

        profile.setOnClickListener( v -> {
            univ.setBackgroundColor(Color.parseColor("#FFFFFF"));
            scholars.setBackgroundColor(Color.parseColor("#FFFFFF"));
            about.setBackgroundColor(Color.parseColor("#FFFFFF"));
            learn.setBackgroundColor(Color.parseColor("#FFFFFF"));
            profile.setBackgroundColor(Color.parseColor("#B2B2B2"));

            if (!(fragmentProfile instanceof ProfileFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, profileFragment, ProfileFragment.class.getSimpleName())
                        .commit();
            }
        });
    }

    private void showLogoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("logout");
        builder.setMessage("Apakah Anda yakin ingin logout?");
        builder.setPositiveButton("Ya", (dialog, which) -> {
            SharedPreferences.Editor editor = preferencesLogin.edit();
            editor.putBoolean("login", false);
            editor.apply();

            Intent intent = new Intent(this, LoginActivity.class);
            finish();
            startActivity(intent);
        });
        builder.setNegativeButton("Tidak", (dialog, which) -> {

        });
        AlertDialog dialog = builder.create();
        dialog.setOnShowListener(dialogInterface -> {
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.red));
            dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.red));
        });
        dialog.show();
    }

    public void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.END);
    }

    public void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.END)){
            drawerLayout.closeDrawer(GravityCompat.END);
        }
    }
}