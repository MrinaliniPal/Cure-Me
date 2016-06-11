package com.example.mrinalinigalle.cureme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mrinalini galle on 21-03-2016.
 */
public class SinusFrag1 extends Fragment {

    String s1,s2,s3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.sinus_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);

        s1="\u2022\t\t";
        s2="Deep and constant pain in the cheekbones, forehead or bridge of the nose.<br><br>";
        s3="The pain usually intensifies with sudden head movement or straining and usually occurs with other sinus symptoms, such as nasal discharge, feeling of fullness in the ears, fever, and facial swelling.<br><br>";

        textView.setText(Html.fromHtml(s1 + s2 + s1 + s3));

        return view;
    }
}