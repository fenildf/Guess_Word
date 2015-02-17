package com.zhw.Guess_Word.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhw.Guess_Word.R;

/**
 * Created with IntelliJ IDEA.
 * User: Wymon Zhang
 * Date: 13-9-23
 * Time: 下午7:25
 */
public class GuessWord_Fragment extends Fragment {
    //定义了    得分           类别                 翻译
    TextView Guess_Grade, Guess_CategoryText, Guess_Translate;
    ImageView Guess_Hint,Guess_Help;
    View Guess_View;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Guess_View = inflater.inflate(R.layout.guess_for_word, null);
        init();
        return Guess_View;
    }

    private void init() {
        Guess_Grade = (TextView) Guess_View.findViewById(R.id.guess_money);
        Guess_CategoryText = (TextView) Guess_View.findViewById(R.id.guessCategoryText);
        Guess_Translate = (TextView) Guess_View.findViewById(R.id.guess_audio_duration);
        Guess_Hint = (ImageView)Guess_View.findViewById(R.id.guess_hint);
        Guess_Help = (ImageView)Guess_View.findViewById(R.id.guess_help);



    }
}