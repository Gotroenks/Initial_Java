package Arrays;

public class Foreach {

	public static void main(String[] args) {

		double[] Notes = { 5, 9, 4.5, 7.5 };

		for (int i = 0; i < Notes.length; i++) {

			System.out.println(Notes[i]);
		}

		for (double Note : Notes) {

			System.out.println(Note);
		}
	}
}
