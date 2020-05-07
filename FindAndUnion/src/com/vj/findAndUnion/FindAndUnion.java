package com.vj.findAndUnion;

public class FindAndUnion {

	private int[] id;           // id array
	private int[] sz;           //size array
	
	public FindAndUnion(int n) {
		id=new int[n];
		sz=new int[n];
		for(int i=0;i<n;i++) {
			id[i]=i;
		}
	}
	
	//to w=find whether 2 elemnts are connected or not.
	public boolean find(int p,int q) {
	    
		return root(p)==root(q);
	}
	
	//connect 2 elements
	
	public void Union(int p,int q) {
		
		int i=root(p);                  //root of 1st element
		int j=root(q);                  //root of 2nd element
		 
		if(i == j)                      
			return;
		if(sz[i]<sz[j]) {
			id[i]=j;
			sz[j]+=sz[i];
		}
		else {
			id[j]=i;
			sz[i]+=sz[j];
		}
	
	}
	
	/**
	 * Find the root of the element.      1
	 *                                   / \
   	 * @param  i                        2   3
	 * @return              root of 3 will be 1.
	 */ 
	private int root(int i) {
		 while(i!=id[i]) {
		    	id[i]=id[id[i]];             // find grandparent of the element.
		    	i=id[i];
		    }
		return i;
	}
}


