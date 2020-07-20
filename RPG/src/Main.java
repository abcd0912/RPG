import java.util.Scanner;

public class Main extends system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		system fc = new system();
		
		System.out.println("RPG ver.0.1");
		System.out.println("Enter to next");
		sc.nextLine();
		fc.clear_line();
		fc.intro();
		sc.nextLine();
		
		fc.clear_line();
		fc.getMapCode(1);
		while(true) {
			fc.draw_map();
			int dir = 0;
			dir = sc.nextInt();
			fc.Move(dir);
		}
	}

}


