package com.entity.vo;

import com.entity.YuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public class YuangongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 电子邮件
	 */
	
	private String dianziyoujian;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
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
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：电子邮件
	 */
	 
	public void setDianziyoujian(String dianziyoujian) {
		this.dianziyoujian = dianziyoujian;
	}
	
	/**
	 * 获取：电子邮件
	 */
	public String getDianziyoujian() {
		return dianziyoujian;
	}
			
}
