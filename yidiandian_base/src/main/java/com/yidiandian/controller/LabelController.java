package com.yidiandian.controller;
import com.yidiandian.entity.Label;
import com.yidiandian.service.LabelService;
import entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 11:46
 * @Version 1.0
 */
@RestController
public class LabelController {
    private static Logger logger = LoggerFactory.getLogger(LabelController.class);

    @Autowired
    LabelService labelService;
    @GetMapping("/{id}")
    public ResponseEntity<Result> findByParams(@PathVariable ("id") int id){
        return new ResponseEntity(labelService.findById(id), HttpStatus.OK);
    }
    //  return new ResponseEntity(lovmCategoryService.queryByParams(category,atrributeCode,valueCode), HttpStatus.OK);


}
