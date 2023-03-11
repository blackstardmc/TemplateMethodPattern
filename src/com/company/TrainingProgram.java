package com.company;

public abstract class TrainingProgram {

    public final void run() {
        warmUp();
        doMainExercise();
        coolDown();
        hydration();
    }

    private void hydration() {
        System.out.println("Drink some water");
    }

    protected abstract void warmUp();

    protected abstract void doMainExercise();

    protected abstract void coolDown();
}

class CardioProgram extends TrainingProgram {

    @Override
    protected void warmUp() {
        System.out.println("Warming up with jumps and stretches");
    }

    @Override
    protected void doMainExercise() {
        System.out.println("Running on the treadmill for 30 min");
    }

    @Override
    protected void coolDown() {
        System.out.println("Cooling down with light walking and stretches");
    }
}

class StrengthProgram extends TrainingProgram {

    @Override
    protected void warmUp() {
        System.out.println("Warming up with light weight lifting.");
    }

    @Override
    protected void doMainExercise() {
        System.out.println("Performing 3 sets of 12 reps of squats, bench press and barbell row.");
    }

    @Override
    protected void coolDown() {
        System.out.println("Cooling down with stretching and light walking.");
    }
}


class StretchProgram extends TrainingProgram {

    @Override
    protected void warmUp() {
        System.out.println("Warming up with light stretching.");
    }

    @Override

    protected void doMainExercise() {
        System.out.println("Performing a series of 5 leg and arm stretches.");
    }

    @Override
    protected void coolDown() {
        System.out.println("Cooling down with long, deep stretches.");
    }
}
