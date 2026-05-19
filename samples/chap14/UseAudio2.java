public class UseAudio2 {
	public static void main(String[] args) {
		Audio a = new MusicPlayer();
		System.out.println("---MusicPlayerを使う---");
		a.play();
		a.stop();

		a = new PodcastPlayer();
		System.out.println("---PodcastPlayerを使う---");
		a.play();
		a.stop();
	}
}
