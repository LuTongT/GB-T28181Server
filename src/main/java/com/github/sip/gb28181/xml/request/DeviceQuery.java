package com.github.sip.gb28181.xml.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Builder;
import lombok.Data;


@XmlRootElement(name = "Query")
@XmlAccessorType(XmlAccessType.FIELD)
@Builder(toBuilder=true)
@Data
public class DeviceQuery {
	@XmlElement(name = "CmdType")
	private String cmdType;
	@XmlElement(name = "SN")
	private Long sn;
	@XmlElement(name = "DeviceId")
	private String deviceId;
	
	
	
}
