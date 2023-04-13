package com.skillstorm.week3;

public class PetsMain {

	public static void main(String[] args) {
		Dog[] dogAry = { new Dog("Sleepy", (short) 22, "rope", "Low", (short) 10),
				new Dog("Grumpy", (short) 67, "ball", "High", (short) 2),
				new Dog("Dopey", (short) 45, "frisbee", "Medium", (short) 7) };

//		Dogs cutestDog = new Dogs();
//		for (Dogs p: dogArray) {
//			if (p.cuteness > cutestDog.cuteness) {
//				cutestDog = p;
//			}
//		}
		Dog cutestDog = Dog.findCutest(dogAry);
		System.out.print("Cutest dog is: ");
		System.out.println(cutestDog.dogName + " " + cutestDog.cuteness + "/10 cuteness level.");
	}
}