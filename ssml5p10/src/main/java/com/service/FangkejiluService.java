package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangkejiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangkejiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkejiluView;


/**
 * 访客记录
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public interface FangkejiluService extends IService<FangkejiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangkejiluVO> selectListVO(Wrapper<FangkejiluEntity> wrapper);
   	
   	FangkejiluVO selectVO(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
   	
   	List<FangkejiluView> selectListView(Wrapper<FangkejiluEntity> wrapper);
   	
   	FangkejiluView selectView(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangkejiluEntity> wrapper);
   	
}

