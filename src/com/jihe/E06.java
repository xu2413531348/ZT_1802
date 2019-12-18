package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E06 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			if(obj.equals("Tom")){
				it.remove();
			}
			
		}
		System.out.println(list);

}
}