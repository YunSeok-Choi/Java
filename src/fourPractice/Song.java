package fourPractice;

public class Song {
	String title, artist, country;
	int year;
	Song(){ }
	Song(int y, String c, String a, String t){
		title = t;
		artist = a;
		country = c;
		year = y;
	}
	void show() {
		System.out.print(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
	public static void main(String[] args) {
		Song song = new Song(1978, "������", "ABBA", "Dancing Queen");
		song.show();
		
	}
}
