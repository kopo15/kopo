package Amusementpark_final;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Final_final {


	
	List<OrderList_final>data=new ArrayList<OrderList_final>();
	OrderList_final orderList = null;
	Calc_final calc =new Calc_final();
	Input_final input =new Input_final();


	void saveData() {		
		orderList =new OrderList_final(input.getTicketselect(),calc.getAgeGroup(),calc.getTotalPrice(),input.getOrdercount(),calc.getDiscount());
		data.add(orderList);
		
	}
	
	void output() {
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
	
		System.out.println(ConstValueClass_final.FINAL_PRINT_HEAD1);
		System.out.println();
		System.out.println(ConstValueClass_final.FINAL_PRINT_HEAD2);
		
		int total_sum = 0;
		
		for(OrderList_final order :data) {
			
			input.ticketselect=order.getTicketSelect();
			calc.ageGroup =order.getAgeGroup();
			calc.totalPrice = order.getTotalPrice();
			input.ordercount =order.getOrderCount();
			calc.discount=order.getDiscount();
			
			total_sum = total_sum+calc.getTotalPrice();
		
			
			if(	input.ticketselect ==1) {
				System.out.print(ConstValueClass_final.FINAL_PRINT_TICKET1);
			}else {
				System.out.print(ConstValueClass_final.FINAL_PRINT_TICKET2);
			}
			if(calc.getAgeGroup() ==1) {
				System.out.print(ConstValueClass_final.FINAL_PRINT_AGEGROUP_BABY);
			
			}else if(calc.getAgeGroup() ==2) {
				System.out.print(ConstValueClass_final.FINAL_PRINT_AGEGROUP_CHILD);
			
			}else if(calc.getAgeGroup()==3) {
				System.out.print(ConstValueClass_final.FINAL_PRINT_AGEGROUP_TEEN);
			
			}else if(calc.getAgeGroup() ==4) {
				System.out.print(ConstValueClass_final.FINAL_PRINT_AGEGROUP_ADULT);
			
			}else {
				System.out.print(ConstValueClass_final.FINAL_PRINT_AGEGROUP_OLD);

			}
			System.out.println("X " + input.getOrdercount()+ "\t " + df.format(calc.getTotalPrice())+"\\  "+calc.getDiscount());
			
		}
		System.out.println();
		System.out.printf(ConstValueClass_final.FINAL_PRINT_TOTALPRICE);
		System.out.println(df.format(total_sum)+"\\");
		System.out.println("=====================================================");
		System.out.println();
	}

	
}