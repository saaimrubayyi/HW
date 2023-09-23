package hw7JavaVariablesDecleared;

public class AboutUs {
	// This is where variable is declared
	public String myFavoriteSportString;
	public String myName;
	public byte myBirthDate;
	public short myBirthMonth;
	public int myAge;
	public long myBirthYear;
	public float myHightInCm;
	public double myFavoriteNumber;
	public char mySex;
	public char myGradeInEnglish;
	public boolean fullTimeWorker;

	public AboutUs() {
		// The constructor is declared
		System.out.println(":---------- This is all about Us -------------:");

	}

	public void aboutUs() {
		// This is where the method is implemented
		System.out.println("My name: " + myName + "\nMy Age: " + myAge + "\nMy birth date: " + myBirthDate
				+ "\nMy birth month: " + myBirthMonth + "\nMy birth year: " + myBirthYear + "\n My hight in cm: "
				+ myHightInCm + "\nMy favorite number: " + myFavoriteNumber + "\nMy sex: " + mySex
				+ "\nMy grade in English: " + myGradeInEnglish + "\nAm I a full time worker?: " + fullTimeWorker);

	}
}
