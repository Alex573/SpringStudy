package training.spring.impls.robot;

import training.spring.interfaces.Hand;
import training.spring.interfaces.Head;
import training.spring.interfaces.Leg;
import training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;


	private String color;
	private int age;
	private boolean soundEnabled;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int age, boolean soundEnabled) {
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.color = color;
		this.age = age;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(String color, int age, boolean soundEnabled) {
		this.color = color;
		this.age = age;
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void fire() {
		head.calc();
		hand.catchSomething();
		leg.go();
		System.out.println("color: " + color);
		System.out.println("age: " + age);
		System.out.println("soundEnabled: " + soundEnabled);
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}
}
