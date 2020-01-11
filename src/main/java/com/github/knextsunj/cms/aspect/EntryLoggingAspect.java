package com.github.knextsunj.cms.aspect;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.github.knextsunj.cms.constants.GenericConstants;

@Aspect
@Component
public class EntryLoggingAspect {

	private static final Logger logger = LogManager.getLogger(EntryLoggingAspect.class);

	@Autowired
	@Qualifier("systemConfig")
	private Properties systemProps;

	@Before(value = "execution(* com.github.knextsunj.cms.api..*.*(..)))")
	public void logAPIMethodEntry(JoinPoint joinPoint) {
		System.out.println("here");
		logMethodEntry(joinPoint, systemProps.getProperty(GenericConstants.API_LAYER_LOG_LEVEL_KEY));
	}

	@Before(value = "within(com.github.knextsunj.cms.dao..*)")
	public void logDAOMethodEntry(JoinPoint joinPoint) {
		logMethodEntry(joinPoint, systemProps.getProperty(GenericConstants.OTHER_LAYER_LOG_LEVEL_KEY));
	}

	@Before(value = "within(com.github.knextsunj.cms.service..*)")
	public void logServiceMethodEntry(JoinPoint joinPoint) {
		logMethodEntry(joinPoint, systemProps.getProperty(GenericConstants.OTHER_LAYER_LOG_LEVEL_KEY));
	}

	private void logMethodEntry(JoinPoint joinPoint, String logLevel) {
		logger.info("log level is: {}",logLevel);
		Object[] args = joinPoint.getArgs();
		switch (logLevel) {
		case GenericConstants.INFO_LOG_LEVEL_INDICATOR:
			logger.info("Method exited is: {}", joinPoint.getSignature().toShortString());
			for (Object object : args) {
				logger.info("Current Argument for Current Intercepted Method is: {}", object.toString());
			}
			break;

		default:
			logger.debug("Method exited is: {}", joinPoint.getSignature().toShortString());
			for (Object object : args) {
				logger.debug("Current Argument for Current Intercepted Method is: {}", object.toString());
			}
			break;
		}

	}
	
	

}
