import java.util.*;
public class QueueReview {
	public static void main(String[] args) {
		ArrayList<String> arrl;
		arrl = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		int option;
		while (true) {
			System.out.println("1. Print waiting list\n2. Add waiting list entry\n3. Fulfill book request\n4. Exit");
			option = s.nextInt();
			if (option == 1) {
				for (String request : arrl) {
					System.out.println(request);
				}
				s.nextLine();
			}
			else if (option == 2) {
				System.out.print("Join waiting list for: ");
				arrl.add(s.next());
			}
			else if (option == 3) {
				System.out.println("Fulfilled request for: " + arrl.remove(0));
				s.next();
			}
			else if (option == 4) {
				System.exit(0);
			}
		}
	}
}