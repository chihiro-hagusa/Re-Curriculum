package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		
	//Q1 各型䛾変数を宣言し、初期値を設定してください。
		byte byteNum;
		
		short shortNum;
		
		int intNum;
		
		long longNum;
		
		float floatNum;
		
		double doubleNum;
		
		char letter;
		
		String letters;
		
		boolean isBoolean;
		
	//Q2 1で宣言した各型の変数に指定された値を代入してください
		byteNum = 10;
		
		shortNum = 100;
		
		intNum = 1000;
		
		longNum = 10000;
		
		floatNum = 9.5f;
		
		doubleNum = 10.5;
		
		letter = 'a';
		
		letters = "ハロー";
		
		isBoolean = true;
		
	//Q3 値を代入した変数を用いて出力をしてください
		System.out.println(byteNum + shortNum + intNum + longNum);
		
		System.out.println((int) (floatNum + doubleNum));
		
		System.out.println(letter + letters + isBoolean);
		
		System.out.println((int) (byteNum + shortNum + intNum + longNum + floatNum + doubleNum));
		
		System.out.println(byteNum * shortNum * intNum * longNum);
		
		System.out.println(doubleNum / shortNum);
		
		System.out.println(byteNum - shortNum);
		
	//Q4 nameというString型の変数を宣言しその変数に”山田太郎”という値を代入してください。
	//   name変数を使用してコンソールに こんにちは、山田太郎さん！ と表示してください。	
		String name;
		
		name = "山田太郎";
		
		System.out.println("こんにちは、" + name + "さん！");
		
	//Q5 ageというint型の変数を宣言し、その変数に25を代入してください。
	//   age変数を使用してコンソールに 年齢：25歳 と表示してください。
		int age;
		
		age = 25;
		
		System.out.println("年齢：" + age + "歳");
		
	//Q6 num1というint型の変数を宣言し、10を代入
	//   num2というint型の変数を宣言し、5を代入
	//   num1とnum2を足した結果をsumという変数に代入し、コンソールに表示してください。
		int num1;
		num1 = 10;
		
		int num2;
		num2 = 5;
		
		int sum = num1 + num2;
		
		System.out.println(sum);
		
	//Q7 scoreというint型の変数を宣言し、80を代入
	//   scroreに20を加えて、更新する。
	//   最終スコア：100 をscoreを使用してコンソールに表示してください。
		int score;
		score = 80;
		
		score = score + 20;
		
		System.out.println("最終スコア：" + score);
		
	//Q8 priceというdouble型の変数を宣言し、99.99を代入
	//   priceをint型に変換し、整数価格：99 と更新。
		double price;
		price = 99.99;
		
		System.out.println((int) price);
		
	//Q9 String型の変数numStrに"123"を代入
	//   numStrをint型に変換し、
	//   変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示してください。	
		String numStr;
		numStr = "123";
		
		int num3 = Integer.parseInt(numStr);
		
		System.out.println("変換後の値：" + (num3 + 10));
		
	//Q10 int型の変数numに50を代入
	//    numをString型に変換し、"得点: 50点" の形で表示
		int num;
		num = 50;
		
		String score1 = String.valueOf(num);
		
		System.out.println("得点：" + score1 + "点");
		
	//Q11 次の条件を満たすプログラムを条件演算子を使用して作成してください。
	//    int型の変数aに10を代入
	//    int型の変数bに20を代入
	//    aがbより小さいかどうかをboolean変数resultに代入	
	//    resultの値を表示	
		int a;
		a = 10;
		
		int b;
		b = 20;
		
		boolean result;
		result = a < b;
		
		System.out.println(result);
		
	//Q12 条件演算子（三項演算子）を使用してください。
	//    int型の変数xに15を代入  	
	//    xが10以上なら”OK”、そうでなければ”NG”を表示	 	
		int x;
		x = 15;
		
		String result1;
		result1 = (x >= 10) ? "OK" : "NG";
		
		System.out.println(result1);
		
	//Q13 String text = "私はJavaが好きです。Javaは楽しい！";という
	//    文章の中にある「Java」を「Python」に置き換えて表示させてください。	
		String text = "私はJavaが好きです。Javaは楽しい！";
		
		System.out.println(text.replace("Java", "Python"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
