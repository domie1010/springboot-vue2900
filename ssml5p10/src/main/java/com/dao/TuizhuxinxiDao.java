package com.dao;

import com.entity.TuizhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuizhuxinxiVO;
import com.entity.view.TuizhuxinxiView;


/**
 * 退住信息
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public interface TuizhuxinxiDao extends BaseMapper<TuizhuxinxiEntity> {
	
	List<TuizhuxinxiVO> selectListVO(@Param("ew") Wrapper<TuizhuxinxiEntity> wrapper);
	
	TuizhuxinxiVO selectVO(@Param("ew") Wrapper<TuizhuxinxiEntity> wrapper);
	
	List<TuizhuxinxiView> selectListView(@Param("ew") Wrapper<TuizhuxinxiEntity> wrapper);

	List<TuizhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuizhuxinxiEntity> wrapper);
	
	TuizhuxinxiView selectView(@Param("ew") Wrapper<TuizhuxinxiEntity> wrapper);
	
}
