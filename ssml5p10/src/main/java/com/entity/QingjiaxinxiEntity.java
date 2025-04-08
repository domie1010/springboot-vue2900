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
 * 请假信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
@TableName("qingjiaxinxi")
public class QingjiaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QingjiaxinxiEntity() {
		
	}
	
	public QingjiaxinxiEntity(T t) {
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
	 * 房间楼层
	 */
					
	private String fangjianlouceng;
	
	/**
	 * 房间编号
	 */
					
	private String fangjianbianhao;
	
	/**
	 * 房间信息
	 */
					
	private String fangjianxinxi;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 老人编号
	 */
					
	private String laorenbianhao;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 请假内容
	 */
					
	private String qingjianeirong;
	
	/**
	 * 请假日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date qingjiariqi;
	
	/**
	 * 请假天数
	 */
					
	private Integer qingjiatianshu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
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
	 * 设置：请假内容
	 */
	public void setQingjianeirong(String qingjianeirong) {
		this.qingjianeirong = qingjianeirong;
	}
	/**
	 * 获取：请假内容
	 */
	public String getQingjianeirong() {
		return qingjianeirong;
	}
	/**
	 * 设置：请假日期
	 */
	public void setQingjiariqi(Date qingjiariqi) {
		this.qingjiariqi = qingjiariqi;
	}
	/**
	 * 获取：请假日期
	 */
	public Date getQingjiariqi() {
		return qingjiariqi;
	}
	/**
	 * 设置：请假天数
	 */
	public void setQingjiatianshu(Integer qingjiatianshu) {
		this.qingjiatianshu = qingjiatianshu;
	}
	/**
	 * 获取：请假天数
	 */
	public Integer getQingjiatianshu() {
		return qingjiatianshu;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
