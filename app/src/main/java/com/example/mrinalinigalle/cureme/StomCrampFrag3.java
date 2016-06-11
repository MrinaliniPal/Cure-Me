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
public class StomCrampFrag3 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.stom_cramp_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="It's considered normal to pass gas as flatus between 10 and 20 times a day. That amount varies from day to day, however.<br><br>";
        s2="Call your doctor if your gas is accompanied by:<br>";
        s3="Prolonged abdominal pain.<br>";
        s4="Bloody stools.<br>";
        s5="A change in stool color or frequency.<br>";
        s6="Weight loss.<br>";
        s7="Chest pain.<br>";
        s8="Persistent or recurrent nausea or vomiting.<br><br>";
        s9="In addition, talk to your doctor if your gas or gas pains are so persistent or severe that they interfere with your ability to live a normal life. In most cases, treatment can help reduce or alleviate the problem.<br>";
        s10="\u2022";
        textView.setText(Html.fromHtml(s1+s2+s10+s3+s10+s4+s10+s5+s10+s6+s10+s7+s10+s8+s9));

        return view;
    }
}
