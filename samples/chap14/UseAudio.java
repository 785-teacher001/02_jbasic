public class UseAudio {
	public static void main(String[] args) {
		MusicPlayer m = new MusicPlayer();
		System.out.println("---MusicPlayerを使う---");
		m.play();
		m.stop();
		
		PodcastPlayer p = new PodcastPlayer();
		System.out.println("---PodcastPlayerを使う---");
		p.play();
		p.stop();
	}
}
