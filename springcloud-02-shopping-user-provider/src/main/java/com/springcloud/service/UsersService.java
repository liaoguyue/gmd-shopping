package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * 模型层的接口：用于定义用户模块的方法
 * 
 * @author lenovo
 *
 */
public interface UsersService {
	/**
	 * 验证用户登录是否成功
	 * @param userId 用户编号
	 * @param userPsw用户密码
	 * @param permissionId权限编号
	 * @return 成功返回登录用户的完整信息，失败返回null
	 */
	public abstract Users login(Integer userId,String userPsw,Integer permissionId);
	
	/**
	 * 添加新用戶信息
	 * @Param users 新用戶信息
	 * @return 添加成功返回com.springcloud.entity.Users类型的实例，否则返回null
	 */
	public abstract  Users insert(Users users);
	
	/**
	 * 查询满足条件的用户信息
	 * 
	 * @param users  查询条件
	 * @param pageNumber 查询页数
	 * @param 成功返回org.springframework.data.domain.Page类型的实例，否则返回null
	 */
	public abstract Page<Users> select(Users users, Integer pageNumber);
	
	/**
	 * 修改指定的编号的用户状态
	 * @param userId  用户编号
	 * @param userStatus  用户状态
	 * @return 修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer updateStatus(Integer userId,Integer userStatus);
	
	/**
	 * 查询指定编号的用户信息
	 * 
	 * @param userId 用户编号
	 * @return  返回com.springcloud.entity.Users的
	 */
	public abstract Users selectById(Integer userId);
	
	
	/**
	 *修改指定编号的信息
	 *
	 * @param users  修改的用户信息
	 * @return 修改成功大于0的整数，否则返回0
	 */
	public abstract Integer update(Users users);
}
