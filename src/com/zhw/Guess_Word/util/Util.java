package com.zhw.Guess_Word.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class Util {

	public static void goToBlog(Context context) {
		Uri uriUrl = Uri.parse("http://blog.csdn.net/wymon_zhang");
		Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl); 
		context.startActivity(launchBrowser);
	}
	
}
