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
public class PWIntroScreenOne extends Fragment {


    public PWIntroScreenOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pwintro_screen1, container, false);
    }

}
