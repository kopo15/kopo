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

	int calcIDNumber =0;  // 생년월일 계산 위한 초기화
	int customerYear = 0, customerMonth = 0, customerDay = 0; // 구매자 생년월일 
	int todayYear = 0, todayMonth = 0, todayDay = 0; //오늘 날짜 
	int type= 0; // 구매자 성별 및 2000년생 구분
	int koreanAge = 0;
	int result; //계산된 결과값
	
	
	// 입력받은값 나이 구하기 
	int calcAge(long customerIDNumber) {

		customerIDNumber += ConstValueClass_final.FULL_DIGIT; //앞자리 보존을 위해 해당값 더해줌
		calcIDNumber =(int)customerIDNumber; 		
		type = calcIDNumber % ConstValueClass_final.ONE_DIGIT; // 성별
		calcIDNumber /= ConstValueClass_final.ONE_DIGIT; // 성별 확인했으니 버리기

		customerDay = calcIDNumber % ConstValueClass_final.TWO_DIGIT; //일 
		calcIDNumber /= ConstValueClass_final.TWO_DIGIT;

		customerMonth = calcIDNumber % ConstValueClass_final.TWO_DIGIT; // 월 
		calcIDNumber /= ConstValueClass_final.TWO_DIGIT;

		customerYear = calcIDNumber % ConstValueClass_final.TWO_DIGIT; //생년 

		if ((type == ConstValueClass_final.MALE_NEW) ||(type == ConstValueClass_final.FEMALE_NEW)) {// 2000년 이후 태생인경우  
			customerYear += ConstValueClass_final.NEW_GENERATION;

		}else{
			customerYear += ConstValueClass_final.OLD_GENERATION;
		}

		//오늘 날짜 구하기
		LocalDate currentDate = LocalDate.now();
		todayYear = currentDate.getYear() + ConstValueClass_final.OLD_GENERATION; //현재 년도
		todayMonth = currentDate.getMonthValue(); //현재 월
		todayDay = currentDate.getDayOfMonth(); // 현재 일

		koreanAge = todayYear - customerYear + 1; // 한국식 나이


		//만나이 계산

		if((customerMonth < todayMonth)||((customerMonth==todayMonth) && (customerDay <= todayDay))) { 
			age = koreanAge - ConstValueClass_final.AFTER_BIRTH;
			result =age-1900;
		}else {
			age = koreanAge - ConstValueClass_final.BEFORE_BIRTH;
			result =age-1900;
		}
		
		return result;  //만나이 도출
		
	}

	int calcAgeGroup(int age) {  // 나이별로 그룹화 

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
		return result;  // 그룹 도출
	}


	// 나이와 권종에 따른 가격 결정
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
		return result; // 가격 도출
	}

	// 우대사항에 따른 할인 계산	
	static int calcDiscount (int result, int discountSelect) {

		switch(discountSelect) {
		case 2: // 장애인
			discount = ConstValueClass_final.FINAL_PRINT_DC_DISABLE;
			result *= ConstValueClass_final.DISABLE_DISCOUNT_RATE;
			break;
		case 3: // 국가유공자
			discount = ConstValueClass_final.FINAL_PRINT_DC_MERIT;
			result *=ConstValueClass_final.MERIT_DISCOUNT_RATE;
			break;
		case 4: // 다자녀
			discount = ConstValueClass_final.FINAL_PRINT_DC_MUL;
			result *=ConstValueClass_final.MULTICHILD_DISCOUNT_RATE;
			break;
		case 5: //임산부
			discount =ConstValueClass_final.FINAL_PRINT_DC_PREGNANT;
			result *=ConstValueClass_final.PREGNANT_DISCOUNT_RATE;
			break;
		default :
			discount = ConstValueClass_final.FINAL_PRINT_DC_AGE;
			break;	
		}
		return result; // 우대사항 적용

	}

	// 수량 적용	
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

