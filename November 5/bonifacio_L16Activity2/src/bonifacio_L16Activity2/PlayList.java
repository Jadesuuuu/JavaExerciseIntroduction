package bonifacio_L16Activity2;

import java.util.LinkedList;

public class PlayList {
	private LinkedList<Song> playlist;
	private int currentSongIndex;
	
	public PlayList() {
		this.playlist = new LinkedList<Song>();
		this.currentSongIndex = -1;
	}
	
	public void addSong(String title, String artist) {
		playlist.add(new Song(title, artist));
	}
	
	public void displayPlayList() {
		if (playlist.isEmpty()) {
			System.out.println("Playlist is empty.");
			return;
		}
		
		System.out.println("Playlist: ");
		for (int i = 0; i < playlist.size(); i++) {
			Song song = playlist.get(i);
			System.out.println((i + 1) + ". " + song.getSongTitle() + " - " + song.getArtist());
		}
	}
	
	public void removeSong(String title) {
		for (int i = 0; i < playlist.size(); i++) { 
			Song song = playlist.get(i);
			if (song.getSongTitle().equals(title)) {
				playlist.remove();
				return;
			}
		}
		System.out.println("Song not found in playlist.");
	}
	
	public void displayCurrentSong() {
		if (currentSongIndex == -1) {
		  System.out.println("No song is currently playing.");
		  return;
		}
		Song song = playlist.get(currentSongIndex);
		System.out.println("Currently Playing: " + song.getSongTitle() + " - " + song.getArtist());
	}
	
	public void displayNextSong() {
		if (playlist.isEmpty()) {
		      System.out.println("Playlist is empty.");
		      return;
		}
		int nextIndex = currentSongIndex + 1;
		if (nextIndex >= playlist.size()) {
		  System.out.println("Reached the end of playlist.");
		  return;
		}
		Song song = playlist.get(nextIndex);
		System.out.println("Next Song: " + song.getSongTitle() + " - " + song.getArtist());
	}
}
	
	
