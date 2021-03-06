/**
 * Copyright (c) 华南农业大学信息学院蔡超敏2014版权所有
 * 
 * 文件创建时间：2014-7-15
 */
package scau.info.volunteertime.business;

/**
 * @author 蔡超敏
 *
 */
public class BOConstant {
	//验证用户返回值
    //大于0：登陆正确，返回id 0：账号密码为空 -1：密码不正确 -2：账号不存在
    public static final int REP_VAR_PARA_ERR = 0;//帐号密码为空
    public static final int PASSWORD_ERROR = -1;//密码不合法
    public static final int USER_NOT_EXIST = -2;//用户不存在 
    public static final int USER_NOT_ACTIVATED = -3;//用户未激活
    public static final int USER_REGISTER_SUCCESS = 1;//用户注册成功

}
