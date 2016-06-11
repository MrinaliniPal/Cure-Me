package com.example.mrinalinigalle.cureme;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.util.Linkify;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mrinalini galle on 21-03-2016.
 */
public class ColdHomeoFrag1 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.cold_homeo_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>Dr Spals Homeopathic Clinic & Research</b><br>";
        s3="<i><u>Address:</i></u>\tPlot Number 170, Bomikhal Jharpara Canal Road, Rasulgarh, Bhubaneshwar - 751010, Near Lopamudra Enclave, Hanuman Mandir And Tara Tarini Gym.<br>";
        s4="<i><u>Phone:</i></u>	";
        s5="<b>Dr. Mrs. Sangeeta Dhal (MD)</b><br>";
        s6="<i><u>Address:</i></u>\tPlot Number 28, Sai Krupa, Ekamra Villa, Jaydev Vihar, Irc Village, Bhubaneshwar - 751015, Near Sai Temple.<br>";
        s7="<b>Multicare Homeopathy Treatment Center</b><br>";
        s8="<i><u>Address:</i></u>\tHig 4/4, Housing Board Colony, Chandrasekharpur, Bhubaneshwar - 751016, Opposite BMC Kalyani Mandap.<br>";
        textView.setText(Html.fromHtml(s1 + s2 + s3 + s4 + "\t9937120211\t/\t8280056941<br><br>" + s1 + s5 +s6 + s4 + "\t9861077789\t/\t9861036698<br><br>" + s1 + s7 + s8 + s4 + "\t6742740274\t/\t9937412150<br>"));
        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
        textView.setLinkTextColor(Color.parseColor("#2f6699"));


        return view;
    }
}
