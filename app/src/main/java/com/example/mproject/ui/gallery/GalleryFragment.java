package com.example.mproject.ui.gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.mproject.Name2;
import com.example.mproject.R;
import com.example.mproject.databinding.FragmentGalleryBinding;


public class GalleryFragment extends Fragment {
    private Button toastBtn;
    Activity table;

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      View view= inflater.inflate(R.layout.fragment_gallery,container,false);

        table=getActivity();

      return view;

    }
    public void onStart() {
        super.onStart();
        Button b = (Button) table.findViewById(R.id.nextbtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(table, Name2.class);
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