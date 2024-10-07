package com.aishiki.service;

import java.util.List;

import com.aishiki.mapper.DownMapper;
import com.aishiki.model.Down;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class DownService {
	
	@Autowired
	private DownMapper downMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Down> getAllDown(){
		return downMapper.selectByExample(null);
	}

}
