package org.tesina.java;

import javax.inject.Inject;

public class Car {

	public int id;
	public int serbatoio;
	
	@Inject
	public Randomizer r;
	
	public Car(int id, int serbatoio){
		this.id = id;
		this.serbatoio = serbatoio;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSerbatoio() {
		return serbatoio;
	}

	public void setSerbatoio(int serbatoio) {
		this.serbatoio = serbatoio;
	}	
	
	public int metodoACazzo(){
		System.out.println(r.getRand());
		r.randomize();
		System.out.println(r.getRand());
		return 1;
	}
	
}
