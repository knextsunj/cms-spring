package com.github.knextsunj.cms.dao;

import com.github.knextsunj.cms.domain.SystemConfig;

public interface SystemConfigDAO extends GenericDAO<SystemConfig> {
	
	SystemConfig getSystemConfigByKey(String key);

}
