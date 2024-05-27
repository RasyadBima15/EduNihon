package com.example.edunihon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.edunihon.Fragment.AboutFragment;
import com.example.edunihon.Fragment.LearnFragment;
import com.example.edunihon.Fragment.ProfileFragment;
import com.example.edunihon.Fragment.ScholarshipFragment;
import com.example.edunihon.Fragment.UniversityFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView userLogo = findViewById(R.id.user_logo);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

        userLogo.setOnClickListener(v -> {
            openDrawer(drawerLayout);
        });

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

        LinearLayout univ = findViewById(R.id.univ_btn);
        LinearLayout scholars = findViewById(R.id.scholars_btn);
        LinearLayout about = findViewById(R.id.about_btn);
        LinearLayout learn = findViewById(R.id.learn_btn);
        LinearLayout profile = findViewById(R.id.profile_btn);

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

    public void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.END);
    }

    public void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.END)){
            drawerLayout.closeDrawer(GravityCompat.END);
        }
    }
}