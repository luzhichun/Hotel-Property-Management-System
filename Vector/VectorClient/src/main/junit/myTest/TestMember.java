package myTest;

import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import businessLogic.impl.MemberBlServiceImpl;
import businessLogic.service.MemberBlService;
import common.Sex;
import vo.MemberVo;


public class TestMember {
	private MemberBlService test  ;
	private TestClient clientRunner ;
	
	@Before
	public void setUp() throws Exception {
		clientRunner = new TestClient();
		test = MemberBlServiceImpl.getInstance() ;
	}

	@Test
	public void testGetCredit() {
		//test member
		int credit = test.getCredit("N00002");
		Assert.assertEquals(100, credit);
		
		//test enterprise
		
	}

	@Test
	public void testChargeCredit() {
		//test member
		int ori = test.getCredit("N00007");
		int charge = 1 ;
		test.chargeCredit("N00007", charge);
		Assert.assertEquals(ori + charge, test.getCredit("N00007"));
		Assert.assertEquals(1,test.getInfo("N00007").getVip());
		test.chargeCredit("N00007",100);
		Assert.assertEquals(2,test.getInfo("N00007").getVip());
	}

	@Test
	public void testGetInfo() {
		//test member
		MemberVo actual_vo = test.getInfo("N00002") ;
		Assert.assertEquals("BigDog1", actual_vo.getName());
		Assert.assertEquals("99900008888",actual_vo.getPhone());
		Assert.assertEquals("Beijing",actual_vo.getAddress());
		Assert.assertEquals(Sex.FEMALE,actual_vo.getSex());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Assert.assertEquals("1998-01-01", sdf.format(actual_vo.getBirthday()));
	}

	@Test
	public void testModifyInfo() {
		//test member
		String set = "99900007777";
		MemberVo actual_vo = test.getInfo("N00003") ;
		actual_vo.setPhone(set);
		test.modifyInfo(actual_vo);
		actual_vo = test.getInfo("N00003");
		Assert.assertEquals("99900007777", actual_vo.getPhone());
	}


}
