package com.kodark.news.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodark.news.mappers.ReportersProcedureMapper;
@Repository
public class ReportersProcedureDao {
	
	@Autowired
	ReportersProcedureMapper reportersProcedureMapper;
	
	public void reportersBlindProcedure(Map<String, Object>params){
		reportersProcedureMapper.reportersBlindProcedure(params);
	}
}
