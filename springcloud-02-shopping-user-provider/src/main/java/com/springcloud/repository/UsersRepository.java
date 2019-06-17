package com.springcloud.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springcloud.entity.Users;


/**
 * �־û��㣺 �����USERS����в����ķ���
 * @author lenovo
 *
 */
public interface UsersRepository extends JpaRepository<Users, Integer>,JpaSpecificationExecutor<Users>{
	/**
	 * �ж��û���¼�Ƿ�ɹ�
	 * @param userId �û����
	 * @param userPsw�û�����
	 * @param permissionId	Ȩ�ޱ��
	 * @return �ɹ����ص�¼�û���������Ϣ��ʧ�ܷ���null
	 */
	@Query("select new com.springcloud.entity.Users(u.userId,u.userName,u.userPsw,u.userSex,u.userIdnum,u.userTel,u.userBirthday,u.userEmail,u.userImage,u.permissionId,u.userAddr,u.userStatus) " 
	 + "from com.springcloud.entity.Users u where u.userId=:userId and u.userPsw=:userPsw and u.permissionId=:permissionId and u.userStatus=0")
	public abstract Users login(@Param("userId") Integer userId,@Param("userPsw") String userPsw,
			@Param("permissionId") Integer permissionId);
	
	
	
	/**
	 * �޸�USERS����ָ����ŵ�״̬
	 * @param userId	�û����
	 * @param userStatus �û�״̬
	 * @return  �޸ĳɹ����ش���0�����������򷵻�0
	 */
	@Modifying
	@Query("update Users set userStatus=:userStatus where userId=:userId")
	public abstract Integer updateStatus(@Param("userId") Integer userId,@Param("userStatus") Integer userStatus);
	
	
	@Modifying
	@Query("update Users u set u.userIdnum=:#{#users.userIdnum},u.userSex=:#{#users.userSex},u.userTel=:#{#users.userTel},u.userBirthday=:#{#users.userBirthday},"
			+"u.userEmail=:#{#users.userEmail},u.userAddr=:#{#users.userAddr} where u.userId=:#{#users.userId}")
	public abstract Integer update(@Param("users") Users users);
}
