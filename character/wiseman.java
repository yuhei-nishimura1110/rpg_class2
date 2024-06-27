package character;

public class wiseman {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
		this.mp += 2;
	}

	public void heal() {
		this.fp -= 3;
	}

	public void shortbreak() {
		hp += 1;
	}
}
