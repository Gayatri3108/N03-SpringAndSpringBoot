package org.tnsif.autowireexample;

public class Actors {
    //DI in the form of objects
	Director d;

//	public void setD(Director d) {
//		this.d = d;
//	}
	 //injecting a object of director
	public void accept() {
		d.movie();
	}
	
	public Actors(Director d) {
		super();
		this.d=d;

		System.out.print("autowire using constructor");
	}
}
