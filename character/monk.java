package character;

public class monk {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void heal() {
		this.mp -= 3;
		this.fp -= 1;
	}

	public void shortbreak() {
		hp += 1;
	}
}
