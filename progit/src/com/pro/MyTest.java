package com.pro;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MyTest {

	public static void main(String[] args) {
		String str="dddÄãºÃ¿ÉÒÔÂğjjdk";
		InputStream is = null;
		byte[] bs=new byte[1024];
		int i=0;
		try{
			is=new ByteArrayInputStream(str.getBytes());
			int n=-1;
			while((n=is.read())!=-1){
				bs[i++]=(byte)n;
			}
			String s=new String(bs,"gbk");
			System.out.println("s="+s);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
