package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		Father father = new Father();
		Father fatherInfo = new Father("Mohammad", 444, 'M', false);
		father.father();
		fatherInfo.fatherInfo("Muhammad", 87, 'M', false);

		Daughter daughter = new Daughter();
		Daughter daughterInfo = new Daughter(5, 8);
		daughter.daughter();
		daughterInfo.daughter();

	}

}
