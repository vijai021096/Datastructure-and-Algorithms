package com.vj.findAndUnion;

import java.util.Scanner;

public class Main {


	public static void main(String ab[]) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();          //number of elements
	    FindAndUnion obj=new FindAndUnion(n);
		for(int i=0;i<n;i++) {
			int p=s.nextInt();
			int q=s.nextInt();
			if(!obj.find(p, q)) {
				obj.Union(p, q);
			System.out.println(p+" "+"and"+" "+q+" "+"is connected");
			}
			else {
			System.out.println(p+","+q+" "+"is already connected");
		}
		}
	}
}


