package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 房间信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
@TableName("fangjianxinxi")
public class FangjianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangjianxinxiEntity() {
		
	}
	
	public FangjianxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 公寓编号
	 */
					
	private String gongyubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：公寓编号
	 */
	public void setGongyubianhao(String gongyubianhao) {
		this.gongyubianhao = gongyubianhao;
	}
	/**
	 * 获取：公寓编号
	 */
	public String getGongyubianhao() {
		return gongyubianhao;
	}
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
