package com.android4dev.navigationview.webservice;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;


public class VolleySetup {
	private static RequestQueue mRequestQueue;
	private static ImageLoader mImageLoader;
	public static String ErrorMessage="";
	private VolleySetup() {
		// no instances
	}

	public static void init(Context context) {
		mRequestQueue = Volley.newRequestQueue(context);
		
		ErrorMessage = "Something Went Wrong";

	}

	
	
	public static RequestQueue getRequestQueue() {
		if (mRequestQueue != null) {
			return mRequestQueue;
		} else {
			throw new IllegalStateException("RequestQueue not initialized");
		}
	}


	
	
	public static ImageLoader getImageLoader() {
		if (mImageLoader != null) {
			return mImageLoader;
		} else {
			throw new IllegalStateException("ImageLoader not initialized");
		}
	}
}
