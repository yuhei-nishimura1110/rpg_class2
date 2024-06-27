package character;

public class grantedmagucuan {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void buff() {
		this.hp -= 1;
		this.mp -= 3;
		this.fp -= 1;
	}

	public void shortbreak() {
		hp += 1;
	}

}
