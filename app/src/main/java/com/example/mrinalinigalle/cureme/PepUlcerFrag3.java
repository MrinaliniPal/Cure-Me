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
public class PepUlcerFrag3 extends Fragment {

    String s1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.pep_ulcer_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="See your doctor if you have persistent signs and symptoms that worry you. Over-the-counter antacids and acid blockers may relieve the gnawing pain, but the relief is short-lived. If your pain persists, see your doctor.<br>";
        textView.setText(Html.fromHtml(s1));

        return view;
    }
}
