package com.entity.model;

import com.entity.JiankangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健康信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public class JiankangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公寓楼号
	 */
	
	private String gongyulouhao;
		
	/**
	 * 公寓类别
	 */
	
	private String gongyuleibie;
		
	/**
	 * 房间楼层
	 */
	
	private String fangjianlouceng;
		
	/**
	 * 房间编号
	 */
	
	private String fangjianbianhao;
		
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
	 * 病例信息
	 */
	
	private String binglixinxi;
		
	/**
	 * 服药信息
	 */
	
	private String fuyaoxinxi;
		
	/**
	 * 异常处理
	 */
	
	private String yichangchuli;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
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
	 * 设置：病例信息
	 */
	 
	public void setBinglixinxi(String binglixinxi) {
		this.binglixinxi = binglixinxi;
	}
	
	/**
	 * 获取：病例信息
	 */
	public String getBinglixinxi() {
		return binglixinxi;
	}
				
	
	/**
	 * 设置：服药信息
	 */
	 
	public void setFuyaoxinxi(String fuyaoxinxi) {
		this.fuyaoxinxi = fuyaoxinxi;
	}
	
	/**
	 * 获取：服药信息
	 */
	public String getFuyaoxinxi() {
		return fuyaoxinxi;
	}
				
	
	/**
	 * 设置：异常处理
	 */
	 
	public void setYichangchuli(String yichangchuli) {
		this.yichangchuli = yichangchuli;
	}
	
	/**
	 * 获取：异常处理
	 */
	public String getYichangchuli() {
		return yichangchuli;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
			
}
