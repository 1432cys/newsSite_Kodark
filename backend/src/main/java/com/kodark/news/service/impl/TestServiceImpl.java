package com.kodark.news.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kodark.news.dao.TestDao;
import com.kodark.news.dto.TestDto;
import com.kodark.news.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	@Qualifier("TestDao")
	private TestDao testDao;
	
	@Override
	public List<TestDto> getAllTests() {
		List<TestDto> allTests = testDao.getTests();
		return allTests;
	}

	@Override
	public TestDto getTest(int id) {
		TestDto test = testDao.getTest(id);
		return test;
	}

	@Override
	public void excuEmpProcedure(Map<String, Object> parameters) {
//	public void excuEmpProcedure(TestDto testDto) {
//		testDao.excuEmpProcedure(testDto);
//	}
//	public String excuEmpProcedure(String name) {
		testDao.excuEmpProcedure(parameters);
	}

}
