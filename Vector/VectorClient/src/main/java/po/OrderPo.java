package po;

import java.util.Date;

import common.RoomType;

/**
 * @ author Aobang 
 * @ version 2016/11/27 
 * @ description
 */
public class OrderPo {
	private String orderId;
	private Date createTime;
	private Date executeTime;
	private Date finishTime; // 退房时间
	private String hotel;
	private String hotelId;
	private RoomType roomType;
	private int numOfRoom;
	private int numOfGuest;
	private boolean childExist;
	private int originalPrice;
	private double discount;
	private int discountedPrice;

	public OrderPo(String orderId, Date createTime, Date executeTime, Date finishTime, String hotel, String hotelId,
			RoomType roomType, int numOfRoom, int numOfGuest, boolean childExist, int originalPrice, double discount,
			int discountedPrice) {
		this.orderId = orderId;
		this.createTime = createTime;
		this.executeTime = executeTime;
		this.finishTime = finishTime;
		this.hotel = hotel;
		this.hotelId = hotelId;
		this.roomType = roomType;
		this.numOfRoom = numOfRoom;
		this.numOfGuest = numOfGuest;
		this.childExist = childExist;
		this.originalPrice = originalPrice;
		this.discount = discount;
		this.discountedPrice = discountedPrice;
	}
	
	public String getOrderId() {
		return this.orderId;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public Date getExecuteTime() {
		return this.executeTime;
	}
	public Date getFinishTime() {
		return this.finishTime;
	}
	public String getHotel() {
		return this.hotel;
	}
	public String getHotelId() {
		return this.hotelId;
	}
	public RoomType getRoomType() {
		return this.roomType;
	}
	public int getNumOfRoom() {
		return this.numOfRoom;
	}
	public int getNumOfGuest() {
		return this.numOfGuest;
	}
	public boolean getChildExist() {
		return this.childExist;
	}
	public int getOriginalPrice() {
		return this.originalPrice;
	}
	public double getDiscount() {
		return this.discount;
	}
	public int getDiscountedPrice() {
		return this.discountedPrice;
	}
	
	public void setCreateTime(Date time) {
		this.createTime = time;
	}
	public void setExecuteTime(Date time) {
		this.executeTime = time;
	}
	public void setFinishTime(Date time) {
		this.finishTime = time;
	}
}
