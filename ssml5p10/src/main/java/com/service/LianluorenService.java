package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LianluorenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LianluorenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LianluorenView;


/**
 * 联络人
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:17:05
 */
public interface LianluorenService extends IService<LianluorenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LianluorenVO> selectListVO(Wrapper<LianluorenEntity> wrapper);
   	
   	LianluorenVO selectVO(@Param("ew") Wrapper<LianluorenEntity> wrapper);
   	
   	List<LianluorenView> selectListView(Wrapper<LianluorenEntity> wrapper);
   	
   	LianluorenView selectView(@Param("ew") Wrapper<LianluorenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LianluorenEntity> wrapper);
   	
}

