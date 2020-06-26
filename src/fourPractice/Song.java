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
		System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	public static void main(String[] args) {
		Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		song.show();
		
	}
}
