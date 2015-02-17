package com.zhw.Guess_Word;

import android.os.Bundle;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.zhw.Guess_Word.ui.GuessWord_Fragment;


public class MainActivity extends BaseActivity {

	public MainActivity() {

        //设置actionbar上的名字
		super(R.string.Title);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        //设置菜单的模式为左右菜单
		getSlidingMenu().setMode(SlidingMenu.LEFT);
        //触发菜单的操作区间。。
		getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
		  //设置当前的页面布局
		setContentView(R.layout.content_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, new GuessWord_Fragment())    //用SampleListFragment替换掉主页面的布局
		.commit();


	}

}
