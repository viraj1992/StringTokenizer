package com.viraj.StringTokenizer;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello World!!!";
		
		// StringTokenizer Class
		
		StringTokenizer stringToken = new StringTokenizer(str1);
		System.out.println(stringToken.nextToken());
		System.out.println(stringToken.nextToken());
		
		
		String str2 = "This is@another@text";
		
		// StringTokenizer Class
		
		StringTokenizer stringToken2 = new StringTokenizer(str2,"@");
		System.out.println(stringToken2.nextToken());
		System.out.println(stringToken2.nextToken());
		System.out.println(stringToken2.nextToken() + " hello");
		
		String str3 = "This is my string method!!!!";
		System.out.println(str3.charAt(6));
		System.out.println(str3.substring(5, 10));
		System.out.println(str3.indexOf('d'));
		System.out.println(str3.indexOf("string"));
		
		
		
		
		
	}

}
