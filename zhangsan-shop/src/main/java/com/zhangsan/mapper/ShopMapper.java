package com.zhangsan.mapper;

import java.util.List;
import java.util.Map;

import com.zhangsan.entity.Goods;
import com.zhangsan.entity.Gs;
import com.zhangsan.entity.Shop;

public interface ShopMapper {

	List<Map<String, Object>> getlist(Map<String, Object> map);

	List<Goods> getGoodsList();

	int addgs(Gs gs);

	int addshop(Shop shop);

	Shop getshop(int sid);


}
