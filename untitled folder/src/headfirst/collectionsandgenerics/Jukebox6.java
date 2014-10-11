package headfirst.collectionsandgenerics;

import java.util.*;
import java.io.*;

public class Jukebox6 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	HashSet<Song> songSet = new HashSet<Song>();
	
	public static void main(String[] args) {
		Jukebox6 j1 = new Jukebox6();
		j1.go();
		j1.printHashCode(j1.songList, "List references");
		j1.printHashCode(j1.songSet, "Set references");
	}
	
	public void printHashCode(Collection<Song> songs,
			String printMessage) {
		System.out.println(printMessage);
		for(Song s : songs) {
			System.out.println(s.hashCode());
		}
	}
	
	class ArtistCompare implements Comparator<Song> {
		public int compare(Song s1, Song s2) {
			return s1.getArtist().compareTo(s2.getArtist());
		}
		
	}
	
	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
//		Collections.sort(songList, new ArtistCompare());
//		System.out.println(songList);
		
		songSet.addAll(songList);
		songList.equals(songList);
		System.out.println(songSet);
	}
	
	void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}
