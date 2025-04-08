package com.entity.vo;

import com.entity.JiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 缴费信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public class JiaofeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 缴费月份
	 */
	
	private String jiaofeiyuefen;
		
	/**
	 * 缴费名称
	 */
	
	private String jiaofeimingcheng;
		
	/**
	 * 缴费类型
	 */
	
	private String jiaofeileixing;
		
	/**
	 * 缴费内容
	 */
	
	private String jiaofeineirong;
		
	/**
	 * 缴费金额
	 */
	
	private Integer jiaofeijine;
		
	/**
	 * 缴费备注
	 */
	
	private String jiaofeibeizhu;
		
	/**
	 * 老人编号
	 */
	
	private String laorenbianhao;
		
	/**
	 * 老人姓名
	 */
	
	private String laorenxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 缴费状态
	 */
	
	private String jiaofeizhuangtai;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：缴费月份
	 */
	 
	public void setJiaofeiyuefen(String jiaofeiyuefen) {
		this.jiaofeiyuefen = jiaofeiyuefen;
	}
	
	/**
	 * 获取：缴费月份
	 */
	public String getJiaofeiyuefen() {
		return jiaofeiyuefen;
	}
				
	
	/**
	 * 设置：缴费名称
	 */
	 
	public void setJiaofeimingcheng(String jiaofeimingcheng) {
		this.jiaofeimingcheng = jiaofeimingcheng;
	}
	
	/**
	 * 获取：缴费名称
	 */
	public String getJiaofeimingcheng() {
		return jiaofeimingcheng;
	}
				
	
	/**
	 * 设置：缴费类型
	 */
	 
	public void setJiaofeileixing(String jiaofeileixing) {
		this.jiaofeileixing = jiaofeileixing;
	}
	
	/**
	 * 获取：缴费类型
	 */
	public String getJiaofeileixing() {
		return jiaofeileixing;
	}
				
	
	/**
	 * 设置：缴费内容
	 */
	 
	public void setJiaofeineirong(String jiaofeineirong) {
		this.jiaofeineirong = jiaofeineirong;
	}
	
	/**
	 * 获取：缴费内容
	 */
	public String getJiaofeineirong() {
		return jiaofeineirong;
	}
				
	
	/**
	 * 设置：缴费金额
	 */
	 
	public void setJiaofeijine(Integer jiaofeijine) {
		this.jiaofeijine = jiaofeijine;
	}
	
	/**
	 * 获取：缴费金额
	 */
	public Integer getJiaofeijine() {
		return jiaofeijine;
	}
				
	
	/**
	 * 设置：缴费备注
	 */
	 
	public void setJiaofeibeizhu(String jiaofeibeizhu) {
		this.jiaofeibeizhu = jiaofeibeizhu;
	}
	
	/**
	 * 获取：缴费备注
	 */
	public String getJiaofeibeizhu() {
		return jiaofeibeizhu;
	}
				
	
	/**
	 * 设置：老人编号
	 */
	 
	public void setLaorenbianhao(String laorenbianhao) {
		this.laorenbianhao = laorenbianhao;
	}
	
	/**
	 * 获取：老人编号
	 */
	public String getLaorenbianhao() {
		return laorenbianhao;
	}
				
	
	/**
	 * 设置：老人姓名
	 */
	 
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：缴费状态
	 */
	 
	public void setJiaofeizhuangtai(String jiaofeizhuangtai) {
		this.jiaofeizhuangtai = jiaofeizhuangtai;
	}
	
	/**
	 * 获取：缴费状态
	 */
	public String getJiaofeizhuangtai() {
		return jiaofeizhuangtai;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
