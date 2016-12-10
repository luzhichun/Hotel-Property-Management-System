package vo;

import java.io.Serializable;
import java.util.List;

import common.HotelPromotionType;
import po.CompanyProPo;

/**
 * @version 2016-12-10
 * @author 金灵益
 * @description 合作企业促销策略，属性：折扣，合作企业列表
 */
public class CompanyProVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private final HotelPromotionType type = HotelPromotionType.COOPERATION;
	private double discount;                    //折扣
	private List<String> company;               //合作企业账号
	
	public CompanyProVo(CompanyProPo po){
		this.discount = po.getDiscount();
		this.company = po.getCompanyList();
	}
	
	public HotelPromotionType getPromotionType(){
		return type;
	}
	
	public List<String> getCompanyList(){
		return company;
	}
	
	public double getDiscount(){
		return discount;
	}
}
