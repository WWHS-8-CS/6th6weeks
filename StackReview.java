import java.util.*;
public class StackReview {
	public static void main(String[] args) {
		ArrayList<String> arrl;
		arrl = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		int option;
		while (true) {
			System.out.println("1. Print tasks\n2. Add task\n3. Complete task\n4. Exit");
			option = s.nextInt();
			if (option == 1) {
				for (String task : arrl) {
					System.out.println(task);
				}
				s.nextLine();
			}
			else if (option == 2) {
				System.out.print("Enter a new task: ");
				arrl.add(s.next());
			}
			else if (option == 3) {
				System.out.println("Completed: " + arrl.remove(arrl.size()-1));
				s.next();
			}
			else if (option == 4) {
				System.exit(0);
			}
		}
	}
}