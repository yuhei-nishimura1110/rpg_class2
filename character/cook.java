package character;

public class cook {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void cooking() {
		this.fp++;
		this.mp -= 3;
	}

	public void shortbreak() {
		hp += 1;
	}
}
