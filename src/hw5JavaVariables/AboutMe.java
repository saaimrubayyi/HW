package hw5JavaVariables;

public class AboutMe {
	public String myFavoriteSportString;
	public String myName = "Rubayyi Saaim";
	public byte myBirthDate = 21;
	public short myBirthMonth = 900;
	public int myAge = 1500000;
	public long myBirthYear = 20070000000l;
	public float myHightInCm = 158.496f;
	public double myFavoriteNumber = 3.14159265;
	public char mySex = 'F';
	public char myGradeInEnglish = 'A';
	public boolean fullTimeWorker = false;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("My name: " + aboutMe.myName + "\nMy Age: " + aboutMe.myAge + "\nMy birth date: "
				+ aboutMe.myBirthDate + "\nMy birth month: " + aboutMe.myBirthMonth + "\nMy birth year: "
				+ aboutMe.myBirthYear + "\n My hight in cm: " + aboutMe.myHightInCm + "\nMy favorite number: "
				+ aboutMe.myFavoriteNumber + "\nMy sex: " + aboutMe.mySex + "\nMy grade in English: "
				+ aboutMe.myGradeInEnglish + "\nAm I a full time worker?: " + aboutMe.fullTimeWorker);
	}

}
