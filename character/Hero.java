package character;

public class Hero {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void attack() {
		this.hp -= 3;
		this.fp -= 2;
	}

	public void superattack() {
		this.hp -= 6;
		this.fp -= 4;
	}

	public void magickattack() {
		this.hp -= 4;
		this.mp -= 4;
		this.fp -= 4;
	}

	public void supermagickattack() {
		this.hp -= 6;
		this.mp -= 6;
		this.fp -= 6;
	}

	public void supecialattack() {
		this.hp -= 5;
		this.mp -= 5;
		this.fp -= 5;
	}

	public void shortbreak() {
		this.hp += 1;
	}
}
