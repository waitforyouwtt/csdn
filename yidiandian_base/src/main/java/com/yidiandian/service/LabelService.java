package com.yidiandian.service;
import com.yidiandian.entity.Label;
/**
 * @Author: 一点点
 * @Date: 2019/5/18 11:35
 * @Version 1.0
 */
public interface LabelService {
    //新增
    Label insertLabel(Label label);
    //修改
    Label updateLable(Label label);
    //查询
    Label findById(int id);
}
