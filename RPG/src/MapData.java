//0 = ground
//1 = wall
//2 = portal
//3 = NPC
//4 = sign
//5 = chest
//6 = player


public class MapData {
	int x, y = 0;
	int map = 1;
	int map_data[][] = new int[10][10];
	void getMapCode(int map_code) {
		//null_place
		if(map_code == 2) {
			x = 0; 
			y = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					map_data[i][j] = 0;
					
				}
			}
			
		}
		//start_place
		if(map_code == 1) {
			x = 4;
			y = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if(j < 3 || j > 5) {
						map_data[i][j] = 1;
					}
					else {
						map_data[i][j] = 0;
					}
				}
			}
			map_data[8][4] = 2;
			
		}
		if(map_code == 2) {
			
		}
	}
	void draw_map() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(map_data[i][j] == 0) {
					if(i == y && j == x) {
						System.out.printf("# ");
					}
					else {
						System.out.printf("* ");
					}
				}
				else if(map_data[i][j] == 1) {
					System.out.printf("O ");
				}
				else if(map_data[i][j] == 2) {
					System.out.printf("@ ");
				}
				else if(map_data[i][j] == 3) {
					System.out.printf("! ");
				}
				else if(map_data[i][j] == 4) {
					System.out.printf("P ");
				}
				else if(map_data[i][j] == 5) {
					System.out.printf("$ ");
				}
				
			}
			System.out.println();
		}
	}
}
