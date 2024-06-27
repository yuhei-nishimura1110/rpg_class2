package character;

public class bower {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void attack() {
		this.hp -= 1;
		this.fp -= 1;
	}

	public void magickattack() {
		this.hp -= 2;
		this.mp -= 3;
		this.fp -= 1;
	}

	public void specialattack() {
		this.hp -= 2;
		this.mp -= 2;
		this.fp -= 1;
	}

	public void shortbreak() {
		this.hp += 1;
	}
}
