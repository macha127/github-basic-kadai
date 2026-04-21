package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		String choice = "";
		do {
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextLine();
			if(!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
				System.out.println("rかsかpを入力しましょう");
			}
		}while(!choice.equals("r") && !choice.equals("s") && !choice.equals("p"));
		return choice;
	}
	
	public String getRandom() {
		String[] enemy = {"r", "s", "p"};
		int rand = (int)(Math.random()*3);
		return enemy[rand];
	}
	
	public void playGame() {
		String zibun = getMyChoice();
		String aite = getRandom();
		HashMap<String, String> janken = new HashMap<>();
		janken.put("r", "グー");
		janken.put("s", "チョキ");
		janken.put("p", "パー");
		
		System.out.println("自分の手は" + janken.get(zibun) + ",対戦相手の手は" + janken.get(aite));
		if(zibun.equals(aite)) {
			System.out.println("あいこです");
		}else if(zibun.equals("r") && aite.equals("s") || zibun.equals("s") && aite.equals("p") || zibun.equals("p") && aite.equals("r")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}

}
