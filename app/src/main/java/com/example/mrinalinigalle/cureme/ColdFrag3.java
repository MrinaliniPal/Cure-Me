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
public class ColdFrag3 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.cold_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="For <b>adults</b> — seek medical attention if you have:<br>";
        s3="Fever of 103 F (39.4 C) or higher.<br>";
        s4="Fever accompanied by sweating, chills and a cough with colored phlegm.<br>";
        s5="Significantly swollen glands.<br>";
        s6="Severe sinus pain.<br><br>";
        s7="For <b>children</b> — seek medical attention if they have:<br>";
        s8="Fever of 100.4 F (38 C) in newborns up to 12 weeks.<br>";
        s9="Fever that rises repeatedly above 104 F (40 C) in a child of any age.<br>";
        s10="Signs of dehydration, such as urinating less often than usual.<br>";
        s11="Not drinking adequate fluids.<br>";
        s12="Fever that lasts more than 24 hours in a child younger than 2.<br>";
        s13="Fever that lasts more than three days in a child older than 2.<br>";
        s14="Vomiting or abdominal pain.<br>";
        s15="Unusual sleepiness.<br>";
        s16="Severe headache.<br>";
        s17="Stiff neck.<br>";
        s18="Difficulty breathing.<br>";
        s19="Persistent crying.<br>";
        s20="Ear pain.<br>";
        s21="Persistent cough.<br>";

        textView.setText(Html.fromHtml(s2+s1+s3+s1+s4+s1+s5+s1+s6+s7+s1+s8+s1+s9+s1+s10+s1+s11+s1+s12+s1+s13+s1+s14+s1+s15+s1+s16+s1+s17+s1+s18+s1+s19+s1+s20+s1+s21));

        return view;
    }
}
