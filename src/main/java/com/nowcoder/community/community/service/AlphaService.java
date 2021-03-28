package com.nowcoder.community.community.service;

import com.nowcoder.community.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;


    public AlphaService() {
//        System.out.println("实例化AlphaService方法");
    }

//    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService方法");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("销毁AlphaService方法");
    }

    public String find(){
        String s = alphaDao.Select();
        return s;
    }
}
