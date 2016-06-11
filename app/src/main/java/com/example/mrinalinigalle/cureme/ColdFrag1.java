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
public class ColdFrag1 extends Fragment {

    String s1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.cold_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="The common cold is a viral infection of your upper respiratory tract — your nose and throat. Most people recover from a common cold in about a week or two. If symptoms don't improve, see your doctor.";
        textView.setText(s1);

        return view;
    }
}