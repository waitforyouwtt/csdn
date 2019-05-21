package com.yidiandian.service.impl;

import com.yidiandian.dao.LabelDao;
import com.yidiandian.entity.Label;
import com.yidiandian.mapper.LabelMapper;
import com.yidiandian.service.LabelService;
import enums.ResultEnum;
import exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import utils.SnowflakeIdWorker;

import java.util.Optional;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 11:36
 * @Version 1.0
 */
@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    LabelMapper labelMapper;
    @Autowired
    LabelDao labelDao;
    @Autowired
    SnowflakeIdWorker snowflakeIdWorker;
    @Override
    public Label insertLabel(Label label) {
        label.setId(snowflakeIdWorker.nextId()+"");
        return labelMapper.save(label);
    }

    @Override
    public Label updateLable(Label label) {
        return labelMapper.save(label);
    }

    @Override
    public Label findById(int id) {
        if(StringUtils.isEmpty(id)){
            throw new MyException( ResultEnum.PARAMS_IS_NULL.getCode(),ResultEnum.PARAMS_IS_NULL.getMsg());
        }
        Optional<Label> optional = labelMapper.findById(String.valueOf(id));
        if (!optional.isPresent()){
            return null;
        }
        Label label = optional.get();
        return label;
    }
}
