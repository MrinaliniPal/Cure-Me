package com.example.mrinalinigalle.cureme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mrinalini galle on 21-03-2016.
 */
public class EarInfectFrag1 extends Fragment {

    String s1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.ear_infect_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="An ear infection (acute otitis media) is most often a bacterial or viral infection that affects the middle ear, the air-filled space behind the eardrum that contains the tiny vibrating bones of the ear. Children are more likely than adults to get ear infections. Long-term problems related to ear infections — persistent fluids in the middle ear, persistent infections or frequent infections — can cause hearing problems and other serious complications.";
        textView.setText(s1);

        return view;
    }
}