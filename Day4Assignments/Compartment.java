package com.hcltech.Assig4;
import java.util.Random;

//Define the abstract class Compartment
abstract class Compartment {
 // Abstract method notice
 abstract void notice();
}

//Subclass FirstClass extending Compartment
class FirstClass extends Compartment {
 // Override the notice method
 @Override
 void notice() {
     System.out.println("This is a First Class compartment.");
 }
}

//Subclass Ladies extending Compartment
class Ladies extends Compartment {
 // Override the notice method
 @Override
 void notice() {
     System.out.println("This is a Ladies compartment.");
 }
}

//Subclass General extending Compartment
class General extends Compartment {
 // Override the notice method
 @Override
 void notice() {
     System.out.println("This is a General compartment.");
 }
}

//Subclass Luggage extending Compartment
class Luggage extends Compartment {
 // Override the notice method
 @Override
 void notice() {
     System.out.println("This is a Luggage compartment.");
 }
}

