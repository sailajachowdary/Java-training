package com.hcltech.Assig4;
	// Define the abstract class Instrument
	abstract class Instrument {
	    // Abstract method play
	    abstract void play();
	}

	// Subclass Piano extending Instrument
	class Piano extends Instrument {
	    // Override the play method
	    @Override
	    void play() {
	        System.out.println("Piano is playing tan tan tan tan");
	    }
	}

	// Subclass Flute extending Instrument
	class Flute extends Instrument {
	    // Override the play method
	    @Override
	    void play() {
	        System.out.println("Flute is playing toot toot toot toot");
	    }
	}

	// Subclass Guitar extending Instrument
	class Guitar extends Instrument {
	    // Override the play method
	    @Override
	    void play() {
	        System.out.println("Guitar is playing tin tin tin");
	    }
	}


	


