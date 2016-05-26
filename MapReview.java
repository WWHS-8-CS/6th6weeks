import java.util.*;
public class MapReview {
	public static void main(String[] args) {
		HashMap<Integer, String> map;
		map = new HashMap<Integer, String>();
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\n");
		int option;
		while (true) {
			System.out.println("1. Print students\n2. Add student\n3. Remove student\n4. Exit");
			option = s.nextInt();
			if (option == 1) {
				for (Integer key : map.keySet()) {
					System.out.println(map.get(key) + ": " + key);
				}
				s.nextLine();
			}
			else if (option == 2) {
				System.out.print("Enter a new ID: ");
				int id = s.nextInt();
				System.out.print("Enter the student's name: ");
				map.put(id, s.next());
			}
			else if (option == 3) {
				System.out.print("Enter ID of the student to remove: ");
				int id = s.nextInt();
				System.out.println("Removed: " + map.remove(id));
				s.next();
			}
			else if (option == 4) {
				System.exit(0);
			}
		}
	}
}