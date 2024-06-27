package character;

public class main {
	public static void main(String[] args) {
		Hero h = new Hero();
		spearman sp = new spearman();
		shielder sh = new shielder();
		bower bo = new bower();
		monk mo = new monk();
		magician ma = new magician();
		grantedmagucuan gr = new grantedmagucuan();
		blacksmith bl = new blacksmith();
		wiseman w = new wiseman();
		cook c = new cook();
		h.hp = sp.hp = sh.hp = bo.hp = mo.hp = ma.hp = gr.hp = bl.hp = w.hp = c.hp = 20;
		h.mp = sp.mp = sh.mp = bo.mp = mo.mp = ma.mp = gr.mp = bl.mp = w.mp = c.mp = 10;
		h.fp = sp.fp = sh.fp = bo.fp = mo.fp = ma.fp = gr.fp = bl.fp = w.fp = c.fp = 10;
		dragon d = new dragon();
		Bunru bunr = new Bunru();

		System.out.println("我々勇者一行はドラゴン討伐に出かけた▼");
		String z = new java.util.Scanner(System.in).nextLine();
		System.out.println("勇者一行はドラゴンと鉢合わせた▼");
		String z1 = new java.util.Scanner(System.in).nextLine();
		System.out.println("戦闘開始▼");
		String z2 = new java.util.Scanner(System.in).nextLine();
		int count = 1;
		int[] goste = new int[2000];
		while (h.hp > 0 || sp.hp > 0 || sh.hp > 0 || bo.hp > 0 || mo.hp > 0 || ma.hp > 0 || gr.hp > 0 || bl.hp > 0
				|| w.hp > 0 || c.hp > 0 || d.hp > 0) {
			// 表示画面
			System.out.println("第" + count + "ターン開始▼");
			String z3 = new java.util.Scanner(System.in).nextLine();
			System.out.println("ファイルを参照しながら各キャラクターの指示を数字を用いて入力してください。▼");
			String z4 = new java.util.Scanner(System.in).nextLine();
			System.out.println("なお、現在の勇者一行とモンスターのステータスは次の通りである。▼");
			String z5 = new java.util.Scanner(System.in).nextLine();
			System.out.println("勇者　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			String z6 = new java.util.Scanner(System.in).nextLine();
			System.out.println("槍使い　㏋:" + sp.hp + "　MP:" + sp.mp + "　FP:" + sp.fp + "▼");
			String z7 = new java.util.Scanner(System.in).nextLine();
			System.out.println("盾使い　㏋:" + sh.hp + "　MP:" + sh.mp + "　FP:" + sh.fp + "▼");
			String z8 = new java.util.Scanner(System.in).nextLine();
			System.out.println("弓使い　㏋:" + bo.hp + "　MP:" + bo.mp + "　FP:" + bo.fp + "▼");
			String z9 = new java.util.Scanner(System.in).nextLine();
			System.out.println("僧侶　㏋:" + mo.hp + "　MP:" + mo.mp + "　FP:" + mo.fp + "▼");
			String z10 = new java.util.Scanner(System.in).nextLine();
			System.out.println("魔術師　㏋:" + ma.hp + "　MP:" + ma.mp + "　FP:" + ma.fp + "▼");
			String z11 = new java.util.Scanner(System.in).nextLine();
			System.out.println("付与魔術師　㏋:" + gr.hp + "　MP:" + gr.mp + "　FP:" + gr.fp + "▼");
			String z12 = new java.util.Scanner(System.in).nextLine();
			System.out.println("鍛冶師　㏋:" + bl.hp + "　MP:" + bl.mp + "　FP:" + bl.fp + "▼");
			String z13 = new java.util.Scanner(System.in).nextLine();
			System.out.println("賢者　㏋:" + w.hp + "　MP:" + w.mp + "　FP:" + w.fp + "▼");
			String z14 = new java.util.Scanner(System.in).nextLine();
			System.out.println("調理師　㏋:" + c.hp + "　MP:" + c.mp + "　FP:" + c.fp + "▼");
			String z15 = new java.util.Scanner(System.in).nextLine();
			System.out.println("ドラゴン　㏋:" + d.hp + "▼");
			String z16 = new java.util.Scanner(System.in).nextLine();
			for (int i = 0; i < 1000; i++) {
				if (goste[i] > 0) {
					System.out.println("ゴブリン HP:" + goste[i] + "▼");
					String z17 = new java.util.Scanner(System.in).nextLine();
				}
			}
			System.out.println("勇者の指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");

			int hn = new java.util.Scanner(System.in).nextInt();
			switch (hn) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 3 -> {
				System.out.println("攻撃を選択しました");
			}
			case 5 -> {
				System.out.println("魔力攻撃を選択しました");
			}
			case 6 -> {
				System.out.println("必殺攻撃を選択しました");
			}
			case 7 -> {
				System.out.println("必殺魔力攻撃を選択しました");
			}
			case 8 -> {
				System.out.println("槍使いとともに攻撃を選択しました");
			}
			case 9 -> {
				System.out.println("弓使いとともに攻撃を選択しました");
			}
			case 10 -> {
				System.out.println("魔術師とともに攻撃を選択しました");
			}
			case 14 -> {
				System.out.println("攻撃陣で一斉に攻撃を選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				hn = 1;
			}
			}

			System.out.println("槍使いの指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int spn = new java.util.Scanner(System.in).nextInt();
			switch (spn) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 3 -> {
				System.out.println("攻撃を選択しました");
			}
			case 4 -> {
				System.out.println("防御を選択しました");
			}
			case 5 -> {
				System.out.println("魔力攻撃を選択しました");
			}
			case 8 -> {
				System.out.println("勇者とともに攻撃を選択しました");
			}
			case 11 -> {
				System.out.println("弓使いとともに攻撃を選択しました");
			}
			case 12 -> {
				System.out.println("魔術師とともに攻撃を選択しました");
			}
			case 14 -> {
				System.out.println("攻撃陣で一斉にに攻撃を選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				spn = 1;
			}
			}
			System.out.println("盾使いの指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int shn = new java.util.Scanner(System.in).nextInt();
			switch (shn) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 4 -> {
				System.out.println("防御を選択しました");
			}
			case 5 -> {
				System.out.println("魔力防御を選択しました");
			}
			case 6 -> {
				System.out.println("必殺防御を選択しました");
			}
			case 15 -> {
				System.out.println("魔術師とともに防御を選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				shn = 1;
			}
			}
			System.out.println("弓使いの指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int bon = new java.util.Scanner(System.in).nextInt();
			switch (bon) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 3 -> {
				System.out.println("攻撃を選択しました");
			}
			case 5 -> {
				System.out.println("魔力攻撃を選択しました");
			}
			case 9 -> {
				System.out.println("勇者とともに攻撃を選択しました");
			}
			case 11 -> {
				System.out.println("槍使いとともに攻撃を選択しました");
			}
			case 13 -> {
				System.out.println("魔術師とともに攻撃を選択しました");
			}
			case 14 -> {
				System.out.println("攻撃陣で一斉にに攻撃を選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				bon = 1;
			}
			}
			System.out.println("僧侶の指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int mon = new java.util.Scanner(System.in).nextInt();
			switch (mon) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 16 -> {
				System.out.println("勇者のHPを回復させるを選択しました");
			}
			case 17 -> {
				System.out.println("槍使いのHPを回復させるを選択しました");
			}
			case 18 -> {
				System.out.println("盾使いのHPを回復させるを選択しました");
			}
			case 19 -> {
				System.out.println("弓使いのHPを回復させるを選択しました");
			}
			case 21 -> {
				System.out.println("魔術師のHPを回復させるを選択しました");
			}
			case 27 -> {
				System.out.println("付与魔術師のHPを回復させるを選択しました");
			}
			case 28 -> {
				System.out.println("鍛冶職人のHPを回復させるを選択しました");
			}
			case 29 -> {
				System.out.println("賢者のHPを回復させるを選択しました");
			}
			case 30 -> {
				System.out.println("調理師のHPを回復させるを選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				mon = 1;
			}
			}
			System.out.println("魔術師の指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int man = new java.util.Scanner(System.in).nextInt();
			switch (man) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 3 -> {
				System.out.println("攻撃を選択しました");
			}
			case 4 -> {
				System.out.println("防御を選択しました");
			}
			case 10 -> {
				System.out.println("勇者とともに攻撃を選択しました");
			}
			case 12 -> {
				System.out.println("槍使いとともに攻撃を選択しました");
			}
			case 13 -> {
				System.out.println("弓使いとともに攻撃を選択しました");
			}
			case 14 -> {
				System.out.println("攻撃陣で一斉にに攻撃を選択しました");
			}
			case 15 -> {
				System.out.println("盾使いとともに防御を選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				man = 1;
			}
			}
			System.out.println("付与魔術師の指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int grn = new java.util.Scanner(System.in).nextInt();
			switch (grn) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 16 -> {
				System.out.println("勇者にバフを付与を選択しました");
			}
			case 17 -> {
				System.out.println("槍使いにバフを付与を選択しました");
			}
			case 18 -> {
				System.out.println("盾使いにバフを付与を選択しました");
			}
			case 19 -> {
				System.out.println("弓使いにバフを付与を選択しました");
			}
			case 21 -> {
				System.out.println("魔術師にバフを付与選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				grn = 1;
			}
			}
			System.out.println("鍛冶師の指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int bln = new java.util.Scanner(System.in).nextInt();
			switch (bln) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 16 -> {
				System.out.println("勇者に剣を付与を選択しました");
			}
			case 17 -> {
				System.out.println("槍使いに槍を付与を選択しました");
			}
			case 18 -> {
				System.out.println("盾使いに盾を付与を選択しました");
			}
			case 19 -> {
				System.out.println("弓使いに弓を付与を選択しました");
			}
			case 21 -> {
				System.out.println("魔術師に魔法の杖を付与選択しました");
			}
			case 22 -> {
				System.out.println("勇者に大剣を付与を選択しました");
			}
			case 23 -> {
				System.out.println("槍使いに大きな槍を付与を選択しました");
			}
			case 24 -> {
				System.out.println("盾使いに大きな盾を付与を選択しました");
			}
			case 25 -> {
				System.out.println("弓使いに大きな弓を付与を選択しました");
			}
			case 26 -> {
				System.out.println("魔術師に大きな魔法の杖を付与選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				bln = 1;
			}
			}
			System.out.println("賢者の指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int wn = new java.util.Scanner(System.in).nextInt();
			switch (wn) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 16 -> {
				System.out.println("勇者のMPを回復させるを選択しました");
			}
			case 17 -> {
				System.out.println("槍使いのMPを回復させるを選択しました");
			}
			case 18 -> {
				System.out.println("盾使いのMPを回復させるを選択しました");
			}
			case 19 -> {
				System.out.println("弓使いのMPを回復させるを選択しました");
			}
			case 21 -> {
				System.out.println("魔術師のMPを回復させるを選択しました");
			}
			case 27 -> {
				System.out.println("付与魔術師のMPを回復させるを選択しました");
			}
			case 28 -> {
				System.out.println("鍛冶職人のMPを回復させるを選択しました");
			}
			case 20 -> {
				System.out.println("僧侶のMPを回復させるを選択しました");
			}
			case 30 -> {
				System.out.println("調理師のmPを回復させるを選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				wn = 1;
			}
			}
			System.out.println("調理師の指示を入力してください。　㏋:" + h.hp + "　MP:" + h.mp + "　FP:" + h.fp + "▼");
			int cn = new java.util.Scanner(System.in).nextInt();
			switch (cn) {
			case 1 -> {
				System.out.println("待機を選択しました");
			}
			case 2 -> {
				System.out.println("休憩を選択しました");
			}
			case 16 -> {
				System.out.println("勇者のFPを回復させるを選択しました");
			}
			case 17 -> {
				System.out.println("槍使いのFPを回復させるを選択しました");
			}
			case 18 -> {
				System.out.println("盾使いのFPを回復させるを選択しました");
			}
			case 19 -> {
				System.out.println("弓使いのFPを回復させるを選択しました");
			}
			case 21 -> {
				System.out.println("魔術師のFPを回復させるを選択しました");
			}
			case 27 -> {
				System.out.println("付与魔術師のFPを回復させるを選択しました");
			}
			case 28 -> {
				System.out.println("鍛冶職人のFPを回復させるを選択しました");
			}
			case 29 -> {
				System.out.println("賢者のFPを回復させるを選択しました");
			}
			case 20 -> {
				System.out.println("僧侶のFPを回復させるを選択しました");
			}
			default -> {
				System.out.println("正しく選択されていません。自動的に待機が選択されました");
				cn = 1;
			}
			}

			// ゴブリンの処理
			goste[count * 2 - 1] = 20;
			goste[count * 2] = 20;
			System.out.println("HPが20のゴブリンが2対スポーンした▼");
			String z18 = new java.util.Scanner(System.in).nextLine();
			System.out.println("ゴブリン達が攻撃してきた▼");
			String z19 = new java.util.Scanner(System.in).nextLine();
			int gcount = 0;
			for (int i = 0; i == 1000; i++) {
				if (goste[i] < 1) {
					gcount++;
				}
			}
			// ドラゴンの処理
			int damege;
			int ddamege = 0;
			int dpoison = new java.util.Random().nextInt(10);
			int dragon1 = new java.util.Random().nextInt(10);
			if (count % 10 != 0) {
				if (dragon1 > 6) {
					int dragon2 = new java.util.Random().nextInt(2);
					if (dragon2 == 1) {
						if (dpoison < 3) {
							damege = gcount + 24;
							System.out.println("ドラゴンが特大攻撃を仕掛けてきた。▼");
							String z20 = new java.util.Scanner(System.in).nextLine();
							System.out.println("さらにドラゴンが毒攻撃を仕掛けてきた▼");
							String z21 = new java.util.Scanner(System.in).nextLine();

						} else {
							damege = gcount + 20;
							System.out.println("ドラゴンが特大攻撃を仕掛けてきた▼");
							String z22 = new java.util.Scanner(System.in).nextLine();
						}

					} else {
						damege = gcount;
						System.out.println("幸いにもドラゴンからの攻撃は無かった▼");
						String z23 = new java.util.Scanner(System.in).nextLine();
					}
				} else {
					if (dpoison < 3) {
						damege = 16 + gcount;
						System.out.println("ドラゴンが攻撃を仕掛けてきた▼");
						String z25 = new java.util.Scanner(System.in).nextLine();
						System.out.println("さらにドラゴンが毒攻撃を仕掛けてきた▼");
						String z24 = new java.util.Scanner(System.in).nextLine();
					} else {
						damege = 12 + gcount;
						System.out.println("ドラゴンが攻撃を仕掛けてきた▼");
						String z26 = new java.util.Scanner(System.in).nextLine();
					}

				}
			} else {
				damege = gcount;
				ddamege = 4;
				System.out.println("ドラゴンがつっ込んできた▼");
				String z27 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ドラゴンの攻撃はどうしようもなく全員がダメージを負った▼");
				String z28 = new java.util.Scanner(System.in).nextLine();

			}
			// 防御
			// 数字決め
			int pcount = 0;
			if (shn == 15) {
				if (man == 15) {
					if (spn == 4) {
						pcount = 2;
					} else {
						pcount = 1;
					}
				} else {
					pcount = 18;
				}
			} else if (shn == 6) {
				if (man == 4) {
					if (spn == 4) {
						pcount = 7;
					} else {
						pcount = 3;
					}
				} else if (man == 15) {
					pcount = 18;
				} else {
					if (spn == 4) {
						pcount = 13;
					} else {
						pcount = 4;
					}
				}
			} else if (shn == 5) {
				if (man == 4) {
					if (spn == 4) {
						pcount = 8;
					} else {
						pcount = 5;
					}
				} else if (man == 15) {
					pcount = 18;
				} else {
					if (spn == 4) {
						pcount = 14;
					} else {
						pcount = 6;
					}
				}
			} else if (shn == 4) {
				if (man == 4) {
					if (spn == 4) {
						pcount = 12;
					} else {
						pcount = 9;
					}
				} else if (man == 15) {
					pcount = 18;
				} else {
					if (spn == 4) {
						pcount = 15;
					} else {
						pcount = 10;
					}
				}
			} else {
				if (man == 4) {
					if (spn == 4) {
						pcount = 16;
					} else {
						pcount = 11;
					}
				} else if (man == 15) {
					pcount = 18;
				} else {
					if (spn == 4) {
						pcount = 17;
					} else {
						pcount = 19;
					}
				}
			}
			// 条件分岐
			int pp = new java.util.Random().nextInt(10);
			int presult = 0;
			switch (pcount) {
			case 1 -> {
				if (pp == 0) {
					presult = 2;
				} else {
					presult = 1;
				}
			}
			case 2 -> {
				if (pp < 2) {
					presult = 3;
				} else {
					presult = 1;
				}
			}
			case 3 -> {
				if (pp < 5) {
					presult = 1;
				} else if (pp < 8) {
					presult = 2;
				} else {
					presult = 3;
				}
			}
			case 4, 5 -> {
				if (pp == 0) {
					presult = 1;
				} else if (pp < 5) {
					presult = 2;
				} else {
					presult = 3;
				}
			}
			case 6 -> {
				if (pp < 3) {
					presult = 2;
				} else {
					presult = 3;
				}
			}
			case 7, 8 -> {
				if (pp < 3) {
					presult = 2;
				} else if (pp < 7) {
					presult = 3;
				} else {
					presult = 4;
				}
			}
			case 9 -> {
				if (pp < 2) {
					presult = 2;
				} else if (pp < 6) {
					presult = 3;
				} else {
					presult = 4;
				}
			}
			case 10, 11 -> {
				if (pp == 0) {
					presult = 2;
				} else if (pp < 3) {
					presult = 3;
				} else {
					presult = 4;
				}
			}
			case 12 -> {
				if (pp == 0) {
					presult = 2;
				} else if (pp < 3) {
					presult = 3;
				} else if (pp < 8) {
					presult = 4;
				} else {
					presult = 5;
				}
			}
			case 13 -> {
				if (pp < 3) {
					presult = 3;
				} else if (pp < 6) {
					presult = 4;
				} else {
					presult = 5;
				}
			}
			case 14 -> {
				if (pp < 2) {
					presult = 3;
				} else if (pp < 4) {
					presult = 4;
				} else {
					presult = 5;
				}
			}
			case 15, 16 -> {
				if (pp == 0) {
					presult = 3;
				} else if (pp < 3) {
					presult = 4;
				} else {
					presult = 5;
				}
			}
			case 17 -> {
				if (pp < 2) {
					presult = 4;
				} else {
					presult = 5;
				}
			}
			case 18 -> {
				presult = 6;
			}
			case 19 -> {
				presult = 5;
			}
			}

			if (bln == 24) {
				if (shn == 15 || shn == 4 || shn == 5 || shn == 6) {
					presult -= 2;
				}
			}
			if (bln == 21) {
				if (man == 15 || man == 4) {
					presult -= 1;
				}
			}
			if (bln == 18) {
				if (shn == 15 || shn == 4 || shn == 5 || shn == 6) {
					presult -= 1;
				}
			}
			if (bln == 26) {
				if (man == 15 || man == 4) {
					presult -= 2;
				}
			}
			if (grn == 21) {
				if (man == 15 || man == 4) {
					presult -= 1;
				}
			}
			if (grn == 18) {
				if (shn == 15 || shn == 4 || shn == 5 || shn == 6) {
					presult -= 1;
				}
			}
			if (presult < 1) {
				presult = 1;
			}
			int damegeresult = 0;
			switch (presult) {
			case 1 -> {
				damegeresult = damege * 0;
				if (ddamege == 4) {
					System.out.println("ゴブリンのダメージが無効化された▼");
					String z28 = new java.util.Scanner(System.in).nextLine();
					System.out.println("しかしながらドラゴンの体当たりの影響は大きいようだ▼");
					String z29 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("モンスターの攻撃が無効化された▼");
					String z30 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				damegeresult = damege * 1 / 4;
				if (ddamege == 4) {
					System.out.println("ゴブリンのダメージがかなり無効化された▼");
					String z31 = new java.util.Scanner(System.in).nextLine();
					System.out.println("さらにドラゴンの体当たりの影響は大きいようだ▼");
					String z32 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("モンスターの攻撃がかなり無効化された▼");
					String z33 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 3 -> {
				damegeresult = damege * 2 / 4;
				if (ddamege == 4) {
					System.out.println("ゴブリンのダメージが半減された▼");
					String z34 = new java.util.Scanner(System.in).nextLine();
					System.out.println("さらにドラゴンの体当たりの影響は大きいようだ▼");
					String z35 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("モンスターの攻撃が半減された▼");
					String z36 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 4 -> {
				damegeresult = damege * 3 / 4;
				if (ddamege == 4) {
					System.out.println("ゴブリンのダメージが少し無効化された▼");
					String z37 = new java.util.Scanner(System.in).nextLine();
					System.out.println("さらにドラゴンの体当たりの影響は大きいようだ▼");
					String z38 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("モンスターの攻撃が少し無効化された▼");
					String z39 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 5 -> {
				damegeresult = damege;
				if (ddamege == 4) {
					System.out.println("ゴブリンのダメージが無効化されなかったされた▼");
					String z40 = new java.util.Scanner(System.in).nextLine();
					System.out.println("加えてドラゴンの体当たりの影響は大きいようだ▼");
					String z4１ = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("モンスターの攻撃が無効化されなかった▼");
					String z42 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 6 -> {
				damegeresult = damege * 5 / 4;
				if (ddamege == 4) {
					System.out.println("連携ミスによりゴブリンのダメージが増幅された▼");
					String z43 = new java.util.Scanner(System.in).nextLine();
					System.out.println("加えてドラゴンの体当たりの影響は大きいようだ▼");
					String z44 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("連係ミスによりモンスターの攻撃が増幅された▼");
					String z45 = new java.util.Scanner(System.in).nextLine();
				}
			}
			}

			// 攻撃
			int atk = 0;

			if (hn == 14 && spn == 14 && bon == 14 && man == 14) {
				atk += 60;
				if (bln == 16) {
					if (hn == 14) {
						atk += 60;
					}
				}
				if (bln == 17) {
					if (spn == 14) {
						atk += 60;
					}
				}
				if (bln == 19) {
					if (bon == 14) {
						atk += 60;
					}
				}
				if (bln == 21) {
					if (man == 14) {
						atk += 60;
					}
				}
				if (grn == 16) {
					if (hn == 14) {
						atk += 120;
					}
				}
				if (grn == 17) {
					if (spn == 14) {
						atk += 120;
					}
				}
				if (grn == 19) {
					if (bon == 14) {
						atk += 120;
					}
				}
				if (grn == 21) {
					if (man == 14) {
						atk += 120;
					}
				}
				if (bln == 22) {
					if (hn == 14) {
						atk += 180;
					}
				}
				if (bln == 23) {
					if (spn == 14) {
						atk += 180;
					}
				}
				if (bln == 25) {
					if (bon == 14) {
						atk += 180;
					}
				}
				if (bln == 26) {
					if (man == 14) {
						atk += 180;
					}
				}
			}
			if (hn == 10 && man == 10) {
				atk += 37;
				if (bln == 16) {
					if (hn == 10) {
						atk += 37;
					}
				}
				if (bln == 21) {
					if (man == 10) {
						atk += 37;
					}
				}
				if (grn == 16) {
					if (hn == 10) {
						atk += 74;
					}
				}
				if (grn == 21) {
					if (man == 10) {
						atk += 74;
					}
				}
				if (bln == 22) {
					if (hn == 10) {
						atk += 111;
					}
				}
				if (bln == 26) {
					if (man == 10) {
						atk += 111;
					}
				}
			}
			if (hn == 9 && bon == 9) {
				atk += 37;

				if (bln == 16) {
					if (hn == 9) {
						atk += 37;
					}
				}
				if (bln == 19) {
					if (bon == 9) {
						atk += 37;
					}
				}
				if (grn == 16) {
					if (hn == 9) {
						atk += 74;
					}
				}
				if (grn == 19) {
					if (bon == 9) {
						atk += 74;
					}
				}
				if (bln == 22) {
					if (hn == 9) {
						atk += 111;
					}
				}
				if (bln == 25) {
					if (bon == 9) {
						atk += 111;
					}
				}
			}
			if (hn == 8 && spn == 8) {
				atk += 37;
				if (bln == 16) {
					if (hn == 8) {
						atk += 37;
					}
				}
				if (bln == 17) {
					if (spn == 8) {
						atk += 37;
					}
				}
				if (grn == 16) {
					if (hn == 8) {
						atk += 74;
					}
				}
				if (grn == 17) {
					if (spn == 8) {
						atk += 74;
					}
				}
				if (bln == 22) {
					if (hn == 8) {
						atk += 111;
					}
				}
				if (bln == 23) {
					if (spn == 8) {
						atk += 111;
					}
				}
			}
			if (hn == 7) {
				atk += 25;
				if (bln == 16) {
					if (hn == 7) {
						atk += 25;
					}
				}
				if (grn == 16) {
					if (hn == 7) {
						atk += 50;
					}
				}
				if (bln == 22) {
					if (hn == 7) {
						atk += 75;
					}
				}
			}
			if (bon == 13 && man == 13) {
				atk += 15;
				if (bln == 19) {
					if (bon == 13) {
						atk += 15;
					}
				}
				if (bln == 21) {
					if (man == 13) {
						atk += 15;
					}
				}
				if (grn == 19) {
					if (bon == 13) {
						atk += 30;
					}
				}
				if (grn == 21) {
					if (man == 13) {
						atk += 30;
					}
				}
				if (bln == 25) {
					if (bon == 13) {
						atk += 45;
					}
				}
				if (bln == 26) {
					if (man == 13) {
						atk += 45;
					}
				}
			}
			if (spn == 12 && man == 12) {
				atk += 15;
				if (bln == 17) {
					if (spn == 12) {
						atk += 15;
					}
				}
				if (bln == 21) {
					if (man == 12) {
						atk += 15;
					}
				}
				if (grn == 17) {
					if (spn == 12) {
						atk += 30;
					}
				}
				if (grn == 21) {
					if (man == 12) {
						atk += 30;
					}
				}
				if (bln == 23) {
					if (spn == 12) {
						atk += 45;
					}
				}
				if (bln == 26) {
					if (man == 12) {
						atk += 45;
					}
				}
			}
			if (spn == 11 && bon == 11) {
				atk += 15;
				if (bln == 17) {
					if (spn == 11) {
						atk += 15;
					}
				}
				if (bln == 19) {
					if (bon == 11) {
						atk += 15;
					}
				}
				if (grn == 17) {
					if (spn == 11) {
						atk += 30;
					}
				}
				if (grn == 19) {
					if (bon == 11) {
						atk += 30;
					}
				}
				if (bln == 23) {
					if (spn == 11) {
						atk += 45;
					}
				}
				if (bln == 25) {
					if (bon == 11) {
						atk += 45;
					}
				}
			}
			if (hn == 6) {
				atk += 15;
				if (bln == 16) {
					if (hn == 6) {
						atk += 15;
					}
				}
				if (grn == 16) {
					if (hn == 6) {
						atk += 30;
					}
				}
				if (bln == 22) {
					if (hn == 6) {
						atk += 45;
					}
				}
			}
			if (hn == 5) {
				atk += 10;
				if (bln == 16) {
					if (hn == 6) {
						atk += 15;
					}
				}
				if (grn == 16) {
					if (hn == 6) {
						atk += 30;
					}
				}
				if (bln == 22) {
					if (hn == 6) {
						atk += 45;
					}
				}
			}
			if (shn == 5) {
				atk += 7;
				if (bln == 17) {
					if (shn == 5) {
						atk += 7;
					}
				}
				if (grn == 17) {
					if (shn == 5) {
						atk += 14;
					}
				}
				if (bln == 23) {
					if (shn == 5) {
						atk += 21;
					}
				}
			}
			if (bon == 5) {
				atk += 7;
				if (bln == 19) {
					if (bon == 5) {
						atk += 7;
					}
				}
				if (grn == 19) {
					if (bon == 5) {
						atk += 14;
					}
				}
				if (bln == 25) {
					if (bon == 5) {
						atk += 21;
					}
				}
			}
			if (hn == 3) {
				atk += 7;
				if (bln == 16) {
					if (hn == 3) {
						atk += 7;
					}
				}
				if (grn == 16) {
					if (hn == 3) {
						atk += 14;
					}
				}
				if (bln == 22) {
					if (hn == 3) {
						atk += 21;
					}
				}
			}
			if (man == 3) {
				atk += 5;
				if (bln == 21) {
					if (man == 3) {
						atk += 5;
					}
				}
				if (grn == 21) {
					if (man == 3) {
						atk += 10;
					}
				}
				if (bln == 26) {
					if (man == 3) {
						atk += 15;
					}
				}
			}
			if (bon == 3) {
				atk += 5;

				if (bln == 19) {
					if (bon == 3) {
						atk += 5;
					}
				}
				if (grn == 19) {
					if (bon == 3) {
						atk += 10;
					}
				}
				if (bln == 25) {
					if (bon == 3) {
						atk += 15;
					}
				}
			}
			if (shn == 3) {
				atk += 5;

				if (bln == 17) {
					if (shn == 3) {
						atk += 5;
					}
				}
				if (grn == 17) {
					if (shn == 3) {
						atk += 10;
					}
				}
				if (bln == 23) {
					if (shn == 3) {
						atk += 15;
					}
				}
			}
			if (hn == 14 || spn == 14 || bon == 14 || man == 14) {
				if (hn == 14 && spn == 14 && bon == 14 && man == 14) {
					System.out.println("攻撃陣の一斉攻撃が決まった▼");
					String z46 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("連係が会わず一斉攻撃に失敗した▼");
					String z47 = new java.util.Scanner(System.in).nextLine();
				}
			}
			if (hn == 10 || man == 10) {
				if (hn == 10 && man == 10) {
					System.out.println("勇者と魔術師の連係攻撃が決まった▼");
					String z48 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("勇者と魔術師の息が会わず連係攻撃に失敗した▼");
					String z49 = new java.util.Scanner(System.in).nextLine();
				}
			}
			if (hn == 9 || bon == 9) {
				if (hn == 9 && bon == 9) {
					System.out.println("勇者と弓使いの連係攻撃が決まった▼");
					String z50 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("勇者と弓使いの息が会わず連係攻撃に失敗した▼");
					String z51 = new java.util.Scanner(System.in).nextLine();
				}
			}
			if (hn == 8 || spn == 8) {
				if (hn == 8 && spn == 8) {
					System.out.println("勇者と槍使いの連係攻撃が決まった▼");
					String z52 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("勇者と槍使いの息が会わず連係攻撃に失敗した▼");
					String z53 = new java.util.Scanner(System.in).nextLine();
				}
			}
			if (bon == 13 || man == 13) {
				if (bon == 13 && man == 13) {
					System.out.println("弓使いと魔術師の連係攻撃が決まった▼");
					String z54 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("弓使いと魔術師の息が会わず連係攻撃に失敗した▼");
					String z55 = new java.util.Scanner(System.in).nextLine();
				}
			}
			if (spn == 12 || man == 12) {
				if (spn == 12 && man == 12) {
					System.out.println("槍使いと魔術師の連係攻撃が決まった▼");
					String z56 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("槍使いと魔術師の息が会わず連係攻撃に失敗した▼");
					String z57 = new java.util.Scanner(System.in).nextLine();
				}
			}
			if (spn == 11 || bon == 11) {
				if (spn == 11 && bon == 11) {
					System.out.println("槍使いと弓使いの連係攻撃が決まった▼");
					String z58 = new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("槍使いと弓使いの息が会わず連係攻撃に失敗した▼");
					String z59 = new java.util.Scanner(System.in).nextLine();
				}
			}

			// 各キャラの清算

			switch (hn) {
			case 1 -> {
				h.stay();
				System.out.println("勇者は待機をした▼");
				String z60 = new java.util.Scanner(System.in).nextLine();
				if (damegeresult > 0) {
					h.hp -= damegeresult;
					System.out.println("勇者はダメージを負った▼");
					String z62 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				h.shortbreak();
				System.out.println("勇者は休憩しHPを回復させた▼");
				String z61 = new java.util.Scanner(System.in).nextLine();
			}
			case 3, 5, 6, 7, 8, 9, 10, 14 -> {
				System.out.println("勇者は攻撃した▼");
				String z63 = new java.util.Scanner(System.in).nextLine();
				switch (hn) {
				case 3 -> {
					h.attack();
				}
				case 6 -> {
					h.superattack();
				}
				case 5, 8, 9, 10 -> {
					h.magickattack();
				}
				case 7, 14 -> {
					h.supermagickattack();
				}
				}
				if (damegeresult > 0) {
					h.hp -= damegeresult;
					System.out.println("勇者はダメージを負った▼");
					String z65 = new java.util.Scanner(System.in).nextLine();
				}
			}
			}

			switch (spn) {
			case 1 -> {
				sp.stay();
				System.out.println("槍使いは待機をした▼");
				String z66 = new java.util.Scanner(System.in).nextLine();
				if (damegeresult > 0) {
					sp.hp -= damegeresult;
					System.out.println("槍使いはダメージを負った▼");
					String z67 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				sp.shortbreak();
				System.out.println("槍使いは休憩しHPを回復させた▼");
				String z68 = new java.util.Scanner(System.in).nextLine();
			}
			case 3, 5, 8, 11, 12, 14 -> {
				System.out.println("槍使いは攻撃した▼");
				String z69 = new java.util.Scanner(System.in).nextLine();
				switch (spn) {
				case 3 -> {
					sp.attack();
				}
				case 5, 8, 11, 12 -> {
					sp.magickattack();

				}
				case 14 -> {
					sp.specialattack();
				}
				}
				if (damegeresult > 0) {
					sp.hp -= damegeresult;
					System.out.println("槍使いはダメージを負った▼");
					String z70 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 4 -> {
				System.out.println("槍使いは防御をした▼");
				String z71 = new java.util.Scanner(System.in).nextLine();
				sp.gurad();
				if (damegeresult > 0) {
					sp.hp -= damegeresult;
					System.out.println("槍使いはダメージを負った▼");
					String z72 = new java.util.Scanner(System.in).nextLine();
				}
			}

			}

			switch (shn) {
			case 1 -> {
				sh.stay();
				System.out.println("盾使いは待機をした▼");
				String z73 = new java.util.Scanner(System.in).nextLine();
				if (damegeresult > 0) {
					sh.hp -= damegeresult;
					System.out.println("盾使いはダメージを負った▼");
					String z74 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				System.out.println("盾使いは休憩をしHPを回復させた▼");
				String z75 = new java.util.Scanner(System.in).nextLine();
				sh.shortbreak();
			}
			case 4, 5, 6, 15 -> {
				System.out.println("盾使いは盾で防御をした▼");
				String z776 = new java.util.Scanner(System.in).nextLine();
				switch (shn) {
				case 4 -> {
					sh.guard();
				}
				case 5 -> {
					sh.magickguard();
				}
				case 6 -> {
					sh.superguard();
				}
				case 15 -> {
					sh.supecialguard();
				}
				}
				if (damegeresult > 0) {
					sh.hp -= damegeresult;
					System.out.println("盾使いはダメージを負った▼");
					String z77 = new java.util.Scanner(System.in).nextLine();
				}

			}
			}

			switch (bon) {
			case 1 -> {
				bo.stay();
				System.out.println("弓使いは待機をした▼");
				String z78 = new java.util.Scanner(System.in).nextLine();
				if (damegeresult > 0) {
					bo.hp -= damegeresult;
					System.out.println("弓使いはダメージを負った▼");
					String z7779 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				bo.shortbreak();
				System.out.println("弓使いは休憩をしHPを回復させた▼");
				String z79 = new java.util.Scanner(System.in).nextLine();
			}
			case 3, 5, 9, 11, 13, 14 -> {
				System.out.println("弓使いは攻撃をした▼");
				String z80 = new java.util.Scanner(System.in).nextLine();
				switch (bon) {
				case 3 -> {
					bo.attack();
				}
				case 5, 9, 11, 13 -> {
					bo.magickattack();
				}
				case 14 -> {
					bo.specialattack();
				}
				}
				if (damegeresult > 0) {
					bo.hp -= damegeresult;
					System.out.println("弓使いはダメージを負った▼");
					String z81 = new java.util.Scanner(System.in).nextLine();
				}

			}
			}

			switch (mon) {
			case 1 -> {
				System.out.println("僧侶は待機をした▼");
				String z82 = new java.util.Scanner(System.in).nextLine();
				mo.stay();
				if (damegeresult > 0) {
					mo.hp -= damegeresult;
					System.out.println("僧侶はダメージを負った▼");
					String z83 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				System.out.println("僧侶は休憩をし体力を回復させた▼");
				String z84 = new java.util.Scanner(System.in).nextLine();
				mo.shortbreak();
			}
			case 16, 17, 18, 19, 21, 27, 28, 29, 30 -> {
				System.out.println("僧侶は" + bunr.a(mon) + "のHPを回復した▼");
				String z85 = new java.util.Scanner(System.in).nextLine();
				mo.heal();
			}
			}

			switch (man) {
			case 1 -> {
				System.out.println("魔術師は待機をした▼");
				String z86 = new java.util.Scanner(System.in).nextLine();
				ma.stay();
				if (damegeresult > 0) {
					ma.hp -= damegeresult;
					System.out.println("魔術師はダメージを負った▼");
					String z87 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				System.out.println("魔術師は休憩をしHPを回復させた▼");
				String z88 = new java.util.Scanner(System.in).nextLine();
				ma.shortbreak();
			}
			case 3, 10, 12, 13, 14 -> {
				System.out.println("魔術師は攻撃をした▼");
				String z89 = new java.util.Scanner(System.in).nextLine();
				ma.attack();
				if (damegeresult > 0) {
					ma.hp -= damegeresult;
					System.out.println("魔術師はダメージを負った▼");
					String z90 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 4, 15 -> {
				System.out.println("魔術師は魔法の盾を作って防御した▼");
				String z91 = new java.util.Scanner(System.in).nextLine();
				ma.guard();
				if (damegeresult > 0) {
					ma.hp -= damegeresult;
					System.out.println("魔術師はダメージを負った▼");
					String z92 = new java.util.Scanner(System.in).nextLine();
				}
			}
			}
			switch (grn) {
			case 1 -> {
				System.out.println("付与魔術師は待機をした▼");
				String z93 = new java.util.Scanner(System.in).nextLine();
				gr.stay();
				if (damegeresult > 0) {
					gr.hp -= damegeresult;
					System.out.println("付与魔術師はダメージを負った▼");
					String z109 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				System.out.println("付与魔術師は休憩をし体力を回復させた▼");
				String z94 = new java.util.Scanner(System.in).nextLine();
				gr.shortbreak();
			}
			case 16, 17, 18, 19, 20, 21 -> {
				System.out.println("付与魔術師は" + bunr.a(mon) + "に付与魔術を施した▼");
				String z95 = new java.util.Scanner(System.in).nextLine();
				gr.buff();
			}
			}
			switch (bln) {
			case 1 -> {
				System.out.println("鍛冶職人は待機をした▼");
				String z96 = new java.util.Scanner(System.in).nextLine();
				bl.stay();
				if (damegeresult > 0) {
					bl.hp -= damegeresult;
					System.out.println("鍛冶職人はダメージを負った▼");
					String z97 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				System.out.println("鍛冶職人は休憩をし体力を回復させた▼");
				String z98 = new java.util.Scanner(System.in).nextLine();
				bl.shortbreak();
			}
			case 16, 17, 18, 19, 21, 22, 23, 24, 25, 26 -> {
				System.out.println("鍛冶職人は" + bunr.a(bln) + "の為に武器を作って手渡した▼");
				String z99 = new java.util.Scanner(System.in).nextLine();
				switch (bln) {
				case 16, 17, 18, 19, 21 -> {
					bl.create();
				}
				case 22, 23, 24, 25, 26 -> {
					bl.bigcreate();
				}
				}
			}
			}
			switch (wn) {
			case 1 -> {
				System.out.println("賢者は待機をした▼");
				String z100 = new java.util.Scanner(System.in).nextLine();
				w.stay();
				if (damegeresult > 0) {
					w.hp -= damegeresult;
					System.out.println("賢者はダメージを負った▼");
					String z101 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				System.out.println("賢者は休憩をし体力を回復させた▼");
				String z102 = new java.util.Scanner(System.in).nextLine();
				w.shortbreak();
			}
			case 16, 17, 18, 19, 21, 27, 28, 29, 30 -> {
				System.out.println("賢者は" + bunr.a(wn) + "のMPを回復した▼");
				String z104 = new java.util.Scanner(System.in).nextLine();
				w.heal();
			}
			}
			switch (cn) {
			case 1 -> {
				System.out.println("調理師は待機をした▼");
				String z103 = new java.util.Scanner(System.in).nextLine();
				c.stay();
				if (damegeresult > 0) {
					c.hp -= damegeresult;
					System.out.println("調理師はダメージを負った▼");
					String z105 = new java.util.Scanner(System.in).nextLine();
				}
			}
			case 2 -> {
				System.out.println("調理師は休憩をし体力を回復させた▼");
				String z106 = new java.util.Scanner(System.in).nextLine();
				c.shortbreak();
			}
			case 16, 17, 18, 19, 21, 27, 28, 29, 30 -> {
				System.out.println("調理師は" + bunr.a(cn) + "のfPを回復した▼");
				String z107 = new java.util.Scanner(System.in).nextLine();
				c.cooking();
			}
			}
			switch (mon) {
			case 16 -> {
				h.hp += 5;
			}
			case 17 -> {
				sp.hp += 5;
			}
			case 18 -> {
				sh.hp += 5;
			}
			case 19 -> {
				bo.hp += 5;
			}
			case 21 -> {
				ma.hp += 5;
			}
			case 27 -> {
				gr.hp += 5;
			}
			case 28 -> {
				bl.hp += 5;
			}
			case 29 -> {
				w.hp += 5;
			}
			case 30 -> {
				c.hp += 5;
			}
			}
			switch (wn) {
			case 16 -> {
				h.mp += 5;
			}
			case 17 -> {
				sp.mp += 5;
			}
			case 18 -> {
				sh.mp += 5;
			}
			case 19 -> {
				bo.mp += 5;
			}
			case 21 -> {
				ma.mp += 5;
			}
			case 27 -> {
				gr.mp += 5;
			}
			case 28 -> {
				bl.mp += 5;
			}
			case 20 -> {
				mo.mp += 5;
			}
			case 30 -> {
				c.mp += 5;
			}
			}
			switch (cn) {
			case 16 -> {
				h.fp += 5;
			}
			case 17 -> {
				sp.fp += 5;
			}
			case 18 -> {
				sh.fp += 5;
			}
			case 19 -> {
				bo.fp += 5;
			}
			case 21 -> {
				ma.fp += 5;
			}
			case 27 -> {
				gr.fp += 5;
			}
			case 28 -> {
				bl.fp += 5;
			}
			case 29 -> {
				w.fp += 5;
			}
			case 20 -> {
				mo.fp += 5;
			}
			}

			// ダメージ処理

			h.hp -= ddamege;
			sp.hp -= ddamege;
			sh.hp -= ddamege;
			bo.hp -= ddamege;
			mo.hp -= ddamege;
			ma.hp -= ddamege;
			gr.hp -= ddamege;
			bl.hp -= ddamege;
			w.hp -= ddamege;
			c.hp -= ddamege;

			d.hp -= atk;

			for (int i = 0; i < 1000; i++) {
				goste[i] -= atk;
			}

			// fp処理

			if (h.fp <= 0) {
				h.hp = h.hp / 2;
				System.out.println("勇者はfpがなくなりhpが半減した▼");
				String z123 = new java.util.Scanner(System.in).nextLine();
			}
			if (sp.fp <= 0) {
				sp.hp = sp.hp / 2;
				System.out.println("槍使いはfpがなくなりhpが半減した▼");
				String z124 = new java.util.Scanner(System.in).nextLine();
			}
			if (sh.fp <= 0) {
				sh.hp = sh.hp / 2;
				System.out.println("盾使いはfpがなくなりhpが半減した▼");
				String z125 = new java.util.Scanner(System.in).nextLine();
			}
			if (bo.fp <= 0) {
				bo.hp = bo.hp / 2;
				System.out.println("弓使いはfpがなくなりhpが半減した▼");
				String z127 = new java.util.Scanner(System.in).nextLine();
			}
			if (mo.fp <= 0) {
				mo.hp = mo.hp / 2;
				System.out.println("僧侶はfpがなくなりhpが半減した▼");
				String z128 = new java.util.Scanner(System.in).nextLine();
			}
			if (ma.fp <= 0) {
				ma.hp = ma.hp / 2;
				System.out.println("魔術師はfpがなくなりhpが半減した▼");
				String z129 = new java.util.Scanner(System.in).nextLine();
			}
			if (gr.fp <= 0) {
				gr.hp = gr.hp / 2;
				System.out.println("付与魔術師はfpがなくなりhpが半減した▼");
				String z130 = new java.util.Scanner(System.in).nextLine();
			}
			if (bl.fp <= 0) {
				bl.hp = bl.hp / 2;
				System.out.println("鍛冶職人はfpがなくなりhpが半減した▼");
				String z132 = new java.util.Scanner(System.in).nextLine();
			}
			if (w.fp <= 0) {
				w.hp = w.hp / 2;
				System.out.println("賢者はfpがなくなりhpが半減した▼");
				String z133 = new java.util.Scanner(System.in).nextLine();
			}
			if (c.fp <= 0) {
				c.hp = c.hp / 2;
				System.out.println("調理師はfpがなくなりhpが半減した▼");
				String z131 = new java.util.Scanner(System.in).nextLine();
			}

			// hp処理
			if (h.hp <= 0) {
				System.out.println("勇者が死亡した▼");
				String z141 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z142 = new java.util.Scanner(System.in).nextLine();
			}
			if (sp.hp <= 0) {
				System.out.println("勇者が死亡した▼");
				String z143 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z144 = new java.util.Scanner(System.in).nextLine();
			}
			if (sh.hp <= 0) {
				System.out.println("槍使いが死亡した▼");
				String z145 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z156 = new java.util.Scanner(System.in).nextLine();
			}
			if (bo.hp <= 0) {
				System.out.println("盾使いが死亡した▼");
				String z147 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z148 = new java.util.Scanner(System.in).nextLine();
			}
			if (mo.hp <= 0) {
				System.out.println("弓使いが死亡した▼");
				String z149 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z150 = new java.util.Scanner(System.in).nextLine();
			}
			if (ma.hp <= 0) {
				System.out.println("僧侶が死亡した▼");
				String z151 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z152 = new java.util.Scanner(System.in).nextLine();
			}
			if (gr.hp <= 0) {
				System.out.println("付与魔術師が死亡した▼");
				String z153 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z154 = new java.util.Scanner(System.in).nextLine();
			}
			if (bl.hp <= 0) {
				System.out.println("鍛冶職人が死亡した▼");
				String z155 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z156 = new java.util.Scanner(System.in).nextLine();
			}
			if (w.hp <= 0) {
				System.out.println("賢者が死亡した▼");
				String z158 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z160 = new java.util.Scanner(System.in).nextLine();
			}
			if (c.hp <= 0) {
				System.out.println("調理師が死亡した▼");
				String z161 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームオーバー▼");
				String z162 = new java.util.Scanner(System.in).nextLine();
			}
			if (d.hp <= 0) {
				System.out.println("ドラゴンは力尽きた▼");
				String z142 = new java.util.Scanner(System.in).nextLine();
				System.out.println("ゲームクリア▼");
				String z1456 = new java.util.Scanner(System.in).nextLine();
				System.out.println("必要ターン数は" + count + "▼");
				String z123 = new java.util.Scanner(System.in).nextLine();
			}
			count++;
		}

	}
}
