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
public class TensionFrag3 extends Fragment {

    String s1,s2,s3,s4,s5;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tension_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="If you have any of these signs or symptoms, seek emergency care:<br>";
        s3="Abrupt, severe headache.<br>";
        s4="Headache with a fever, stiff neck, mental confusion, seizures, double vision, weakness, numbness or speaking difficulties.<br>";
        s5="Headache after a head injury, especially if the headache gets worse.<br>";
        textView.setText(Html.fromHtml(s2+s1+s3+s1+s4+s1+s5));

        return view;
    }
}
