package bonifacio_L17Activity1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			PlayList playlist = new PlayList();
			
			while (true) {
				System.out.println("\n1. Add song to playlist\n2. Display playlist\n"
						+ "3. Remove a song from playlist\n4. Play a song\n5. Search artist\n6. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine();
				
				switch(choice) {
				case 1:
					System.out.print("Enter song title: "); 
					String title = scanner.nextLine();
					System.out.print("Enter artist name: "); 
					String artist = scanner.nextLine();
					playlist.addSong(title, artist);
					break;
				case 2:
					playlist.displayPlayList();
					break;
				case 3:
					System.out.print("Enter title of song to remove: ");
					title = scanner.nextLine();
					playlist.removeSong(title);
					break;
				case 4:
					playlist.displayCurrentSong();
					playlist.displayNextSong();
					break;
				case 5:
					String searchArtist = scanner.nextLine();
					playlist.searchSong(searchArtist);
					break;
				case 6:
					System.out.println("Exiting playlist.");
					System.exit(0);
					default: System.out.println("Invalid choice. Please try again");
				}
			}
		}
	}
}
