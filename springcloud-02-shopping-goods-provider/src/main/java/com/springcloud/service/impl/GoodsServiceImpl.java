package com.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcloud.dao.GoodsMapper;
import com.springcloud.entity.Goods;
import com.springcloud.service.GoodsService;

/**
 * 商品模型层：用于实现对商品模块操作的方法
 * @author lenovo
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	
	@Transactional
	@Override
	public Integer insert(Goods goods) {
		return this.goodsMapper.insert(goods);
	}

}
