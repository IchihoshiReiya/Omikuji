package SampleOmikuji;

import java.util.Scanner;

public class SampleOmikuji {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String inputChar;
		int ftn;
		String rst;
		String msgTemple = "今日の運勢は %sです。";
		String msg;
		
		System.out.println("おみくじを引きますか");
		System.out.println("引く場合は\"y\"を入力してください。");
		
		try(Scanner scanner = new Scanner(System.in)){
			inputChar = scanner.nextLine();

			if(!inputChar.equals("y")) {
				return;
			}

			ftn = (int) Math.round(Math.random() * 10);
			rst = SetFortune(ftn);
			
			msg = String.format(msgTemple, rst);

			System.out.println(msg);
		}

	}
	
	private static String SetFortune(int ftn) {
		String rst;
		
		switch(ftn) {
		case 0:
			rst = "大吉";
			break;
		case 1:
			rst = "吉";
			break;
		case 2:
			rst = "中吉";
			break;
		case 7:
			rst = "末吉";
			break;
		case 8:
			rst = "凶";
			break;
		case 9:
			rst = "大凶";
			break;
		default:
			rst = "小吉";
		}
		
		return rst;
	}

}
