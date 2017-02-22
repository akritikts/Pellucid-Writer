package in.silive.pellucidwriter.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.silive.pellucidwriter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PWIntroScreenTwo extends Fragment {


    public PWIntroScreenTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pwintro_screen_two, container, false);
    }

}
