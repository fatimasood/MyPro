package com.example.mproject.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.mproject.R;

import com.example.mproject.databinding.FragmentHomeBinding;
import com.example.mproject.duaActivity;

public class HomeFragment extends Fragment {
    private Button toastBtn;
    Activity table;

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home,container,false);

        table=getActivity();

        return view;

    }

    public void onStart(){
        super.onStart();
        Button b=(Button) table.findViewById(R.id.nextbtn1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(table,duaActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}