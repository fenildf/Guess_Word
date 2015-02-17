package com.zhw.Guess_Word;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import com.actionbarsherlock.view.Window;

/**
 * Created with IntelliJ IDEA.
 * User: Wymon Zhang
 * Date: 13-9-22
 * Time: 下午3:06
 * To change this template use File | Settings | File Templates.
 */
public class FirstActivity extends Activity {
   private ImageButton imgbt;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //////////
        requestWindowFeature((int)Window.FEATURE_NO_TITLE);
        setContentView(R.layout.guess_main);
        // 加上这句设置为全屏 不加则只隐藏title
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        /////
        imgbt = (ImageButton)findViewById(R.id.button);
        imgbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FirstActivity.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
}