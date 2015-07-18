package com.ori.apps.web.spring.smartsence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ori.apps.web.spring.smartsence.dao.DataTick;
import com.ori.apps.web.spring.smartsence.dao.DataTickDAO;

@Service("dataTickService")
public class DataTickService {
	
	private DataTickDAO dataTickDao;
	
	@Autowired
	public void setDataTickDao(DataTickDAO dataTickDao) {
		this.dataTickDao = dataTickDao;
	}

	public List<DataTick> getAllDataTicks() {		
		return dataTickDao.getAllData();
	}

	public List<DataTick> getLastDataTicks() {
		return dataTickDao.getLastData();
	}
	
	public int addDataTick(DataTick dt) {
		//  validate data
		return dataTickDao.addDataTick(dt);
	}

	public List<DataTick> throwTestExeption() {
		return dataTickDao.getDataByTime(22);
		
	}

	public boolean isUnitRegister(String unitId) {		
		return dataTickDao.isUnitRegister(unitId);		
	}

	

}
