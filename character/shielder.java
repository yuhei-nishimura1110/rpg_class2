package character;

public class shielder {
	int hp;
	int mp;
	int fp;

	public void stay() {
		this.fp--;
	}

	public void guard() {
		this.hp -= 3;
		this.fp -= 2;
	}

	public void magickguard() {
		this.hp -= 4;
		this.mp -= 5;
		this.fp -= 2;
	}

	public void superguard() {
		this.hp -= 5;
		this.fp -= 4;
	}

	public void supecialguard() {
		this.hp -= 2;
		this.mp -= 3;
		this.fp -= 2;
	}

	public void shortbreak() {
		this.hp += 1;
	}
}
