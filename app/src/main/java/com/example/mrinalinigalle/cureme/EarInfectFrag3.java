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
public class EarInfectFrag3 extends Fragment {

    String s1,s2,s3,s4,s5;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.ear_infect_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="Signs and symptoms of an ear infection can indicate a number of conditions. It's important to get an accurate diagnosis and prompt treatment.<br>Call your doctor if:<br>";
        s3="Symptoms last for more than a day.<br>";
        s4="Ear pain is severe.<br>";
        s5="You observe a discharge of fluid, pus or bloody discharge from the ear.<br>";
        textView.setText(Html.fromHtml(s2+s1+s3+s1+s4+s1+s5));

        return view;
    }
}
