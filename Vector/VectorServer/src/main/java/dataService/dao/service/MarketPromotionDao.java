package dataService.dao.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import common.ResultMessage;
import po.ActivityPromotionPo;
import po.LevelPo;

public interface MarketPromotionDao extends Remote{
	/**
	 * 更新网站的活动策略列表
	 * @param po
	 * @return
	 */
	public ResultMessage updateActivity(ActivityPromotionPo po) throws RemoteException;
	
	/**
	 * 删除一条活动策略
	 * @param po
	 * @return
	 * @throws RemoteException
	 */
	public ResultMessage deleteActivity(ActivityPromotionPo po) throws RemoteException;
	
	/**
	 * @return 得到网站的活动策略列表
	 */
	public List<String> getActivity() throws RemoteException;
	
	/**
	 * 网站营销人员更新等级促销策略,同时修改所有客户的等级
	 * @param list
	 * @return
	 */
	public ResultMessage updateLevelRule(List<LevelPo> list) throws RemoteException;
	
	/**
	 * 得到会员等级促销策略
	 * @return
	 * @throws RemoteException
	 */
	public List<LevelPo> getLevelList() throws RemoteException;
}