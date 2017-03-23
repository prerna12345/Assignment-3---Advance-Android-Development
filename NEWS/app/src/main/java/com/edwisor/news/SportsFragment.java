package com.edwisor.news;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_international, container, false);

        String[] SportsList = {"Pietersen, Mills pull out of PSL final",
                "Find out who won as AJ Styles faced Luke Harper to headline WrestleMania with WWE champ Bray Wyatt",
                "WWE Raw Results: Roman Reigns, Braun Strowman tear down the ring ahead of Fastlane",
                "England call-up Tom Curran for West Indies series"};

        ListView listview = (ListView) view.findViewById(R.id.SportsListView);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                SportsList
        );
        listview.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }


}
