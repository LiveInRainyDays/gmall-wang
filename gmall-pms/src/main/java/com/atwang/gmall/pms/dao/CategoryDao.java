package com.atwang.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangdongsheng
 * @email wds9920226@126.com
 * @date 2020-03-08 21:47:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
