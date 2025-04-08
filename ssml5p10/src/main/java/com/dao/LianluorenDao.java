package com.dao;

import com.entity.LianluorenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LianluorenVO;
import com.entity.view.LianluorenView;


/**
 * 联络人
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public interface LianluorenDao extends BaseMapper<LianluorenEntity> {
	
	List<LianluorenVO> selectListVO(@Param("ew") Wrapper<LianluorenEntity> wrapper);
	
	LianluorenVO selectVO(@Param("ew") Wrapper<LianluorenEntity> wrapper);
	
	List<LianluorenView> selectListView(@Param("ew") Wrapper<LianluorenEntity> wrapper);

	List<LianluorenView> selectListView(Pagination page,@Param("ew") Wrapper<LianluorenEntity> wrapper);
	
	LianluorenView selectView(@Param("ew") Wrapper<LianluorenEntity> wrapper);
	
}
