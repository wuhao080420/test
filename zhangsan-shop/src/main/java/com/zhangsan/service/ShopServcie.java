package com.zhangsan.service;

import java.util.List;
import java.util.Map;

import com.zhangsan.entity.Goods;
import com.zhangsan.entity.Shop;

public interface ShopServcie {

	List<Map<String, Object>> getlist(Map<String, Object> map);

	List<Goods> getGoodsList();

	int addshop(List<Integer> gids, Shop shop);

	Shop getshop(int sid);

}
