package com.edwisor.news;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class HomeFragment extends Fragment {


    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        String[] HomeList = {"Donald Trump Says US Immigration Should Be Based On Merit-Based System",
        "Kargil martyr's daughter Gurmehar Kaur: 'This is all I can take",
        "India not to issue démarche to US",
        "Alia Bhatt and I can say no to Karan Johar for a film: Varun Dhawan"};

        ListView listview = (ListView) view.findViewById(R.id.HomeListView);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                HomeList
        );
        listview.setAdapter(listViewAdapter);


        return view;
    }


}
