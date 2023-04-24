package Amusementpark_final;

import java.util.Scanner;

public class Input_final {

	Scanner sc = new Scanner (System.in);

	public static int ticketselect;
	public static long customerIDNumber;
	public static int ordercount;
	public static int discountselect;
	
	// ���������� ������ְ� ->getter���� �ٸ� Ŭ���������� ��� �������� (������ �޼��� ������ �ʱ�ȭ �Ұ�)
	public static long getCustomerIDNumber() {
		return customerIDNumber;
	}

	public static int getOrdercount() {
		return ordercount;
	}

	public static int getDiscountselect() {
		return discountselect;
	}
	
	public static int getTicketselect() {
		return ticketselect;
	}


	// Ƽ�� ���� ����
	void  inputTicketSelect() {
		
		do {

			System.out.println(ConstValueClass_final.TICKET_TYPE_QUESTION);
			System.out.println(ConstValueClass_final.TICKET_TYPE1);
			System.out.println(ConstValueClass_final.TICKET_TYPE2);
			ticketselect = sc.nextInt();

			if(!(ticketselect ==1 || ticketselect ==2)) {
				errorMessagePrint();
			}
		}while(!(ticketselect ==1 || ticketselect ==2));
	}

	
	// �ֹι�ȣ �Է�
	void inputCustomerIDNumber () {
	
		do {
			System.out.println(ConstValueClass_final.GUEST_IDNUMBER_QUESTION);
			customerIDNumber =sc.nextLong();
			
			if(!(customerIDNumber >=ConstValueClass_final.FULL_DIGIT_MIN) && (customerIDNumber <ConstValueClass_final.FULL_DIGIT)){ 
				errorMessagePrint();
			}
		}while(!(customerIDNumber >=ConstValueClass_final.FULL_DIGIT_MIN) && (customerIDNumber <ConstValueClass_final.FULL_DIGIT));
				
	}

	// ���� �Է�
	void inputOrderCount() {
		
		do {		
			System.out.println(ConstValueClass_final.ORDER_COUNT_QUESTION);
			ordercount =sc.nextInt();
			
			if(!(ordercount<=ConstValueClass_final.MAX_COUNT &&ordercount>=ConstValueClass_final.MIN_COUNT)) {
				errorMessagePrint();
			}
		}while(!(ordercount<=ConstValueClass_final.MAX_COUNT &&ordercount>=ConstValueClass_final.MIN_COUNT));
	
	}

	//������ �Է�
	void inputDiscountSelect() {
		
		do {
			System.out.println(ConstValueClass_final.DISCOUNT_TYPE_QUESTION);
			System.out.println(ConstValueClass_final.DISCOUNT_TYPE1);
			System.out.println(ConstValueClass_final.DISCOUNT_TYPE2);
			System.out.println(ConstValueClass_final.DISCOUNT_TYPE3);
			System.out.println(ConstValueClass_final.DISCOUNT_TYPE4);
			System.out.println(ConstValueClass_final.DISCOUNT_TYPE5);
			discountselect = sc.nextInt();
			
			if(!(discountselect>=1 && discountselect <=5)){
				errorMessagePrint();
			}
		}while(!(discountselect>=1 && discountselect <=5));

	}
	
	
	//�����޼��� ���
	public static void errorMessagePrint() {
		System.out.println(ConstValueClass_final.ERROR);
	}
	
	//  �Է��Լ� ȣ��
	public  void inputData() {

		inputTicketSelect();
		inputCustomerIDNumber();
		inputOrderCount();
		inputDiscountSelect();

	}

}
