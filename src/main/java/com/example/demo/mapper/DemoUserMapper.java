package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.DemoUser;

@Mapper
public interface DemoUserMapper {
	
	@Select("select id, loginName, userName from _USER order by createTime")
	List<DemoUser> findAllUser();
}
