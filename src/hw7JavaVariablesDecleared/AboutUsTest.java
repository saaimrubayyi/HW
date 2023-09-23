package hw7JavaVariablesDecleared;

public class AboutUsTest {
	public static void main(String[] args) {
		AboutUs aboutUs = new AboutUs();
		// This is where the constructor is initialized
		System.out.println("------------This is about Rubayyi------------");
		aboutUs.myName = "Rubayyi Saaim";
		aboutUs.myAge = 15;
		aboutUs.myBirthDate = 21;
		aboutUs.myBirthMonth = 9000;
		aboutUs.myBirthYear = 200000000007l;
		aboutUs.myHightInCm = 158.2f;
		aboutUs.myFavoriteNumber = 3.1415936;
		aboutUs.mySex = 'F';
		aboutUs.myGradeInEnglish = 'A';
		aboutUs.fullTimeWorker = false;
		// This is where variable is initialized
		aboutUs.aboutUs();
		// This is where method is initialized

		AboutUs Alex = new AboutUs();
		System.out.println("------------This is about Alex------------");
		Alex.myName = "Alex";
		Alex.myAge = 15;
		Alex.myBirthDate = 30;
		Alex.myBirthMonth = 7000;
		Alex.myBirthYear = 210000000007l;
		Alex.myHightInCm = 192.2f;
		Alex.myFavoriteNumber = 3.1415936;
		Alex.mySex = 'M';
		Alex.myGradeInEnglish = 'C';
		Alex.fullTimeWorker = false;
		Alex.aboutUs();
	}
}
