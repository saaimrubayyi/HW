package hw8UseOfLoop;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Java_control_statement {
	public static void main(String[] args) {

		for (int i = -20; i <= 50; i++) {
			if (i % 2 == -1) {
				System.out.println("Odd number: " + i);
			} else if (i % 2 == 1) {
				System.out.println("Odd number: " + i);
			} else if (i % 2 == 0) {
				System.out.println("Even number:" + i);
			}
		}

	}
}
