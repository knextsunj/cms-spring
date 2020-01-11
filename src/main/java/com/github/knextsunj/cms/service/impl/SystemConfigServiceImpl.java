package com.github.knextsunj.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.knextsunj.cms.dao.SystemConfigDAO;
import com.github.knextsunj.cms.domain.SystemConfig;
import com.github.knextsunj.cms.service.SystemConfigService;

@Service
public class SystemConfigServiceImpl implements SystemConfigService {

	@Autowired
	private SystemConfigDAO systemConfigDAO;
	
	@Override
	public SystemConfig fetchSystemConfigByKey(String key) {
		return systemConfigDAO.getSystemConfigByKey(key);
	}

}
