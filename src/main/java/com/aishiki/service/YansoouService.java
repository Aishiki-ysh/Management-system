package com.aishiki.service;

import com.aishiki.mapper.YansouTeamMapper;
import com.aishiki.model.YansouTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class YansoouService {
	
	@Autowired
	private YansouTeamMapper yansouTeamMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public YansouTeam selectYanSouInfoByid(Integer yansouTeamId) {
		return yansouTeamMapper.selectYanSouInfoByid(yansouTeamId);
	}

}
