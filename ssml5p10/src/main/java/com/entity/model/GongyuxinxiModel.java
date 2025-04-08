package com.entity.model;

import com.entity.GongyuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 公寓信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public class GongyuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公寓名称
	 */
	
	private String gongyumingcheng;
		
	/**
	 * 公寓类别
	 */
	
	private String gongyuleibie;
		
	/**
	 * 公寓图片
	 */
	
	private String gongyutupian;
		
	/**
	 * 公寓楼号
	 */
	
	private String gongyulouhao;
		
	/**
	 * 公寓楼管
	 */
	
	private String gongyulouguan;
		
	/**
	 * 公寓位置
	 */
	
	private String gongyuweizhi;
		
	/**
	 * 备注说明
	 */
	
	private String beizhushuoming;
				
	
	/**
	 * 设置：公寓名称
	 */
	 
	public void setGongyumingcheng(String gongyumingcheng) {
		this.gongyumingcheng = gongyumingcheng;
	}
	
	/**
	 * 获取：公寓名称
	 */
	public String getGongyumingcheng() {
		return gongyumingcheng;
	}
				
	
	/**
	 * 设置：公寓类别
	 */
	 
	public void setGongyuleibie(String gongyuleibie) {
		this.gongyuleibie = gongyuleibie;
	}
	
	/**
	 * 获取：公寓类别
	 */
	public String getGongyuleibie() {
		return gongyuleibie;
	}
				
	
	/**
	 * 设置：公寓图片
	 */
	 
	public void setGongyutupian(String gongyutupian) {
		this.gongyutupian = gongyutupian;
	}
	
	/**
	 * 获取：公寓图片
	 */
	public String getGongyutupian() {
		return gongyutupian;
	}
				
	
	/**
	 * 设置：公寓楼号
	 */
	 
	public void setGongyulouhao(String gongyulouhao) {
		this.gongyulouhao = gongyulouhao;
	}
	
	/**
	 * 获取：公寓楼号
	 */
	public String getGongyulouhao() {
		return gongyulouhao;
	}
				
	
	/**
	 * 设置：公寓楼管
	 */
	 
	public void setGongyulouguan(String gongyulouguan) {
		this.gongyulouguan = gongyulouguan;
	}
	
	/**
	 * 获取：公寓楼管
	 */
	public String getGongyulouguan() {
		return gongyulouguan;
	}
				
	
	/**
	 * 设置：公寓位置
	 */
	 
	public void setGongyuweizhi(String gongyuweizhi) {
		this.gongyuweizhi = gongyuweizhi;
	}
	
	/**
	 * 获取：公寓位置
	 */
	public String getGongyuweizhi() {
		return gongyuweizhi;
	}
				
	
	/**
	 * 设置：备注说明
	 */
	 
	public void setBeizhushuoming(String beizhushuoming) {
		this.beizhushuoming = beizhushuoming;
	}
	
	/**
	 * 获取：备注说明
	 */
	public String getBeizhushuoming() {
		return beizhushuoming;
	}
			
}
