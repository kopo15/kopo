package Amusementpark_final;

import java.time.LocalDate;

public class Calc_final {

	 public static int totalPrice;
	 public static int age;
	 public static int ageGroup;
	 public static String discount;
	 

		public static String getDiscount() {
		return discount;
	}

		public int getTotalPrice() {
			return totalPrice;
		}

		public int getAgeGroup() {
			return ageGroup;
		}

		public int getAge() {
			return age;
		}

	 Input_final input = new Input_final();

	int calcIDNumber =0;  // ������� ��� ���� �ʱ�ȭ
	int customerYear = 0, customerMonth = 0, customerDay = 0; // ������ ������� 
	int todayYear = 0, todayMonth = 0, todayDay = 0; //���� ��¥ 
	int type= 0; // ������ ���� �� 2000��� ����
	int koreanAge = 0;
	int result; //���� �����
	
	
	// �Է¹����� ���� ���ϱ� 
	int calcAge(long customerIDNumber) {

		customerIDNumber += ConstValueClass_final.FULL_DIGIT; //���ڸ� ������ ���� �ش簪 ������
		calcIDNumber =(int)customerIDNumber; 		
		type = calcIDNumber % ConstValueClass_final.ONE_DIGIT; // ����
		calcIDNumber /= ConstValueClass_final.ONE_DIGIT; // ���� Ȯ�������� ������

		customerDay = calcIDNumber % ConstValueClass_final.TWO_DIGIT; //�� 
		calcIDNumber /= ConstValueClass_final.TWO_DIGIT;

		customerMonth = calcIDNumber % ConstValueClass_final.TWO_DIGIT; // �� 
		calcIDNumber /= ConstValueClass_final.TWO_DIGIT;

		customerYear = calcIDNumber % ConstValueClass_final.TWO_DIGIT; //���� 

		if ((type == ConstValueClass_final.MALE_NEW) ||(type == ConstValueClass_final.FEMALE_NEW)) {// 2000�� ���� �»��ΰ��  
			customerYear += ConstValueClass_final.NEW_GENERATION;

		}else{
			customerYear += ConstValueClass_final.OLD_GENERATION;
		}

		//���� ��¥ ���ϱ�
		LocalDate currentDate = LocalDate.now();
		todayYear = currentDate.getYear() + ConstValueClass_final.OLD_GENERATION; //���� �⵵
		todayMonth = currentDate.getMonthValue(); //���� ��
		todayDay = currentDate.getDayOfMonth(); // ���� ��

		koreanAge = todayYear - customerYear + 1; // �ѱ��� ����


		//������ ���

		if((customerMonth < todayMonth)||((customerMonth==todayMonth) && (customerDay <= todayDay))) { 
			age = koreanAge - ConstValueClass_final.AFTER_BIRTH;
			result =age-1900;
		}else {
			age = koreanAge - ConstValueClass_final.BEFORE_BIRTH;
			result =age-1900;
		}
		
		return result;  //������ ����
		
	}

	int calcAgeGroup(int age) {  // ���̺��� �׷�ȭ 

		int result =0; 

		if(age <ConstValueClass_final.MIN_CHILD) {
			return 1;

		}else if(age >=ConstValueClass_final.MIN_CHILD && age <=ConstValueClass_final.MAX_CHILD) {
			return 2;

		}else if(age >=ConstValueClass_final.MIN_TEEN && age <=ConstValueClass_final.MAX_TEEN) {
			return 3;

		}else if(age >=ConstValueClass_final.MIN_ADULT && age <=ConstValueClass_final.MAX_ADULT) {
			return 4;

		}else if(age >ConstValueClass_final.MAX_ADULT) {
			return 5;

		}
		return result;  // �׷� ����
	}


	// ���̿� ������ ���� ���� ����
	int calcPriceProcess(int agegroup,int ticketSelect) {

		int result =0;

		if(agegroup == ConstValueClass_final.BABY) {
			result = ConstValueClass_final.BABY_PRICE;

		}else if(agegroup == ConstValueClass_final.CHILD) {
			if(ticketSelect == 1) {
				result = ConstValueClass_final.CHILD_WEEKDAY_PRICE;		
			}else if(ticketSelect == 2) {
				result = ConstValueClass_final.CHILD_WEEKEND_PRICE;	
			}

		}else if(agegroup == ConstValueClass_final.TEEN) {
			if(ticketSelect == 1) {
				result = ConstValueClass_final.TEEN_WEEKDAY_PRICE;		
			}else if(ticketSelect == 2) {
				result = ConstValueClass_final.TEEN_WEEKEND_PRICE;	
			}

		}else if(agegroup == ConstValueClass_final.ADULT) {
			if(ticketSelect == 1) {
				result = ConstValueClass_final.ADULT_WEEKDAY_PRICE;		
			}else if(ticketSelect == 2) {
				result =ConstValueClass_final.ADULT_WEEKEND_PRICE;	
			}

		}else {
			result =ConstValueClass_final.OLD_WEEKDAY_PRICE;
		}	
		return result; // ���� ����
	}

	// �����׿� ���� ���� ���	
	static int calcDiscount (int result, int discountSelect) {

		switch(discountSelect) {
		case 2: // �����
			discount = ConstValueClass_final.FINAL_PRINT_DC_DISABLE;
			result *= ConstValueClass_final.DISABLE_DISCOUNT_RATE;
			break;
		case 3: // ����������
			discount = ConstValueClass_final.FINAL_PRINT_DC_MERIT;
			result *=ConstValueClass_final.MERIT_DISCOUNT_RATE;
			break;
		case 4: // ���ڳ�
			discount = ConstValueClass_final.FINAL_PRINT_DC_MUL;
			result *=ConstValueClass_final.MULTICHILD_DISCOUNT_RATE;
			break;
		case 5: //�ӻ��
			discount =ConstValueClass_final.FINAL_PRINT_DC_PREGNANT;
			result *=ConstValueClass_final.PREGNANT_DISCOUNT_RATE;
			break;
		default :
			discount = ConstValueClass_final.FINAL_PRINT_DC_AGE;
			break;	
		}
		return result; // ������ ����

	}

	// ���� ����	
	static int calPriceResult(int result, int orderCount) {
		return result * orderCount;
	}

	void calc() {

		
		age = calcAge(input.getCustomerIDNumber());		
		ageGroup = calcAgeGroup(age);
		totalPrice = calcPriceProcess(ageGroup, input.getTicketselect());
		totalPrice = calPriceResult(totalPrice, input.getOrdercount());
		totalPrice = (int)calcDiscount(totalPrice, input.getDiscountselect());

	
	}

}

