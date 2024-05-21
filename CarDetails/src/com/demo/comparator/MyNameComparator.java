package com.demo.comparator;
import java.util.Comparator;
import com.demo.beans.Car;

public class MyNameComparator implements Comparator<Car>{

		@Override
		public int compare(Car o1, Car o2) {
			System.out.println("In name compare"+o1.getOwnername()+"--->"+o2.getOwnername());
			return o1.getOwnername().compareTo(o2.getOwnername());
		}
}

