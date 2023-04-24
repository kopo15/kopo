package Amusementpark_final;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale currentLocale = Locale.getDefault();
		System.out.println("locale :"+currentLocale.getCountry());
		
		
		
		Main_final main = new Main_final();
		Input_final input =new Input_final();
		Calc_final calc = new Calc_final();
		Final_final f = new Final_final();
		ConstValueClass_final.startLanguage(currentLocale.getCountry());
		
		
		
		
		int repeat;

		do {
			input.inputData();
			calc.calc();
			f.saveData();
			System.out.println(ConstValueClass_final.REPEAT);
			Scanner main_sc = new Scanner(System.in);
			repeat = main_sc.nextInt();
		
		}while(repeat==0);
		f.output();

	}

}
