package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOne {
	/**
   	 * 一级类别编号
   	 */
    private Integer typeOneId;
    
    /**
   	 * 一级类别名称
   	 */
    private String typeOneName;
    
    /**
   	 * 序号
   	 */
    private Integer typeOneNum;
    
    /**
   	 * 备注
   	 */
    private String typeOneRemark;

}