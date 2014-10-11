package headfirst.collectionsandgenerics;

import java.util.*;
import java.io.*;

public class Jukebox8 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	HashSet<Song> songHashSet = new HashSet<Song>();
	TreeSet<Song> songTreeSet = new TreeSet<Song>();
	
	public static void main(String[] args) {
		Jukebox8 j1 = new Jukebox8();
		j1.go();
		j1.printHashCode(j1.songList, "List references");
		j1.printHashCode(j1.songHashSet, "Set references");
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
		System.out.println("Original - " + songList);
		
		Collections.sort(songList);
		System.out.println("Original Sort - " + songList);
		
//		Collections.sort(songList, new ArtistCompare());
//		System.out.println("Original ArtistCompare - " + songList);
		
		songTreeSet.addAll(songList);
		System.out.println("TreeSet - " + songTreeSet);
		
		songHashSet.addAll(songList);
		System.out.println("HashSet - " + songHashSet);
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
