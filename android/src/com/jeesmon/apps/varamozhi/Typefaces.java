package com.jeesmon.apps.varamozhi;

import java.util.Hashtable;

import android.content.Context;
import android.graphics.Typeface;

public class Typefaces {
	private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();

	public static Typeface get(Context c, String name) {
		synchronized (cache) {
			if (!cache.containsKey(name)) {
				Typeface t = Typeface.createFromAsset(c.getAssets(), name);
				cache.put(name, t);
			}
			return cache.get(name);
		}
	}
}
