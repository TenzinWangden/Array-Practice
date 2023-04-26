package Pets;

public class Dog {

	static String genus = "kanine";

	String dogName;
	short weight;
	String favoriteToy;
	String activityLevel;
	short cuteness;

	public Dog() {
	}

	public Dog(String dogName, short weight, String favoriteToy, String activityLevel, short cuteness) {
		this.dogName = dogName;
		this.weight = weight;
		this.favoriteToy = favoriteToy;
		this.activityLevel = activityLevel;
		this.cuteness = cuteness;
	}

	@Override
	public String toString() {
		return "name =" + this.dogName + ", height = " + this.weight + ", favoriteToy = " + this.favoriteToy
				+ ", activityLevel = " + this.activityLevel + ", cuteness= " + this.cuteness + "genus = " + Dog.genus;
	}

	public static Dog findCutest(Dog[] pets) {
		Dog cutestDog = new Dog();
		for (Dog p : pets) {
			if (p.cuteness > cutestDog.cuteness) {
				cutestDog = p;
			}

		}
		return cutestDog;

	}

}
