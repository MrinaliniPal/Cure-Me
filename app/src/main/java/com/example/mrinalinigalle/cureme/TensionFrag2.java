package com.example.mrinalinigalle.cureme;

import android.graphics.Typeface;
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
public class TensionFrag2 extends Fragment {

    String s1,s2,s3,s4,s5;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tension_tab, container, false);


        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>"+"Rest your eyes:"+"</b>"+"\tClose your eyes and rub both your palms together so that they become warm, then place them over your eyes such that your fingers overlap. Stay like this and allow the warmth and darkness to relax your mind and eyes. Breathe in deep making sure your back is straight. Once you have done this three times, slowly open your eyes. This should help reduce the intensity of your headache.<br><br>";
        s3="<b>"+"Light pressure:"+"</b>"+"\tOne of the easiest ways to get rid of a tension headache is to apply a little pressure on your eyelids. Close your eyes and cup them with the palm of your hands. Apply pressure for around 2-3 minutes and release. You can also close your eyes and press the point between your eyebrows with your ring finger. Make sure the pressure is not too much and press down for only so long as you feel comfortable.<br><br>";
        s4="<b>"+"Peppermint teabags:"+"</b>"+"\tWet the peppermint tea bags, cool them for a little while and place them on your eyes for about five minutes. The peppermint and tea leaves help soothe your eyes thereby relieving your headache.<br><br>";
        s5="<b>"+"Ginger Tea:"+"</b>"+"\tSteep some crushed ginger (a one inch long piece should suffice) in some water. Alternatively you could add it to some green tea (without milk) for relief. If you tend to have tension headaches often, you can also sip on this tea before bed. It will help you relax and get enough rest helping to keep headaches at bay.<br><br>";

        textView.setText(Html.fromHtml(s1+s2+s1+s3+s1+s4+s1+s5));
        return view;
    }
}