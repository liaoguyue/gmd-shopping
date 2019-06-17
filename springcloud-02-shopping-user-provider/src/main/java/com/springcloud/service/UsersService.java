package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * ģ�Ͳ�Ľӿڣ����ڶ����û�ģ��ķ���
 * 
 * @author lenovo
 *
 */
public interface UsersService {
	/**
	 * ��֤�û���¼�Ƿ�ɹ�
	 * @param userId �û����
	 * @param userPsw�û�����
	 * @param permissionIdȨ�ޱ��
	 * @return �ɹ����ص�¼�û���������Ϣ��ʧ�ܷ���null
	 */
	public abstract Users login(Integer userId,String userPsw,Integer permissionId);
	
	/**
	 * ������Ñ���Ϣ
	 * @Param users ���Ñ���Ϣ
	 * @return ��ӳɹ�����com.springcloud.entity.Users���͵�ʵ�������򷵻�null
	 */
	public abstract  Users insert(Users users);
	
	/**
	 * ��ѯ�����������û���Ϣ
	 * 
	 * @param users  ��ѯ����
	 * @param pageNumber ��ѯҳ��
	 * @param �ɹ�����org.springframework.data.domain.Page���͵�ʵ�������򷵻�null
	 */
	public abstract Page<Users> select(Users users, Integer pageNumber);
	
	/**
	 * �޸�ָ���ı�ŵ��û�״̬
	 * @param userId  �û����
	 * @param userStatus  �û�״̬
	 * @return �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer updateStatus(Integer userId,Integer userStatus);
	
	/**
	 * ��ѯָ����ŵ��û���Ϣ
	 * 
	 * @param userId �û����
	 * @return  ����com.springcloud.entity.Users��
	 */
	public abstract Users selectById(Integer userId);
	
	
	/**
	 *�޸�ָ����ŵ���Ϣ
	 *
	 * @param users  �޸ĵ��û���Ϣ
	 * @return �޸ĳɹ�����0�����������򷵻�0
	 */
	public abstract Integer update(Users users);
}
