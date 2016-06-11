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
public class SinusFrag2 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.sinus_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="•\t\t";
        s2="<b>"+"Cinnamon:"+"</b>"+"\tPrepare a paste by mixing one tbsp cinnamon powder with water. To it, add ½ tsp of sandalwood powder. Apply this paste on your forehead. This home remedy will provide you a quick respite from sinus headache.<br><br>";
        s3="<b>"+"Saline spray:"+"</b>"+"\tMix salt in hot water. Spray this solution in both the nostrils. It will decongest your nasal cavity, reducing the sinus headache.<br><br>";
        s4="<b>"+"Steam:"+"</b>"+"\tBoil some water in a saucepan. Add a few drops of peppermint oil or eucalyptus oil, in this boiled water. Inhale the steam. This remedy calms the mucous membrane and gives you relief from sinus headache.<br><br>";
        s5="<b>"+"Warm soup:"+"</b>"+"\tPrepare soup and consume it warm. You can add a small amount of pepper to it. It will give you respite from sinus headache.<br><br>";
        s6="<b>"+"Ginger:"+"</b>"+"\tDue to some anti-inflammatory properties, ginger is very effective against the sinus headache. Extract the juice of ginger and consume it. Another option is to crush the dried ginger and add milk or water to it. Then, massage on your forehead.<br><br>";
        s7="<b>"+"Spicy food:"+"</b>"+"\tEat spicy food. It will help in clearing the nasal congestion. Once the nasal blockage is cleared, your headache will naturally get cured.<br><br>";
        s8="<b>"+"Basil leaves:"+"</b>"+"\tTake some basil leaves. Grind. Add a tsp of dried ginger and cloves to it. Apply it on your forehead.<br><br>";
        s9="<b>"+"Hot tea:"+"</b>"+"\tDrink hot tea. While preparing tea, add crushed ginger to it.<br><br>";
        s10="<b>"+"Cold compress:"+"</b>"+"\tApply ice-bag just below your eyes. It will help you in relieving inflammation, swelling, and pain associated with the sinus headache.<br><br>";
        s11="<b>"+"Hot compress:"+"</b>"+"\tApply a hot compress, cloth dipped in hot water, or a heating pad to your head and face. It will help in the flow of mucus, providing relief from sinus headache.<br><br>";
        s12="<b>"+"Essential oils:"+"</b>"+"\tEssential oils like eucalyptus, lavender, oregano, and peppermint oil are very beneficial in the treatment of the sinus headache. Combine all the oils and massage on the back of your neck, temples, and forehead, to reduce the pain.<br><br>";
        s13="<b>"+"Water:"+"</b>"+"\tOne of the reasons of the headache is dehydration. Increase water intake to get rid of the sinus headache.<br><br>";
        s14="<b>"+"Neti pot:"+"</b>"+"\tTake lukewarm water. Mix ½ tsp of baking soda and a tsp of salt to it. Pour this solution in the Neti pot. Tilt your head at 45 degree angle. Place the opening of Neti pot on your nostril. Pour solution of the pot into your nasal cavity. It will come out of the other nostril. Repeat the same process on the other nostril. Blow both the nostrils, once the procedure gets completed. It will clear your sinuses, alleviating the headache.<br><br>";
        s15="<b>"+"Facial massage:"+"</b>"+"\tMassage the area below the eye sockets, applying light pressure with the help of your thumbs. It will provide relief from the pain.<br><br>";

        textView.setText(Html.fromHtml(s1 + s2 + s1 + s3 + s1 + s4 + s1 + s5 + s1 + s6 + s1 + s7 + s1 + s8 + s1 + s9 + s1 + s10 + s1 + s11 + s1 + s12 + s1 + s13 + s1 + s14 + s1 + s15));

        return view;
    }
}