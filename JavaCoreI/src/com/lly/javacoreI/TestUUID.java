package com.lly.javacoreI;

import java.util.UUID;

public class TestUUID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
		System.out.println(mostSignificantBits);

	}

}
