package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.DemoUser;
import com.example.demo.mapper.DemoUserMapper;

@Service
public class DemoServiceImpl implements DemoService {
	
	private final DemoUserMapper demoUserMapper;
	
	public DemoServiceImpl(DemoUserMapper demoUserMapper) {
		this.demoUserMapper = demoUserMapper;
	}

	@Override
	public List<DemoUser> findAllUser() {
		return demoUserMapper.findAllUser();
	}

}
