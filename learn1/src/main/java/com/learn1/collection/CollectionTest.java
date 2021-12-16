package com.learn1.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * <br>
 *
 * @ClassName collection
 * @Description TODO
 * @Author 邓文杰
 * @Date 2021/3/2 14:49
 * @Version 1.0
 */
public class CollectionTest {




	public static void main(String[] args){
		List<String> list =new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");


		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {	Iterator<String> it= list.iterator();
				while(it.hasNext()){
					list.remove(1);
					System.out.println(it.next());
				}

			}
		});

		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {	Iterator<String> it= list.iterator();
				while(it.hasNext()){
					list.remove(1);
					System.out.println(it.next());
				}

			}
		});

		t1.start();


	}


}
