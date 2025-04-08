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
 * 联络人
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
@TableName("lianluoren")
public class LianluorenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LianluorenEntity() {
		
	}
	
	public LianluorenEntity(T t) {
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
	 * 老人编号
	 */
					
	private String laorenbianhao;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 电子邮件
	 */
					
	private String dianziyoujian;
	
	/**
	 * 家庭住址
	 */
					
	private String jiatingzhuzhi;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 电话
	 */
					
	private String dianhua;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 联系地址
	 */
					
	private String lianxidizhi;
	
	/**
	 * 备注说明
	 */
					
	private String beizhushuoming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：电话
	 */
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
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
	 * 设置：联系地址
	 */
	public void setLianxidizhi(String lianxidizhi) {
		this.lianxidizhi = lianxidizhi;
	}
	/**
	 * 获取：联系地址
	 */
	public String getLianxidizhi() {
		return lianxidizhi;
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
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
