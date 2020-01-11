package com.github.knextsunj.cms.aspect;

import java.util.Objects;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.github.knextsunj.cms.constants.GenericConstants;

@Component
@Aspect
public class ExitLoggingAspect {

	private static final Logger logger = LogManager.getLogger(ExitLoggingAspect.class);

	@Autowired
	@Qualifier("systemConfig")
	private Properties systemProps;

	@AfterReturning(value = "execution(* com.github.knextsunj.cms.api..*.*(..)))", returning = "result")
	public void logAPIMethodExit(JoinPoint joinPoint, Object result) {
		logMethodExit(joinPoint, systemProps.getProperty(GenericConstants.API_LAYER_LOG_LEVEL_KEY), result);
	}

	@AfterReturning(value = "within(com.github.knextsunj.cms.dao..*)", returning = "result")
	public void logDAOMethodExit(JoinPoint joinPoint, Object result) {
		logMethodExit(joinPoint, systemProps.getProperty(GenericConstants.OTHER_LAYER_LOG_LEVEL_KEY), result);
	}

	@AfterReturning(value = "within(com.github.knextsunj.cms.service..*)", returning = "result")
	public void logServiceMethodExit(JoinPoint joinPoint, Object result) {
		logMethodExit(joinPoint, systemProps.getProperty(GenericConstants.OTHER_LAYER_LOG_LEVEL_KEY), result);
	}

	private void logMethodExit(JoinPoint joinPoint, String logLevel, Object result) {
		switch (logLevel) {
		case GenericConstants.INFO_LOG_LEVEL_INDICATOR:
			logger.info("Method exited is: {}", joinPoint.getSignature().toShortString());
			if(Objects.nonNull(result)) {
			logger.info("Current Return Value for Current Intercepted Method is: {}", result.toString());
			}
			else {
				logger.info("Current Return Value for Current Intercepted Method is null");	
			}
			break;

		default:
			logger.debug("Method exited is: {}", joinPoint.getSignature().toShortString());
			if(Objects.nonNull(result)) {
			logger.debug("Current Return Value for Current Intercepted Method is: {}", result.toString());
			}
			else {
				logger.info("Current Return Value for Current Intercepted Method is null");
			}
			break;
		}

	}

}
