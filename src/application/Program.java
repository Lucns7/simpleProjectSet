package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> courses = new ArrayList<>();
		courses.add("A");
		courses.add("B");
		courses.add("C");

		Set<Integer> students = new HashSet<>();

		for (String course : courses) {
			System.out.print("How many Students for course " + course + "?: ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				int codStudent = sc.nextInt();
				students.add(codStudent);
			}

		}
		System.out.println("Total Students: " + students.size());

		sc.close();

	}

}
