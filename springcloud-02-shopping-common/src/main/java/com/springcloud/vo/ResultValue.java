package com.springcloud.vo;

import java.util.Map;

import lombok.Data;

/**
 * ���屾��Ŀ����Controller���صĽ������
 * @author lenovo
 *
 */
@Data
public class ResultValue implements java.io.Serializable{

	private static final long serialVersionUID = 5472915493540276762L;

	/**
	 * ���õ�ǰ�����״̬��0��ʾ�ɹ���1��ʾʧ��
	 */
	private Integer code;
	
	/**
	 * ���÷��ص���Ϣ
	 */
	private String message;
	
	/**
	 * ���÷��ص�����
	 */
	private Map<String,Object> dataMap;

	
}
