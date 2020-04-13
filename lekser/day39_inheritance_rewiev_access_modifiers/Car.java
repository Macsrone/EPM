package day39_inheritance_rewiev_access_modifiers;

public class Car extends Vehicle{

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManuel;
	private int currentGear;
	
	public Car(int wheels, int doors, int gears, boolean isManuel) {
		super(); 
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManuel = isManuel;
		this.currentGear = 1;
	}
	
	

	



	public Car(String name, String size, int currentVelocity, int currentDirection) {
		super(name, size, currentVelocity, currentDirection);
		// TODO Auto-generated constructor stub
	}



	public Car(String name, String size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}



	public void changeGear(int currentGear) {
			this.currentGear = currentGear;
	}
	
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVelocity():Velocity "+ speed + " direction "+ direction);
		move(speed, direction);
	}
	
	@Override
	public void move(int velocity, int direction) {
		setCurrentDirection(direction+10);
		setCurrentVelocity(velocity+10);
		System.out.println("Velocity.move(): Moving at "+ getCurrentVelocity() + " in direction " + direction);
	}
	
	
}
