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
public class SinusFrag3 extends Fragment {

    String s1,s2,s3,s4,s5;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.sinus_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s5="\u2022\t\t";
        s1="Consult your doctor if:<br>";
        s2="Your headache symptoms occur more than 15 days a month or require frequent over-the-counter pain medicine.<br>";
        s3="You have a severe headache, and over-the-counter pain medicine doesn't help.<br>";
        s4="You miss school or work because of frequent headaches or the headaches interfere with your daily life.<br>";
        textView.setText(Html.fromHtml(s1 + s5 + s2 + s5 + s3 + s5 + s4));

        return view;
    }
}
