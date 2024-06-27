package Day4Exercise;

class Car {
    protected int speed;
    protected int noOfGear;

    public Car() {
        this.speed = 0;
        this.noOfGear = 0;
    }

    public void drive(int speed, int noOfGear) {
        this.speed = speed;
        this.noOfGear = noOfGear;
    }

    public void display() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of Gears: " + noOfGear);
    }
}

class SportCar extends Car {
	
    private String AirBallonType;

    public SportCar() {
        super();
        this.AirBallonType = "";
    }

    public void drive(int speed, int noOfGear, String AirBallonType) {
        super.drive(speed, noOfGear);
        this.AirBallonType = AirBallonType;
        System.out.println("Initial Speed: " + this.speed);
        System.out.println("Initial Number of Gears: " + this.noOfGear);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Air Balloon Type: " + AirBallonType);
    }

}