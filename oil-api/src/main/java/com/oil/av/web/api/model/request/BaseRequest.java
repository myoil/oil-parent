package com.oil.av.web.api.model.request;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class BaseRequest implements Serializable{

	private static final long serialVersionUID = 3301642332497735651L;
	/**
	 * 请求tooken
	 */
	@NotBlank
	private String tooken;
	
	/**
	 * 版本号
	 */
	@NotBlank
	private String version;
	/**
	 * 设备号
	 */
	@NotBlank
	private String deviceCode;
	
	/**
	 * 设备 ios/android
	 */
	@NotBlank
	@Pattern(regexp = "android|ios|ANDROID|IOS",message = "设备参数有误")
	private String device;
	
	private String ip;
	
	public String getTooken() {
		return tooken;
	}
	public void setTooken(String tooken) {
		this.tooken = tooken;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	/**  
	 * 获取ip  
	 * @return ip ip  
	 */
	public String getIp() {
		return ip;
	}
	
	/**  
	 * 设置ip  
	 * @param ip ip  
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	

}
