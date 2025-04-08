package com.dao;

import com.entity.FangkejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkejiluVO;
import com.entity.view.FangkejiluView;


/**
 * 访客记录
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public interface FangkejiluDao extends BaseMapper<FangkejiluEntity> {
	
	List<FangkejiluVO> selectListVO(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	
	FangkejiluVO selectVO(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	
	List<FangkejiluView> selectListView(@Param("ew") Wrapper<FangkejiluEntity> wrapper);

	List<FangkejiluView> selectListView(Pagination page,@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	
	FangkejiluView selectView(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	
}
