package Amusementpark_final;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Final_final {


	List<OrderList_final>data=new ArrayList<OrderList_final>();
	OrderList_final orderList = null;
	Calc_final calc =new Calc_final();
	Input_final input =new Input_final();


	void saveData()  {		
		orderList =new OrderList_final(input.getTicketselect(),calc.getAgeGroup(),calc.getTotalPrice(),input.getOrdercount(),calc.getDiscount());
		data.add(orderList);
	
	 }
	void output() throws IOException {
			
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
		void saveDataForFile() throws IOException {
			
			File f  = new File("C:\\Users\\kopo\\Desktop\\kopo15\\Everland.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));							
			DecimalFormat df = new DecimalFormat("###,###,###,###,###");		
			StringBuffer s =new StringBuffer();			
			int total_sum = 0;
			
			
			String Title ="권종 연령그룹 수량 가격 우대사항 입장료총액";
			String title [] = Title.split(" ");
			for(String print :title) {
				s.append(print).append(",");
				//s.append("\n");
			}
			s.append("\n");
			//bw.newLine();
					
			for(OrderList_final order :data) {
				
				input.ticketselect=order.getTicketSelect();
				calc.ageGroup =order.getAgeGroup();
				calc.totalPrice = order.getTotalPrice();
				input.ordercount =order.getOrderCount();
				calc.discount=order.getDiscount();
				
				total_sum = total_sum+calc.getTotalPrice();
			
				s.append("\n");
				if(	input.ticketselect ==1) {
					s.append(ConstValueClass_final.FINAL_PRINT_TICKET1).append(",");
					
					//bw.write(ConstValueClass_final.FINAL_PRINT_TICKET1);
					//bw.append(",");			
				}else {
					s.append(ConstValueClass_final.FINAL_PRINT_TICKET2).append(",");
					//bw.write(ConstValueClass_final.FINAL_PRINT_TICKET2);
					//bw.append(",");			
				}
				if(calc.getAgeGroup() ==1) {
					s.append(ConstValueClass_final.FINAL_PRINT_AGEGROUP_BABY).append(",");
					//bw.write(ConstValueClass_final.FINAL_PRINT_AGEGROUP_BABY);
					//bw.append(",");	

				}else if(calc.getAgeGroup() ==2) {
					s.append(ConstValueClass_final.FINAL_PRINT_AGEGROUP_CHILD).append(",");
					//bw.write(ConstValueClass_final.FINAL_PRINT_AGEGROUP_CHILD);
					//bw.append(",");	
					
				}else if(calc.getAgeGroup()==3) {
					s.append(ConstValueClass_final.FINAL_PRINT_AGEGROUP_TEEN).append(",");
					//bw.write(ConstValueClass_final.FINAL_PRINT_AGEGROUP_TEEN);
					//bw.append(",");	
				
				}else if(calc.getAgeGroup() ==4) {
					s.append(ConstValueClass_final.FINAL_PRINT_AGEGROUP_ADULT).append(",");
					//bw.write(ConstValueClass_final.FINAL_PRINT_AGEGROUP_ADULT);
					//bw.append(",");			
				}else {
					s.append(ConstValueClass_final.FINAL_PRINT_AGEGROUP_OLD).append(",");
					//bw.write(ConstValueClass_final.FINAL_PRINT_AGEGROUP_OLD);
					//bw.append(",");					
				}
				
				s.append(input.getOrdercount()).append(",").append(calc.getTotalPrice()).append(",");			
				//bw.append(s.toString());bw.append(",");
				s.append(calc.getDiscount()).append(",");				
			}
			s.append(total_sum);
			s.append("\n");
			bw.write(s.toString());	bw.newLine();
			//bw.write(total_sum);bw.append(",");
			bw.flush();
			bw.close();
			
		}
			
	
	}

