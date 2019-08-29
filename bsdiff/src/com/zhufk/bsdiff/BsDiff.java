package com.zhufk.bsdiff;

public class BsDiff {

	public native static void diff(String oldfile,String newfile,String patchfile); 

	static {
		System.loadLibrary("bsdiff");
	}
}
