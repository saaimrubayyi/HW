package hw11Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("-------------------------------------");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		animal.animalInfo();
		// Here is a single level inheritance

		System.out.println("-------------------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		animal.animalInfo();

		System.out.println("-------------------------------------");
		Birds birds = new Birds();
		birds.birdsInfo();
		animal.animalInfo();
		// Here the Mammal, Reptile, and Birds are the multilevel Inheritance

		System.out.println("-------------------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();

		System.out.println("-------------------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		reptile.reptileInfo();
		animal.animalInfo();

		System.out.println("-------------------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		birds.birdsInfo();
		animal.animalInfo();

		System.out.println("-------------------------------------");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();

		System.out.println("-------------------------------------");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		snake.snakeInfo();
		reptile.reptileInfo();
		animal.animalInfo();
		// Here the Bulldog, Cobra, and Robin represents Hierarchical inheritance

	}

}
