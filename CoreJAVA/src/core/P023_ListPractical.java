package core;

import java.util.ArrayList;
import java.util.List;

class Laptop{
	private int ram;
	private String model;
	private double price;
	Laptop(int ram,String model,double price){
		this.ram = ram;
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ram : "+ram+" model : "+model+" price : "+price;
	}
}
public class P023_ListPractical {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(8, "lenovo", 45445.4);
		Laptop l2 = new Laptop(10, "dell", 45445.4);
		Laptop l3 = new Laptop(12, "hp", 45445.4);
		Laptop l4 = new Laptop(16, "asus", 45445.4);
		Laptop l5 = new Laptop(20, "mac", 45445.4);
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		System.out.println(list);
		for(Laptop l:list) {
			System.out.println(l);
		}
	}
}
