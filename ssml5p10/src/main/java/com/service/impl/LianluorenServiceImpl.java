package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LianluorenDao;
import com.entity.LianluorenEntity;
import com.service.LianluorenService;
import com.entity.vo.LianluorenVO;
import com.entity.view.LianluorenView;

@Service("lianluorenService")
public class LianluorenServiceImpl extends ServiceImpl<LianluorenDao, LianluorenEntity> implements LianluorenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LianluorenEntity> page = this.selectPage(
                new Query<LianluorenEntity>(params).getPage(),
                new EntityWrapper<LianluorenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LianluorenEntity> wrapper) {
		  Page<LianluorenView> page =new Query<LianluorenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LianluorenVO> selectListVO(Wrapper<LianluorenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LianluorenVO selectVO(Wrapper<LianluorenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LianluorenView> selectListView(Wrapper<LianluorenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LianluorenView selectView(Wrapper<LianluorenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
