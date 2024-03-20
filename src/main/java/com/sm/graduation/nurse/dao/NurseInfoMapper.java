package com.sm.graduation.nurse.dao;

import java.util.List;
import java.util.Map;

import com.sm.graduation.nurse.pojo.NurseInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface NurseInfoMapper {

	@Select("select * from nurse_info where nurse_login=#{nurseLogin}")
	NurseInfo sltName(NurseInfo nurseInfo);


	@Select("select count(*)  from nurse_info where nurse_login=#{nurseLogin} and nurse_pwd=#{nursePwd}")
	boolean loginIn(NurseInfo nurseInfo);


	List<NurseInfo> listAll(Map map);

	@Select("select * from nurse_info where nurse_id=#{nurseID}")
	NurseInfo getById(Long nurseId);

	@Insert("insert into nurse_info(nurse_login,nurse_name,nurse_sex,nurse_tel) values(#{nurseLogin},#{nurseName},#{nurseSex},#{nurseTel}) ")
	int insert(NurseInfo nurseInfo);

	@Update("update nurse_info set nurse_login=#{nurseLogin}, nurse_name=#{nurseName},nurse_sex=#{nurseSex},nurse_tel=#{nurseTel} where nurse_id=#{nurseId}")
	int update(NurseInfo nurseInfo);

	@Delete("delete from nurse_info where nurse_id=#{nurseId}")
	int delNurse(Integer nurseId);

	@Update("update nurse_info set nurse_pwd=#{pwd} where nurse_id=#{id}")
	int altPwd(Map map);

}
