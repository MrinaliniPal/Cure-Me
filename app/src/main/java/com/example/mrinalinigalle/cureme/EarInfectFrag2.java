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
public class EarInfectFrag2 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.ear_infect_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s10="\u2022\t\t";
        s1="<b>"+"Heating Pad or Warm Water Bottle:"+"</b>"+"\tTo get quick relief, one should press a heating pad or warm water bottle against the ear. You can also dip a clean cloth in lukewarm water and apply it on the infected ear. It is to be kept in mind that the heating procedure should not exceed for a long period of time. Start with five minutes, and repeat the process, if required.<br><br>";
        s2="<b>"+"Tea Tree Oil:"+"</b>"+"\tTea tree oil is known for its mild antibacterial and healing properties. With the use of tea tree oil, one can get instant relief in ear pain. Prepare a mixture of one tsp of apple cider vinegar, 2 tbsp of olive oil, 3 drops of tea tree oil, and a tsp of colloidal silver. Slightly warm this mixture. Put your head on a towel, keeping the infected ear upright. With the help of dropper, put the mixture in the ear, and leave it for five minutes. After sometime, turn your head and let the mixture drain out completely. Follow this procedure thrice a day for effective results.<br><br>";
        s3="<b>"+"Garlic:"+"</b>"+"\tGarlic is considered to have antimicrobial and pain relieving characteristics. Put some drops of fresh garlic oil or juice in the infected ear. This will provide an immediate relief. The process should be practised three times in a day. One can also boil 2-3 garlic cloves in water for five minutes. Add some salt after crushing the cloves. Wrap up the mixture in a clean cloth and put it on the infected ear. Apart from making these mixtures, one can eat 2-3 raw garlic cloves to facilitate the healing process.<br><br>";
        s4="<b>"+"Mango Leaf Juice:"+"</b>"+"\tThe extracts of mango leaf are effective for the treatment of ear infection. Take two or three mango leaves. Grind or crush them to extract juice. Slightly warm the extracted juice. Put 2-3 drops of juice in the infected ear with the help of a dropper. Leave it for a few minutes. After sometime, you will feel relief in the earache. If the procedure is practised for three times a day, then ear infection will surely get healed.<br><br>";
        s5="<b>"+"Onion:"+"</b>"+"\tTake a small onion and chop it. Put the chopped onion in the microwave for 1-2 minutes. After microwaving, allow it to cool and extract its juice. Put two-three drops of onion juice in the infected ear and leave it for a few minutes. After sometime, turn your head and drain out the juice from the ear. You can also bake the onion for 30 minutes. After baking, cut in into two pieces. Wrap one piece of baked onion in a cotton cloth and place it on the infected ear for at least five minutes. If required, repeat the process after ten minutes.<br><br>";
        s6="<b>"+"Salt:"+"</b>"+"\tSalt is considered to be the best remedy, available at home. Microwave one cup of salt for at least 5-6 minutes. After that, put the hot salt in a sock. Tie the open end of the sock using a rubber band. Lie down and put the sock under the infected ear for ten minutes. The heat from the sock will facilitate in draining out the fluid from the ear. To get relief in swelling and pain, the process should be repeated multiple times in a day.<br><br>";
        s7="<b>"+"Basil:"+"</b>"+"\tBasil leaves are also one of the remedies used to get relief in ear infections and minor earache. Take 4-5 holy basil leaves. Crush them to extract their juice. Apply the extracted juice around the infected area. It should not be put into the ear canal. Apart from this, mixture of basil juice and coconut oil can also be used for healing the ear infection. Take a cotton ball and dip it into the mixture. Apply it gently on the inner part, outer edge and behind the ear. This process should be practised two times in a day.<br><br>";
        s8="<b>"+"Apple Cider Vinegar:"+"</b>"+"\tpple cider vinegar is the best solution for removing fungus from the ear. Prepare a solution of apple cider vinegar and water, taking both in equal quantity. You can also use alcohol in place of water. Take a cotton ball and soak it in the solution. Put the soaked cotton ball in the ear for almost five minutes. Now, remove the cotton ball and lay down on the opposite side to flush out the solution from the ear. To dry the ear, you can use a hair dryer. White vinegar can also be used in place of apple cider vinegar.<br><br>";
        s9="<b>"+"Olive Oil:"+"</b>"+"\tAs we all know, ear infection is mainly caused due to the deposits of wax in the ear. Olive oil is one of the best solutions to this problem. Warm some olive oil. After warming, put some drops of warm oil into the infected ear. Olive oil will help in softening the wax. The wax can be removed safely with the help of a cotton bud. Don’t put the bud too far in the ear; otherwise, it may damage your eardrum. Mustard oil can also be used to treat the ear infection.<br><br>";
        textView.setText(Html.fromHtml(s10 + s1 + s10 + s2 + s10 + s3 + s10 + s4 + s10 + s5 + s10 + s6 + s10 + s7 + s10 + s8 + s10 + s9));
        return view;
    }
}