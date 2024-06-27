package com.hcltech.Assig4;

public class Instrumentdemo {
	    public static void main(String[] args) {
	        // Create an array of 10 Instruments
	        Instrument[] instruments = new Instrument[10];
	        
	        // Assign different types of instruments to the array
	        instruments[0] = new Piano();
	        instruments[1] = new Flute();
	        instruments[2] = new Guitar();
	        instruments[3] = new Piano();
	        instruments[4] = new Flute();
	        instruments[5] = new Guitar();
	        instruments[6] = new Piano();
	        instruments[7] = new Flute();
	        instruments[8] = new Guitar();
	        instruments[9] = new Piano();

	        // Check polymorphic behavior of play method
	        for (Instrument instrument : instruments) {
	            instrument.play();
	        }

	        // Use the instanceof operator to print the type of object stored at each index
	        for (int i = 0; i < instruments.length; i++) {
	            if (instruments[i] instanceof Piano) {
	                System.out.println("Instrument at index " + i + " is a Piano");
	            } else if (instruments[i] instanceof Flute) {
	                System.out.println("Instrument at index " + i + " is a Flute");
	            } else if (instruments[i] instanceof Guitar) {
	                System.out.println("Instrument at index " + i + " is a Guitar");
	            }
	        }
	    }
	}



