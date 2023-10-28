package hw14Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColombiaUniversity colombiaUniversity = new ColombiaUniversity();
		colombiaUniversity.biology();
		colombiaUniversity.hygiene();
		colombiaUniversity.caring();
		colombiaUniversity.maths();
		colombiaUniversity.mechanicalLab();
		colombiaUniversity.anthopology();
		colombiaUniversity.classSize();
		colombiaUniversity.playGround();
		colombiaUniversity.teacher();
		colombiaUniversity.gymnasium();
		// colombiaUniversity.librery();
		colombiaUniversity.dorm();
		// colombiaUniversity.studyRoom();
		colombiaUniversity.morgadge();
		// colombiaUniversity.pharmacy();
		colombiaUniversity.vocationalInfo();
		colombiaUniversity.aeronauticallInfo();
		
		System.out.println("-----------------------------------------------------------");
		University university = new University() {
			
			@Override
			public void teacher() {
				// TODO Auto-generated method stub

			}

			@Override
			public void playGround() {
				// TODO Auto-generated method stub

			}

			@Override
			public void classSize() {
				// TODO Auto-generated method stub

			}
			
	
		};
		MedicalSchool medicalSchool = new MedicalSchool();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		medicalSchool.anthopology();
	}
}
