package com.example.edunihon.Fragment;

import android.content.Context;
import android.content.Intent;
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

import com.example.edunihon.Config.RetrofitClient;
import com.example.edunihon.Data.DataSource;
import com.example.edunihon.Model.University;
import com.example.edunihon.R;
import com.example.edunihon.Response.UnivResponse;
import com.example.edunihon.Service.ApiService;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UnivDetailFragment extends Fragment {

    Context context;
    int idUniv;
    TextView webpage;
    String url;

    public UnivDetailFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_univ_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayout back = view.findViewById(R.id.back);
        back.setOnClickListener( v -> {
            UniversityFragment universityFragment = new UniversityFragment(context);
            FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, universityFragment, UniversityFragment.class.getSimpleName())
                    .commit();
        });

        TextView univName = view.findViewById(R.id.univName);
        ImageView univImg = view.findViewById(R.id.univImg);
        TextView rank = view.findViewById(R.id.rank);
        TextView city = view.findViewById(R.id.city);
        TextView desc = view.findViewById(R.id.desc);
        LinearLayout btnCta = view.findViewById(R.id.btn_cta);
        webpage= view.findViewById(R.id.webpage);

        Bundle bundle = getArguments();
        idUniv = bundle.getInt("idUniv");

        for (University univ: DataSource.universities) {
            if(univ.getId() == idUniv){
                univName.setText(univ.getName());
                univImg.setImageResource(univ.getImageUniv());
                rank.setText("WUR Ranking: " + univ.getRank());
                city.setText(univ.getCity());
                desc.setText(univ.getDesc());

                getWebPage(univ.getName());

//                System.out.println("Url" + url);

                btnCta.setOnClickListener( v -> {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                });
            }
        }
    }

    public void getWebPage(String univName){
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        Call<List<UnivResponse>> call = apiService.getUniversities(univName);
        call.enqueue(new Callback<List<UnivResponse>>() {
            @Override
            public void onResponse(Call<List<UnivResponse>> call, Response<List<UnivResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<UnivResponse> universities = response.body();
                    for (UnivResponse university : universities) {
                        for (String webPageText : university.getWebPages()) {
                            if (Objects.equals(university.getName(), univName)){
                                webpage.setText(webPageText);
                                url = webPageText;
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Response is not successful or body is null");
                }
            }
            @Override
            public void onFailure(Call<List<UnivResponse>> call, Throwable t) {
                System.out.println("API call failed");
                t.printStackTrace();
            }
        });
    }
}