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
public class InternationalFragment extends Fragment {


    public InternationalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_international, container, false);

        String[] InternationalList = {"Kansas shooting: Bar shooting suspect said he thought he'd killed 'Iranians'",
                "Donald Trump seeks 'historic' US military spending boost, domestic cuts",
                "Court charges two women with murder of Kim Jong-Nam",
                "Observe green Lent this year, says Church"};

        ListView listview = (ListView) view.findViewById(R.id.InternationalListview);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                InternationalList
        );
        listview.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }


}
