package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Goods;
import com.springcloud.service.GoodsService;
import com.springcloud.vo.ResultValue;

/**
 * ��Ʒ���Ʋ�
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
	 * �������Ʒ��Ϣ
	 * 
	 * @param goods ����Ʒ��Ϣ
	 * @return
	 */
	@RequestMapping(value="/insert")
	public ResultValue insert(Goods goods) {
		ResultValue rv = new ResultValue();
		
		try {
			Integer insert = this.GoodsService.insert(goods);
			if(insert > 0) {
				rv.setCode(0);
				rv.setMessage("��Ʒ��Ϣ¼��ɹ�������");
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("��Ʒ¼��ʧ��!!!");
		return rv;
	}
}
