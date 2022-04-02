package com.example.mproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link aftari#newInstance} factory method to
 * create an instance of this fragment.
 */
public class aftari extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<ContactModel> lstContect;

  //  ArrayList<ContactModel> arrContacts=new ArrayList<>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public aftari() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment aftari.
     */
    // TODO: Rename and change types and number of parameters
    public static aftari newInstance(String param1, String param2) {
        aftari fragment = new aftari();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContect = new ArrayList<>();
        lstContect.add(new ContactModel("01 Ramadan 1443 AH","02 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("02 Ramadan 1443 AH","03 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("03 Ramadan 1443 AH","04 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("04 Ramadan 1443 AH","05 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("05 Ramadan 1443 AH","06 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("06 Ramadan 1443 AH","07 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("07 Ramadan 1443 AH","08 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("08 Ramadan 1443 AH","09 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("09 Ramadan 1443 AH","10 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("10 Ramadan 1443 AH","11 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("11 Ramadan 1443 AH","12 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("12 Ramadan 1443 AH","13 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("13 Ramadan 1443 AH","14 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("14 Ramadan 1443 AH","15 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("15 Ramadan 1443 AH","16 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("16 Ramadan 1443 AH","17 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("17 Ramadan 1443 AH","18 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("18 Ramadan 1443 AH","19 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("19 Ramadan 1443 AH","20 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("20 Ramadan 1443 AH","21 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("21 Ramadan 1443 AH","22 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("22 Ramadan 1443 AH","23 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("23 Ramadan 1443 AH","24 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("24 Ramadan 1443 AH","25 April 2022","04:32","18:31"));
        lstContect.add(new ContactModel("25 Ramadan 1443 AH","26 April 2022","03:32","18:31"));
        lstContect.add(new ContactModel("26 Ramadan 1443 AH","27 April 2022","03:32","18:31"));
        lstContect.add(new ContactModel("27 Ramadan 1443 AH","28 April 2022","03:32","18:31"));
        lstContect.add(new ContactModel("28 Ramadan 1443 AH","29 April 2022","03:32","18:31"));
        lstContect.add(new ContactModel("29 Ramadan 1443 AH","30 April 2022","03:32","18:31"));
        lstContect.add(new ContactModel("30 Ramadan 1443 AH","01 May 2022","03:32","18:31"));
        lstContect.add(new ContactModel("30 Ramadan 1443 AH","01 May 2022","03:32","18:31"));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v= inflater.inflate(R.layout.fragment_aftari, container, false);
        myrecyclerview=(RecyclerView) v.findViewById(R.id.recyclerContact);
        RecyclerContectAdapter recyclerView=new RecyclerContectAdapter(getContext(),lstContect);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerView);
        return v;
    }

}