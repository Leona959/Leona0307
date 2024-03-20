package com.sm.graduation.nurse.service;

import com.sm.graduation.nurse.pojo.NurseInfo;
import com.sm.graduation.nurse.dao.NurseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NurseInfoService {

    @Autowired
    private NurseInfoMapper nurseInfoMapper;

    public NurseInfo sltName(NurseInfo nurseInfo){
        return nurseInfoMapper.sltName(nurseInfo);
    }

    public boolean loginIn(NurseInfo nurseInfo){
        return nurseInfoMapper.loginIn(nurseInfo);
    }

    public List<NurseInfo> listAll(Map map) {
    	return nurseInfoMapper.listAll(map);
    }

    public NurseInfo getById(Long nurseId) {
    	return nurseInfoMapper.getById(nurseId);
    }

    public int insert(NurseInfo nurseInfo) {
    	return nurseInfoMapper.insert(nurseInfo);
    }

    public int update(NurseInfo nurseInfo) {
    	return nurseInfoMapper.update(nurseInfo);
    }

    public int delNurse(Integer nurseId) {return nurseInfoMapper.delNurse(nurseId);}
    public int altPwd(Map map) {
        return nurseInfoMapper.altPwd(map);
    }

}
