public class UseAudio3 {
	public static void main(String[] args) {
		Audio[] players = 
			new Audio[] { new MusicPlayer(), new PodcastPlayer(), new Truck() };

		for (Audio audio : players) {
			audio.play();
			audio.stop();
		}
	}
}
