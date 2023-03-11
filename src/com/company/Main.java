package com.company;

public class Main {

    public static void main(String[] args) {
        TrainingProgram strengthProgram = new StrengthProgram();
        TrainingProgram stretchProgram = new StretchProgram();
        TrainingProgram cardioProgram = new CardioProgram();

        System.out.println("\n 		Strength Program");
        strengthProgram.run();

        System.out.println("\n		Stretch Program");
        stretchProgram.run();

        System.out.println("\n		Cardio Program");
        cardioProgram.run();
    }
}
