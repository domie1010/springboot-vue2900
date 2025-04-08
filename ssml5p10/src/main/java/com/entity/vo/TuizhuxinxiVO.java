package com.entity.vo;

import com.entity.TuizhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 退住信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public class TuizhuxinxiVO  implements Serializable {
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
	 * 房间楼层
	 */
	
	private String fangjianlouceng;
		
	/**
	 * 房间编号
	 */
	
	private String fangjianbianhao;
		
	/**
	 * 床位
	 */
	
	private Integer chuangwei;
		
	/**
	 * 老人编号
	 */
	
	private String laorenbianhao;
		
	/**
	 * 老人姓名
	 */
	
	private String laorenxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 办理日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date banliriqi;
		
	/**
	 * 退住说明
	 */
	
	private String tuizhushuoming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：办理日期
	 */
	 
	public void setBanliriqi(Date banliriqi) {
		this.banliriqi = banliriqi;
	}
	
	/**
	 * 获取：办理日期
	 */
	public Date getBanliriqi() {
		return banliriqi;
	}
				
	
	/**
	 * 设置：退住说明
	 */
	 
	public void setTuizhushuoming(String tuizhushuoming) {
		this.tuizhushuoming = tuizhushuoming;
	}
	
	/**
	 * 获取：退住说明
	 */
	public String getTuizhushuoming() {
		return tuizhushuoming;
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
