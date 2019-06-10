package com.example.moataz.sellme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentTow extends Fragment {
    ListView listView;
    ArrayList<data> arrayList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=  inflater.inflate(R.layout.fragment_tow,container,false);
        listView=view.findViewById(R.id.list2);
        arrayList=new ArrayList<>();
        arrayList.add(new data(R.drawable.lock,"text1","text2 id more than text one"));
        arrayList.add(new data(R.drawable.lock,"text1","text2 id more than text one"));
        arrayList.add(new data(R.drawable.lock,"text1","text2 id more than text one"));
        arrayList.add(new data(R.drawable.lock,"text1","text2 id more than text one"));
        arrayList.add(new data(R.drawable.lock,"text1","text2 id more than text one"));
        arrayList.add(new data(R.drawable.lock,"text1","text2 id more than text one"));
        arrayList.add(new data(R.drawable.lock,"text1","text2 id more than text one"));
        DataAdapter dataDataAdapter =new DataAdapter(getActivity(),arrayList);
        listView.setAdapter(dataDataAdapter);

        return view;
    }
}
