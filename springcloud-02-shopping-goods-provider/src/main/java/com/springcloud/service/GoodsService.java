package com.springcloud.service;

import com.springcloud.entity.Goods;

public interface GoodsService {
	
	/**
	 * 添加新的商品信息
	 * 
	 * @param goods 新商品信息
	 * @return  成功返回大于0的整数，否则返回0
	 */
	public abstract Integer insert(Goods goods);
}
