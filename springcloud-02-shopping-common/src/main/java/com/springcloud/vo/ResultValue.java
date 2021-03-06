package com.springcloud.vo;

import java.util.Map;

import lombok.Data;

/**
 * 定义本项目所有Controller返回的结果类型
 * @author lenovo
 *
 */
@Data
public class ResultValue implements java.io.Serializable{

	private static final long serialVersionUID = 5472915493540276762L;

	/**
	 * 设置当前结果的状态：0表示成功，1表示失败
	 */
	private Integer code;
	
	/**
	 * 设置返回的信息
	 */
	private String message;
	
	/**
	 * 设置返回的数据
	 */
	private Map<String,Object> dataMap;

	
}
