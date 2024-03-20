package com.sm.graduation.nurse.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NurseInfo {
	/** 護工编号 */
	private Long nurseId;
	/** 登录名 */
	private String nurseLogin;
	/** 密码 */
	private String nursePwd;
	/** 用户名 */
	private String nurseName;
	private long nurseTel;

	private String nurseSex;
	private short power;

}
