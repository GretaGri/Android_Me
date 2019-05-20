package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    //Mandatory constructor for instantiating the fragment
    public BodyPartFragment(){
        //Empty constructor
    }

    //Inflates the fragment layout and sets any image resources
    @Override
    public View onCreateView (LayoutInflater layoutInflater, ViewGroup container,
                              Bundle savedInstanceState){
        // inflate the android - me fragment layout.
        View rootView = layoutInflater.inflate(R.layout.fragment_body_part, container,
                false);
        // get a reference to ImageView in a fragment layout.
        ImageView imageView = rootView.findViewById(R.id.body_part_image_view);
        // set the image resource to display.
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        // return the rootView
        return rootView;
    }
}
