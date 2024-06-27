package character;

public class magician {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void attack() {
		this.hp -= 2;
		this.mp -= 3;
		this.fp -= 1;
	}

	public void guard() {
		this.hp -= 1;
		this.mp -= 3;
		this.fp -= 1;
	}

	public void shortbreak() {
		this.hp += 1;
	}
}
