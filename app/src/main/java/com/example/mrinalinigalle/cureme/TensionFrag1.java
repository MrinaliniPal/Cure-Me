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
public class TensionFrag1 extends Fragment {

    String s1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tension_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="A tension headache is generally a diffuse, mild to moderate pain in your head that's often described as feeling like a tight band around your head.<br>";

        textView.setText(Html.fromHtml(s1));
        return view;
    }
}