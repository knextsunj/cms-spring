package com.github.knextsunj.cms.domain;

public class SystemConfig {

	private Long id;

	private String key;

	private String value;

	public SystemConfig() {

	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
