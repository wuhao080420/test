package com.zhangsan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangsan.entity.Goods;
import com.zhangsan.entity.Shop;
import com.zhangsan.service.ShopServcie;

@Controller
public class ShopController {

		@Autowired
		ShopServcie ss;
		
		@RequestMapping(value="list")//查找列表数据 并返回到列表的页面
		public String getlist(Model model,@RequestParam(defaultValue="1")int pageNum,
				@RequestParam(defaultValue="")String sname,
				@RequestParam(defaultValue="")String gname
				){
			PageHelper.startPage(pageNum, 3);
			 Map<String,Object> map = new HashMap<>();
			map.put("sname", sname);
			map.put("gname", gname);
			
			List<Map<String,Object>> list=ss.getlist(map);
			PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
			
		
			model.addAttribute("page", pageInfo);
			model.addAttribute("map", map);
			
			return "list";
			
		}
		
		@RequestMapping(value="toadd")//跳转到添加的页面
		public String toadd(Model model){
			List<Goods> goods=ss.getGoodsList();
			model.addAttribute("goods", goods);
			return "add";
		}
		
		@RequestMapping(value="add")
		public String add(@RequestParam(required=false)List<Integer> gids,Shop shop){
			
			int i=ss.addshop(gids,shop);
			
			return "redirect:list";
		}
		
		@RequestMapping(value="tolook")
		public String tolook(int sid,Model model){
			Shop shop=ss.getshop(sid);
			List<Goods> goods=ss.getGoodsList();
			model.addAttribute("goods", goods);
			model.addAttribute("shop", shop);
			return "look";
		}
	
	
}
