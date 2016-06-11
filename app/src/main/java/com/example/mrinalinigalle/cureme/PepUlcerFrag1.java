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
public class PepUlcerFrag1 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.pep_ulcer_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022";
        s2="Peptic ulcers are open sores that develop on the inside lining of your esophagus, stomach and the upper portion of your small intestine. The most common symptom of a peptic ulcer is abdominal pain.<br><br>";
        s3="Peptic ulcers include:<br><br>";
        s4="Gastric ulcers that occur on the inside of the stomach.<br>";
        s5="Esophageal ulcers that occur inside the hollow tube (esophagus) that carries food from your throat to your stomach.<br>";
        s6="Duodenal ulcers that occur on the inside of the upper portion of your small intestine (duodenum).<br><br>";
        s7="It's a myth that spicy foods or a stressful job can cause peptic ulcers. Doctors now know that a bacterial infection or some medications — not stress or diet — cause most peptic ulcers.<br>";
        textView.setText(Html.fromHtml(s2 + s3 + s1 + s4 + s1 + s5 + s1 + s6 + s7));

        return view;
    }
}