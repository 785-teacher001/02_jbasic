public class Truck extends Car3 implements Audio, Carriable {
	public void play() {
		System.out.println("カーステレオを再生します。");
	}

	public void stop() {
		System.out.println("カーステレオを停止します。");
	}

	public void carry() {
		System.out.println("トラックで荷物を運びます。");
	}
}
