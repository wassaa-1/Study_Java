package step05oop.step09interface.advanced;

public class MusicTest {

	public static void main(String[] args) {
		Audio lpRecord = new Audio();
		
		Playable[] playList = {new Bts(), new Blackpink(), new Joy()};
		
		for (Playable album : playList) {
			lpRecord.musicPlay(album);
		}
		
	}
	
}
