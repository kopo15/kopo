package Amusementpark_final;


import java.util.Currency;
import java.util.Locale;

public class ConstValueClass_final {

	//티켓 가격 주중,주말권 
	public static final int BABY_PRICE = 0,
			ADULT_WEEKDAY_PRICE = 56000, ADULT_WEEKEND_PRICE = 46000, 
			TEEN_WEEKDAY_PRICE = 47000, TEEN_WEEKEND_PRICE = 40000, 
			CHILD_WEEKDAY_PRICE = 44000, CHILD_WEEKEND_PRICE = 37000, 
			OLD_WEEKDAY_PRICE = 44000, OLD_WEEKEND_PRICE = 37000;

	//주민등록번호 분석
	public static final long FULL_DIGIT = 10000000L,
			FULL_DIGIT_MIN= 100000L, SEVEN_DIGIT = 10000000L;

	public static final int TWO_DIGIT = 100, ONE_DIGIT = 10,
			OLD_GENERATION = 1900, NEW_GENERATION = 2000,
			MALE_OLD = 1, FEMALE_OLD = 2, MALE_NEW = 3, FEMALE_NEW = 4, BEFORE_BIRTH = 2, AFTER_BIRTH = 1; 

	//연령대
	public static final int MIN_BABY = 1, MIN_CHILD = 3, MIN_TEEN = 13, MIN_ADULT = 19,
			MAX_CHILD = 12, MAX_TEEN = 18, MAX_ADULT = 64;


	//나이에 따른 그룹
	public static final int BABY = 1, CHILD = 2, TEEN = 3, ADULT = 4, OLD = 5;

	//할인율
	public static final float DISABLE_DISCOUNT_RATE= 0.6f, MERIT_DISCOUNT_RATE= 0.5f,
			MULTICHILD_DISCOUNT_RATE= 0.8f, PREGNANT_DISCOUNT_RATE= 0.85f;

	//수량
	public static final int MAX_COUNT = 10, MIN_COUNT = 1;

	
	
	//public static int LANGUAGE ; //0 = kor ,1 = eng
	
	public static String TICKET_TYPE_QUESTION;
	public static String TICKET_TYPE1;
	public static String TICKET_TYPE2;
	public static String GUEST_IDNUMBER_QUESTION;
	public static String ORDER_COUNT_QUESTION;
	public static String DISCOUNT_TYPE_QUESTION;
	public static String DISCOUNT_TYPE1;
	public static String DISCOUNT_TYPE2;
	public static String DISCOUNT_TYPE3;
	public static String DISCOUNT_TYPE4;
	public static String DISCOUNT_TYPE5;
	public static String REPEAT;
	public static String ERROR;
	public static String FINAL_PRINT_HEAD1;
	public static String FINAL_PRINT_HEAD2;
	public static String FINAL_PRINT_TICKET1;
	public static String FINAL_PRINT_TICKET2;
	public static String FINAL_PRINT_AGEGROUP_BABY;
	public static String FINAL_PRINT_AGEGROUP_CHILD;
	public static String FINAL_PRINT_AGEGROUP_TEEN;
	public static String FINAL_PRINT_AGEGROUP_ADULT;
	public static String FINAL_PRINT_AGEGROUP_OLD;
	public static String FINAL_PRINT_TOTALPRICE;
	public static String FINAL_PRINT_DC_AGE;
	public static String FINAL_PRINT_DC_DISABLE;
	public static String FINAL_PRINT_DC_MERIT;
	public static String FINAL_PRINT_DC_MUL;
	public static String FINAL_PRINT_DC_PREGNANT;
	
	

	public static void startLanguage(String language) {
		if(language.equals("KR")) {
			ConstValueClass_final.TICKET_TYPE_QUESTION ="권종을 선택하세요 :";
			ConstValueClass_final.TICKET_TYPE1 = "1.평일";
			ConstValueClass_final.TICKET_TYPE2 = "2.주말";
			ConstValueClass_final.GUEST_IDNUMBER_QUESTION = "주민등록번호 7자리를 입력하세요 ex)yymmddx";
			ConstValueClass_final.ORDER_COUNT_QUESTION = "몇개를 주문하시겠습니까?(최대10개)";
			ConstValueClass_final.DISCOUNT_TYPE_QUESTION= "우대사항을 선택하세요(중복불가)";
			ConstValueClass_final.DISCOUNT_TYPE1= "1.없음 (나이 우대는 자동처리)";
			ConstValueClass_final.DISCOUNT_TYPE2= "2.장애인 우대";
			ConstValueClass_final.DISCOUNT_TYPE3= "3.국가유공자 우대 ";
			ConstValueClass_final.DISCOUNT_TYPE4= "4.다자녀 우대";
			ConstValueClass_final.DISCOUNT_TYPE5= "5.임산부 우대";
			ConstValueClass_final.ERROR= "잘못 입력하셨습니다.";
			ConstValueClass_final.REPEAT= "계속 주문 하시겠습니까? (0:YES, 1:NO) :";
			ConstValueClass_final.FINAL_PRINT_HEAD1= "티켓발권을 종료합니다.감사합니다";
			ConstValueClass_final.FINAL_PRINT_HEAD2= "======================에버랜드=======================";
			ConstValueClass_final.FINAL_PRINT_TICKET1= "평일권 ";
			ConstValueClass_final.FINAL_PRINT_TICKET2= "주말권 ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_BABY= "유 아  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_CHILD= "어린이  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_TEEN= "청소년  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_ADULT= "어 른  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_OLD= "노 인  ";
			ConstValueClass_final.FINAL_PRINT_TOTALPRICE ="입장료 총액 : ";
			ConstValueClass_final.FINAL_PRINT_DC_AGE ="*우대사항 적용 없음";
			ConstValueClass_final.FINAL_PRINT_DC_DISABLE ="*장애인 우대적용";
			ConstValueClass_final.FINAL_PRINT_DC_MERIT ="*국가유공자 우대적용";
			ConstValueClass_final.FINAL_PRINT_DC_MUL ="*다자녀 우대적용";
			ConstValueClass_final.FINAL_PRINT_DC_PREGNANT ="*임산부 우대적용";
			
						
		}else if(language.equals("US")) {
			ConstValueClass_final.TICKET_TYPE_QUESTION = "Input number of ticket type : ";
			ConstValueClass_final.TICKET_TYPE1= "1.Weekday";
			ConstValueClass_final.TICKET_TYPE2= "2.Weekend";
			ConstValueClass_final.GUEST_IDNUMBER_QUESTION= "Please enter 7-digit social security number :ex)yymmddx";
			ConstValueClass_final.ORDER_COUNT_QUESTION = "How many tickets would you like to order? (up to 10)";
			ConstValueClass_final.DISCOUNT_TYPE_QUESTION= "Please input number of Discount Type";
			ConstValueClass_final.DISCOUNT_TYPE1= "1.None(Age discounts are automatically applied)";
			ConstValueClass_final.DISCOUNT_TYPE2= "2.Disability Discount";
			ConstValueClass_final.DISCOUNT_TYPE3= "3.National Merit Discount";
			ConstValueClass_final.DISCOUNT_TYPE4= "4.Multi-child Family Discount";
			ConstValueClass_final.DISCOUNT_TYPE5= "1.Pregnancy Discount";
			ConstValueClass_final.ERROR= "Error! Please try again!";
			ConstValueClass_final.REPEAT= "Would you like to continue to order?(0:YES, 1:NO) :";
			ConstValueClass_final.FINAL_PRINT_HEAD1= "Hope you have a wonderful day! ";
			ConstValueClass_final.FINAL_PRINT_HEAD2= "======================EVERLAND=======================";
			ConstValueClass_final.FINAL_PRINT_TICKET1= "Weekday ";
			ConstValueClass_final.FINAL_PRINT_TICKET2= "Weekend ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_BABY= "BABY  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_CHILD= "CHILD  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_TEEN= "TEEN  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_ADULT= "ADULT  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_OLD= "SENIOR  ";
			ConstValueClass_final.FINAL_PRINT_TOTALPRICE ="TOTAL PRICE : ";
			ConstValueClass_final.FINAL_PRINT_DC_AGE ="*No discount ";
			ConstValueClass_final.FINAL_PRINT_DC_DISABLE ="*Disability discount ";
			ConstValueClass_final.FINAL_PRINT_DC_MERIT ="*National Merit discount";
			ConstValueClass_final.FINAL_PRINT_DC_MUL ="*Multi_child discount app";
			ConstValueClass_final.FINAL_PRINT_DC_PREGNANT ="* Pregnancy discount";
		
		
		
		}else if(language.equals("JP")) {
			ConstValueClass_final.TICKET_TYPE_QUESTION = "チケットの種類を選択してください：";
			ConstValueClass_final.TICKET_TYPE1 = "1. 平日";
			ConstValueClass_final.TICKET_TYPE2 = "2. 週末";
			ConstValueClass_final.GUEST_IDNUMBER_QUESTION = "住民登録番号を7桁で入力してください。 ex)yymmddx";
			ConstValueClass_final.ORDER_COUNT_QUESTION = "何枚注文しますか？(最大10枚)";
			ConstValueClass_final.DISCOUNT_TYPE_QUESTION = "割引タイプを選択してください（重複不可）";
			ConstValueClass_final.DISCOUNT_TYPE1 = "1. なし(年齢優待は自動処理)";
			ConstValueClass_final.DISCOUNT_TYPE2 = "2. 障害者";
			ConstValueClass_final.DISCOUNT_TYPE3 = "3. 国家功労者";
			ConstValueClass_final.DISCOUNT_TYPE4 = "4. 多子家庭";
			ConstValueClass_final.DISCOUNT_TYPE5 = "5. 妊婦";
			ConstValueClass_final.ERROR = "間違った入力です。";
			ConstValueClass_final.REPEAT= "注文を続けますか？ (0:はい、1:いいえ) :";
			ConstValueClass_final.FINAL_PRINT_HEAD1= "素敵な一日をお過ごしください！";
			ConstValueClass_final.FINAL_PRINT_HEAD2= "======================エバーランド=======================";
			ConstValueClass_final.FINAL_PRINT_TICKET1= "平日チケット ";
			ConstValueClass_final.FINAL_PRINT_TICKET2= "週末チケット ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_BABY= "幼 児  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_CHILD= "子 供  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_TEEN= "青 少 年  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_ADULT= "大 人  ";
			ConstValueClass_final.FINAL_PRINT_AGEGROUP_OLD= "年 長 者  ";
			ConstValueClass_final.FINAL_PRINT_TOTALPRICE ="入場料の合計： ";
			ConstValueClass_final.FINAL_PRINT_DC_AGE ="*優待なし";
			ConstValueClass_final.FINAL_PRINT_DC_DISABLE ="*障害者優遇適用";
			ConstValueClass_final.FINAL_PRINT_DC_MERIT ="*国家功労者優遇適用";
			ConstValueClass_final.FINAL_PRINT_DC_MUL ="*多子優遇適用";
			ConstValueClass_final.FINAL_PRINT_DC_PREGNANT ="*妊婦優遇適用";
		}
	}
}