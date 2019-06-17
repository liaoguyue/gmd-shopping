package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;
import com.springcloud.service.TypeService;
import com.springcloud.vo.ResultValue;

/**
 * һ�������������Ŀ�����
 * 
 * @author lenovo
 *
 */
@RestController
@RequestMapping("type")
public class TypeController {
	@Autowired
	private TypeService typeService;
	
	
	/**
	 * ��ԃһ�������Ϣ
	 * 
	 * @return
	 */
	@RequestMapping(value="/selectAll")
	public ResultValue selectAll() {
		ResultValue rv = new ResultValue();
		
		
		try {
			//����service��Ӧ�ķ�����ѯ��Ӧ����������Ϣ���������ѯ�Ľ��
			List<TypeOne> list = this.typeService.selectAllTypeOne();
			//�����ѯ�ɹ�
			if(list != null && list.size() > 0) {
			//���ý���ı��״̬Ϊ0
				rv.setCode(0);
			//����Map����
				Map<String,Object> map = new HashMap<>();
			//����ѯ�������Map������
				map.put("typeOneList",list);
			//��Map���ϴ���ResultValue������
				rv.setDataMap(map);
			//����ResulValue����
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
	@RequestMapping(value="/selectById")
	public ResultValue selectById(@RequestParam("typeOneId") Integer typeOneId) {
		ResultValue rv = new ResultValue();
		
		
		try {
			//����service��Ӧ�ķ�����ѯ��Ӧ����������Ϣ���������ѯ�Ľ��
			List<TypeTwo> list = this.typeService.selectTypeTwoByTypeOneId(typeOneId);
			//�����ѯ�ɹ�
			if(list != null && list.size() > 0) {
			//���ý���ı��״̬Ϊ0
				rv.setCode(0);
			//����Map����
				Map<String,Object> map = new HashMap<>();
			//����ѯ�������Map������
				map.put("typeTwoList",list);
			//��Map���ϴ���ResultValue������
				rv.setDataMap(map);
			//����ResulValue����
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
}
