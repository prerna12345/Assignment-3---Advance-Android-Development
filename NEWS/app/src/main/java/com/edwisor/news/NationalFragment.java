package com.edwisor.news;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NationalFragment extends Fragment {


    public NationalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_national, container, false);

        String[] NationalList = {"Kansas shooting: Bar shooting suspect said he thought he'd killed 'Iranians'",
                "Controversial UP minister Prajapati goes missing as police close in",
                "West Bengal BJP leader, accused in child trafficking case, held near Nepal border",
                "AIADMK defends Sasikala as general secretary"};

        ListView listview = (ListView) view.findViewById(R.id.NationalListView);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                NationalList
        );
        listview.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }


}
