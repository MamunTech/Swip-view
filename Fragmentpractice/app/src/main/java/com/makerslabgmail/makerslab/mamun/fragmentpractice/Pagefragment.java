package com.makerslabgmail.makerslab.mamun.fragmentpractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pagefragment extends Fragment {

TextView textView;
    public Pagefragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.page_fragment_layout,container,false);
        textView=(TextView)view.findViewById(R.id.text_view);
        Bundle bundle=getArguments();
        String massage=Integer.toString(bundle.getInt("count"));
        textView.setText("this is the"+massage+"swipe view page..");
        return view;
    }

}
