package character;

public class spearman {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void attack() {
		this.hp -= 5;
		this.fp -= 5;
	}

	public void gurad() {
		this.hp -= 5;
		this.fp -= 5;
	}

	public void magickattack() {
		this.hp -= 5;
		this.mp -= 5;
		this.fp -= 5;
	}

	public void specialattack() {
		this.hp -= 7;
		this.mp -= 4;
		this.fp -= 9;
	}

	public void shortbreak() {
		this.hp += 2;
	}
}
