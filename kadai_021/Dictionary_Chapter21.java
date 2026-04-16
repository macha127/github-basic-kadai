package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public Dictionary_Chapter21() {
		dictionary.put("apple", "リンゴ");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	public void lookUp(String[] tango) {
		for(int i = 0 ; i<tango.length ; i++) {
			boolean torf = false; 
			for(String key : dictionary.keySet()) {
				if(tango[i].equals(key)) {
					System.out.println(tango[i] + "の意味は" + dictionary.get(key));
					torf = true;
				}
			}
			if(!torf) {
				System.out.println(tango[i] + "は辞書に存在しません");
			}
			
		}
	}
}
