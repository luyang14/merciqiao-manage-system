package com.carloan.feign.admin;

import java.util.List;
import java.util.Map;

import com.carloan.api.model.admin.SysOrgParam;
import com.carloan.api.model.admin.SysOrgVo;
import com.carloan.apimodel.common.ResponseResult;
import com.carloan.apimodel.common.GetResponseResult;
import com.carloan.apimodel.common.Status;


import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @classname: SysOrgServiceHystrix
 * @description: 定义  sys_org,微服务断路器
 * 一个微服务的超时失败可能导致瀑布式连锁反映Hystrix通过自主反馈实现的断路器，
 * 防止了这种情况发生调用失败达到一个特定的阀值(5秒之内发生20次失败是Hystrix定义的缺省值), 链路就会被处于open状态，
 * 之后所有所有对服务B的调用都不会被执行，
 * 取而代之的是由断路器提供的一个表示链路open的Fallback消息.  Hystrix提供了相应机制
 *
 * @author:  zhouzhiwei
 */
@Component
@Log
public class  SysOrgServiceHystrix implements  SysOrgServicefeign {

	@Override
	public ResponseResult<Object> querySysOrgByPrimaryKey(String message) {
		return GetResponseResult.result();

	}

	@Override
	public ResponseResult<List<SysOrgVo>> querySysOrgList(@RequestBody SysOrgParam obj) {
		return GetResponseResult.result();
	}


	@Override
	public ResponseResult<Object> queryLikeSysOrg(@RequestBody SysOrgVo obj) {
		return GetResponseResult.result();
	}

	@Override
	public ResponseResult<String> insertSysOrg(@RequestBody SysOrgVo obj) {
		return GetResponseResult.result();

	}

	@Override
	public ResponseResult<String> updateSysOrg(@RequestBody SysOrgVo obj) {
		return GetResponseResult.result();

	}
	@Override
	public ResponseResult deleteOrgByID(@RequestParam("id") String id)
	{
		return GetResponseResult.result();
	}


}
