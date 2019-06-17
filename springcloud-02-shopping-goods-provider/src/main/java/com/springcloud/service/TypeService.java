package com.springcloud.service;

import java.util.List;
import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;

/**
 * ���ڶ���һ�������������ģ��ķ���
 * 
 * @author lenovo
 *
 */
public interface TypeService {
	
	/**
	 * ��ѯ����һ��������Ϣ
	 * 
	 * @return
	 */
	public abstract  List<TypeOne> selectAllTypeOne();
	
	
	/**
	 * ����һ������Ų�ѯ��Ӧ�Ķ��������Ϣ
	 * 
	 * @param typeOneId
	 * @return
	 */
	public abstract List<TypeTwo> selectTypeTwoByTypeOneId(Integer typeOneId);
	
	
}
