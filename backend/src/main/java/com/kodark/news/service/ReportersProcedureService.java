package com.kodark.news.service;

import java.util.Map;

public interface ReportersProcedureService {
	
	public void execuReportersProcedure(Map<String, Object> params);
	
	//����������(������ restAPI 61_line)
	public Map<String, String> getReporterInfo(int id);
}
