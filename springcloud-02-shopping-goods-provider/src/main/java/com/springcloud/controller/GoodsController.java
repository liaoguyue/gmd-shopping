package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Goods;
import com.springcloud.service.GoodsService;
import com.springcloud.vo.ResultValue;

/**
 * 商品控制层
 * 
 * @author lenovo
 *
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
	
	@Autowired
	private GoodsService GoodsService;
	
	/**
	 * 添加新商品信息
	 * 
	 * @param goods 新商品信息
	 * @return
	 */
	@RequestMapping(value="/insert")
	public ResultValue insert(Goods goods) {
		ResultValue rv = new ResultValue();
		
		try {
			Integer insert = this.GoodsService.insert(goods);
			if(insert > 0) {
				rv.setCode(0);
				rv.setMessage("商品信息录入成功！！！");
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("商品录入失败!!!");
		return rv;
	}
}
