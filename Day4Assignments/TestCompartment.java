package com.hcltech.Assig4;

import java.util.Random;

//TestCompartment class to test the functionality
public class TestCompartment {
public static void main(String[] args) {
   // Declare an array of Compartment of size 10
   Compartment[] compartments = new Compartment[10];

   // Create a random object to generate random integers
   Random random = new Random();

   // Assign compartments based on randomly generated integers
   for (int i = 0; i < compartments.length; i++) {
       int randInt = random.nextInt(4) + 1; // Random integer in the range 1 to 4
       switch (randInt) {
           case 1:
               compartments[i] = new FirstClass();
               break;
           case 2:
               compartments[i] = new Ladies();
               break;
           case 3:
               compartments[i] = new General();
               break;
           case 4:
               compartments[i] = new Luggage();
               break;
       }
   }

   // Check polymorphic behavior of notice method
   for (Compartment compartment : compartments) {
       compartment.notice();
   }
}
}
