package com.wigger.microserviceproviderdept8002.service.impl;

import com.wigger.microserviceapi.entity.Dept;
import com.wigger.microserviceproviderdept8002.dao.DeptDao;
import com.wigger.microserviceproviderdept8002.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
