package com.nowcoder.community.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")        //bin的名字
public class AlphaDaoHibernateImpl implements AlphaDao {

    @Override
    public String Select() {
        return "Hibernate";
    }
}
