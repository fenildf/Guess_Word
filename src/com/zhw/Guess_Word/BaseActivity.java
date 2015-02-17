package com.zhw.Guess_Word;

/**
 * Created with IntelliJ IDEA.
 * User: Wymon Zhang
 * Date: 13-9-21
 * Time: 下午7:13
 * To change this template use File | Settings | File Templates.
 */

import android.os.Bundle;
import android.widget.Toast;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.zhw.Guess_Word.ui.GroupListFragment;
import com.zhw.Guess_Word.util.Util;

public class BaseActivity extends SlidingFragmentActivity {

    private int mTitleRes;
    protected GroupListFragment mFrag;

    public BaseActivity(int titleRes) {
        mTitleRes = titleRes;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(mTitleRes);

        // set the Behind View
        setBehindContentView(R.layout.menu_frame);
        if (savedInstanceState == null) {
            android.support.v4.app.FragmentTransaction t = this.getSupportFragmentManager().beginTransaction();
            mFrag = new GroupListFragment();
            t.replace(R.id.menu_frame, mFrag);
            t.commit();
        } else {
            mFrag = (GroupListFragment)this.getSupportFragmentManager().findFragmentById(R.id.menu_frame);
        }

        // customize the SlidingMenu
        SlidingMenu sm = getSlidingMenu();
        sm.setShadowWidthRes(R.dimen.shadow_width);
        sm.setShadowDrawable(R.drawable.shadow);
        sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        sm.setFadeDegree(0.35f);
        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //  case R.id.
            case android.R.id.home:
                //   Toast.makeText(this,"dianji",Toast.LENGTH_LONG).show();
                toggle();
                return true;
            case R.id.github:
                Util.goToBlog(this);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
