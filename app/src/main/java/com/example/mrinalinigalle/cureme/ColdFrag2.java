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
public class ColdFrag2 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.cold_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>"+"Gargles:"+"</b>"+"\tGargle with salt dissolved in warm water. The salt in the water can help drain excess fluid from inflamed areas in the throat reducing the symptoms.<br><br>";
        s3="<b>"+"Use vaporubs:"+"</b>"+"\tThe ingredients such as menthol, camphor and eucalyptus in vaporubs have a role in relieving congestion.<br><br>";
        s4="<b>"+"Drink warm liquids:"+"</b>"+"\tDrinking warm water is a good way of soothing the inflammation in the throat.A warm soup is a much better solution as is a glass of hot herbal tea.<br><br>";
        s5="<b>"+"Sleep with the head elevated:"+"</b>"+"\tIn some persons, a productive cough results when mucus drips from the back of the nose into the throat. This tends to grow worse at night when the body posture is conducive for such dripping. Sleeping with the head at a higher position helps to reduce such drainage and many people find this position helps reduce coughing at night and improves sleep.<br><br>";
        s6="<b>"+"Throat lozenges:"+"</b>"+"\tThe irritation caused by constant coughing can also be overcome by using throat lozenges. They are also known to prevent the progression of a sore throat to a cough. While some lozenges are medicated and contain ingredients such as dextromethorphan (a cough suppressant) or benzocaine (an anesthetic), others contain natural soothing ingredients such as honey, menthol, peppermint oil or eucalyptus oil.<br><br>";
        s7="<b>"+"Turmeric remedies:"+"</b>"+"\t<br>\t\t\t<i><u>Haldi doodh:</u></i>\tA traditional remedy that most people swear by is the use of hot milk with turmeric. It is shown to even have antibacterial properties. Heat a glass of milk, mix in half a teaspoon of turmeric powder and drink warm to get relief from cough.<br>\t\t\t<i><u>\tTurmeric gargle:</u></i>A turmeric gargle also gives good results. To one cup of hot water, add in half a teaspoon of turmeric powder and half a teaspoon table salt. Use this liquid as a throat gargle and you are sure to experience relief from cough.<br>\t\t\t<i><u>Turmeric and honey mixture:</u></i>\tFor a dry cough, turmeric powder mixed with a teaspoon of honey taken three to four times a day is effective. You could also try preparing turmeric tea by adding one tablespoon of turmeric powder into 4 cups of boiling water. Keep for a few minutes, strain and mix in some lemon and honey to the liquid and drink.<br><br>";
        s8="<b>"+"Honey remedies:"+"</b>"+"\tHoney has been known to soothe the irritated throat linings and thus, has been used as an ayurvedic remedy for cough since ages. A dry cough responds to a mixture of honey with juice from grapes. A glass of hot milk with some honey added just before going to bed is effective at relieving night-time cough. Mix in honey and lemon juice to a glass of warm water and drink this three times per day for relief from cough. For nasty cough, take about 3 tablespoons of get rid of a sore throat with natural honey.<br><br>";
        s9="<b>"+"Ginger remedies:"+"</b>"+"\t<br>\t\t\t<i><u>Fresh ginger:</u></i>\tFor a dry cough, one of the easiest ways of finding relief is to cut a piece of fresh ginger, sprinkle some salt on it and chew on it for a few minutes. However, not everyone likes the strongly aromatic taste of ginger and in such cases, a tea made with ginger is equally good.<br>\t\t\t<i><u>Ginger tea:</u></i>\tChop ginger into fine pieces, add into a vessel containing one cup of water. Keep boiling the liquid till the volume reduces to half the original quantity. Strain the liquid, add one teaspoon of honey and drink when warm to give a soothing effect against cough.<br>\t\t\t<i>Ginger and tulsi:</i>\tGinger in combination with tulsi is also an effective remedy for cough. Crush about 10 leaves of tulsi, mix with juice extracted from a small ginger piece. Add in an equal quantity of honey and mix; swallow about a single teaspoon of this about thrice a day to get relief from cough.<br>\t\t\tPeople who don’t mind the strong spicy flavour of pepper can also add some black pepper powder and turmeric into a mixture of ginger juice with honey. When this paste is slowly licked for 10 to 15 minutes thrice a day, it helps reduce congestion in the throat and reduces cough.<br><br>";
        s10="<b>"+"Garlic remedies:"+"</b>"+"\tGarlic is an effective antimicrobial and expectorant and this makes it a valuable home remedy to fight cough. Lightly crush about 5 cloves of peeled garlic and sauté in a teaspoon of ghee; consume when still warm for relief from cough and cold. Include crushed garlic sautéed in ghee in other dishes where possible.<br><br>";
        s11="<b>"+"Jaggery remedies:"+"</b>"+"\tSputum buildup can lead to a feeling of congestion in the chest and the entire respiratory tract; expelling this sputum therefore provides relief from cough and congestion. Make a decoction by boiling a few corns of pepper with water for about 20 minutes; mix in a little cumin and jaggery and drink. Cut a quarter part of an onion, keep a small bit of jaggery in the middle of it and chew on this for expelling sputum.<br><br>";

        textView.setText(Html.fromHtml(s1 + s2 + s1 + s3 + s1 + s4 + s1 + s5 + s1 + s6 + s1 + s7 + s1 + s8 + s1 + s9 + s1 + s10 + s1 + s11));

        return view;
    }
}