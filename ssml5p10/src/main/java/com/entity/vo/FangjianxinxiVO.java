package com.entity.vo;

import com.entity.FangjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 房间信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public class FangjianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公寓名称
	 */
	
	private String gongyumingcheng;
		
	/**
	 * 公寓楼号
	 */
	
	private String gongyulouhao;
		
	/**
	 * 公寓类别
	 */
	
	private String gongyuleibie;
		
	/**
	 * 公寓位置
	 */
	
	private String gongyuweizhi;
		
	/**
	 * 房间编号
	 */
	
	private String fangjianbianhao;
		
	/**
	 * 房间楼层
	 */
	
	private String fangjianlouceng;
		
	/**
	 * 床位
	 */
	
	private Integer chuangwei;
		
	/**
	 * 住宿费
	 */
	
	private Integer zhusufei;
		
	/**
	 * 房间信息
	 */
	
	private String fangjianxinxi;
				
	
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
	 * 设置：房间编号
	 */
	 
	public void setFangjianbianhao(String fangjianbianhao) {
		this.fangjianbianhao = fangjianbianhao;
	}
	
	/**
	 * 获取：房间编号
	 */
	public String getFangjianbianhao() {
		return fangjianbianhao;
	}
				
	
	/**
	 * 设置：房间楼层
	 */
	 
	public void setFangjianlouceng(String fangjianlouceng) {
		this.fangjianlouceng = fangjianlouceng;
	}
	
	/**
	 * 获取：房间楼层
	 */
	public String getFangjianlouceng() {
		return fangjianlouceng;
	}
				
	
	/**
	 * 设置：床位
	 */
	 
	public void setChuangwei(Integer chuangwei) {
		this.chuangwei = chuangwei;
	}
	
	/**
	 * 获取：床位
	 */
	public Integer getChuangwei() {
		return chuangwei;
	}
				
	
	/**
	 * 设置：住宿费
	 */
	 
	public void setZhusufei(Integer zhusufei) {
		this.zhusufei = zhusufei;
	}
	
	/**
	 * 获取：住宿费
	 */
	public Integer getZhusufei() {
		return zhusufei;
	}
				
	
	/**
	 * 设置：房间信息
	 */
	 
	public void setFangjianxinxi(String fangjianxinxi) {
		this.fangjianxinxi = fangjianxinxi;
	}
	
	/**
	 * 获取：房间信息
	 */
	public String getFangjianxinxi() {
		return fangjianxinxi;
	}
			
}
