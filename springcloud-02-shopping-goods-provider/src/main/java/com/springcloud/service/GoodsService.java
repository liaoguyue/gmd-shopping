package com.springcloud.service;

import com.springcloud.entity.Goods;

public interface GoodsService {
	
	/**
	 * ����µ���Ʒ��Ϣ
	 * 
	 * @param goods ����Ʒ��Ϣ
	 * @return  �ɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer insert(Goods goods);
}
