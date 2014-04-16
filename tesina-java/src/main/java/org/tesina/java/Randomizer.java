package org.tesina.java;

public class Randomizer {

	private int rand;
	
	public Randomizer(int rand){
		this.rand = rand;
	}
	
	public void randomize(){
		this.rand = (int) Math.random();
	}
	
	public int getRand() {
		return rand;
	}

	public void setRand(int rand) {
		this.rand = rand;
	}
	
}