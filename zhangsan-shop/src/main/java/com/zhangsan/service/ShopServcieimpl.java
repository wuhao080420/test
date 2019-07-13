package com.zhangsan.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangsan.entity.Goods;
import com.zhangsan.entity.Gs;
import com.zhangsan.entity.Shop;
import com.zhangsan.mapper.ShopMapper;


@Service
public class ShopServcieimpl implements ShopServcie {

	@Autowired
	ShopMapper dd;
	
	@Override
	public List<Map<String, Object>> getlist(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dd.getlist(map);
	}

	@Override
	public List<Goods> getGoodsList() {
		// TODO Auto-generated method stub
		return dd.getGoodsList();
	}


	@Override
	public Shop getshop(int sid) {
		// TODO Auto-generated method stub
		return dd.getshop(sid);
	}

	@Override
	public int addshop(List<Integer> gids, Shop shop) {
		Gs gs=null;
		if(gids!=null){
			for (Integer integer : gids) {
				 gs = new Gs();
				gs.setSid(shop.getSid());
				gs.setGid(integer);
				int i=dd.addgs(gs);
			}
		}
		int j=dd.addshop(shop);
		
		
		return 1;
	}

	
	
}
