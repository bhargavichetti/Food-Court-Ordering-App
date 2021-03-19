package com.example.foodsetgo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CouponsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container ,@Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_coupon,container,false);

        String couponOptions[]={"COUPON!","OFFER!"};
        ListView listView = (ListView) view.findViewById(R.id.coupons_listview);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                couponOptions
        );
        listView.setAdapter(listViewAdapter);
        return view;
    }
}