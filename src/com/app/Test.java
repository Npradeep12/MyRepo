package com.app;

public class Test {

	public static void main(String[] args) {
		int a,b,res;
		a=10;b=20;
		res=add(a,b);
		System.out.println(res);
	}
    public static int add(int x,int y){
    	int res=0;
    	res=x+y;
    	return res;
    }
}
