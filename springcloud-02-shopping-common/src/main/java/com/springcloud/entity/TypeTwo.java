package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TYY_ONE���Ӧ��ʵ���࣬���ڱ������һ�ж��������Ϣ
 * 
 * @author �ι���
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTwo {
	
	/**
	 * ���������
	 */
    private Integer typeTwoId;
    
    /**
	 * �����������
	 */
    private String typeTwoName;

    /**
	 * ���
	 */
    private Integer typeOneId;
    
    /**
	 * ��ע
	 */
    private String typeTwoRemark;

}