package character;

public class blacksmith {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void create() {
		this.hp -= 2;
		this.mp -= 1;
		this.fp -= 1;
	}

	public void bigcreate() {
		this.hp -= 3;
		this.mp -= 2;
		this.fp -= 2;
	}

	public void shortbreak() {
		this.hp += 1;
	}
}
