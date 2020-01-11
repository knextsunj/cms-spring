package com.github.knextsunj.cms.service;

import com.github.knextsunj.cms.domain.SystemConfig;

public interface SystemConfigService {
	
	SystemConfig fetchSystemConfigByKey(String key);

}
