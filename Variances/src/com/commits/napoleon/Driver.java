package com.commits.napoleon;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		polymorphism, covariance
		Animal a = new Cat();
		f(a);
		f(new Tiger());
		f(new Cat());
		
//		can i do covariance on generic types?
		List<Cat> c = new ArrayList<Cat>();
//		
//		not allowed!!!
//		generic types arent covaraiant
		fList(c);
		
//		are arrays covarariant?
//		arrays are covaraiant!!!!
		Cat[] catArray = new Cat[8];
		catArray[0] = new Cat();
		
//		Runtime exception!!!!
//		fArray(catArray);
		fArray(new Animal[8]);
		
		
		contraList(new ArrayList<Cat>());
		contraList(new ArrayList<Tiger>());
		
//		cant contravaraiance of array
//		contraArray(catArray);
	}
	
	public static void f(Animal a0) {
		
	}
	
	public static void fList(List<? extends Animal> la) {
		for(Animal a : la) {
			a.breathe();
		}
		
//		la.add(new Dog());
	}
	
	public static void fArray(Animal[] aa) {
//		aa[0] = new Dog();
	}
	
	public static void contraList(List<? super Tiger> lt) {
//		Object obj = lt.get(0);
		
//		lt.add(new Tiger());
		
//		Animal a = lt.get(0);
//		Cat a = lt.get(0);
//		Tiger a = lt.get(0);
	}
	
	public static void contraArray(Tiger[] ta) {
		
	}

}
