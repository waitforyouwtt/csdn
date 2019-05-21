package com.yidiandian.dao;
import com.yidiandian.entity.Label;
import org.apache.ibatis.annotations.Mapper;
/**
 * @Author: 一点点
 * @Date: 2019/5/18 11:34
 * @Version 1.0
 */
@Mapper
public interface LabelDao {
    Label findAll();
}