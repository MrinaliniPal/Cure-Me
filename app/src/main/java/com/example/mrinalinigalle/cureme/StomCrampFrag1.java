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
public class StomCrampFrag1 extends Fragment {

    String s1,s2;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.stom_cramp_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="Gas and gas pains can strike at the worst possible moment — during an important meeting or on a crowded elevator. Although passing intestinal gas (flatus) usually isn't serious, it can be embarrassing.<br>";
        s2="Anything that causes intestinal gas or is associated with constipation or diarrhea can lead to gas pains. These pains generally occur when gas builds up in your intestines, and you're not able to expel it. Most people pass gas at least 10 times a day.<br>";
        textView.setText(Html.fromHtml(s1+s2));

        return view;
    }
}