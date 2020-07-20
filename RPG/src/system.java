
public class system extends MapData{
	void clear_line() {
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}
	}
	
	void intro() {
		System.out.println("You're a hero. Go the castle and save the world.");
		System.out.println("Enter to start");
		
	}
	void Move(int dir) {
		if(dir == 6) {
			if(map_data[y][x + 1] == 0) {
				x++;
			}
			else if(map_data[y][x + 1] == 2) {
				getMapCode(map + 1);
				map++;
			}
		}
		else if(dir == 2) {
			if(map_data[y + 1][x] == 0) {
				y++;
			}
			else if(map_data[y + 1][x] == 2) {
				getMapCode(map + 1);
				map++;
			}
			
		}
		else if(dir == 4) {
			if(map_data[y][x - 1] == 0) {
				x--;
			}
			else if(map_data[y][x - 1] == 2) {
				getMapCode(map + 1);
				map++;
			}
		}
		else {
			if(map_data[y - 1][x] == 0) {
				y--;
			}
			else if(map_data[y - 1][x] == 2) {
				getMapCode(map + 1);
				map++;
			}
			
		}
	}
}
