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


import com.dao.FangkejiluDao;
import com.entity.FangkejiluEntity;
import com.service.FangkejiluService;
import com.entity.vo.FangkejiluVO;
import com.entity.view.FangkejiluView;

@Service("fangkejiluService")
public class FangkejiluServiceImpl extends ServiceImpl<FangkejiluDao, FangkejiluEntity> implements FangkejiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkejiluEntity> page = this.selectPage(
                new Query<FangkejiluEntity>(params).getPage(),
                new EntityWrapper<FangkejiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkejiluEntity> wrapper) {
		  Page<FangkejiluView> page =new Query<FangkejiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangkejiluVO> selectListVO(Wrapper<FangkejiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangkejiluVO selectVO(Wrapper<FangkejiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangkejiluView> selectListView(Wrapper<FangkejiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangkejiluView selectView(Wrapper<FangkejiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
