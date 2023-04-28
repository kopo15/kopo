package Amusementpark_final;

public class OrderList_final {
	
	private int ticketSelect;
	private int totalPrice;
	private int ageGroup;
	private int orderCount;
	private String discount;
	
	
	public OrderList_final(int ticketSelect,int ageGroup,int totalPrint ,int orderCount,String discount) {
		
		this.ticketSelect =ticketSelect;
		this.ageGroup =ageGroup;
		this.totalPrice =totalPrint;	
		this.orderCount = orderCount;
		this.discount = discount;
	
	
	}

	public int getTicketSelect() {
		return ticketSelect;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public int getAgeGroup() {
		return ageGroup;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public String getDiscount() {
		return discount;
	}


}

