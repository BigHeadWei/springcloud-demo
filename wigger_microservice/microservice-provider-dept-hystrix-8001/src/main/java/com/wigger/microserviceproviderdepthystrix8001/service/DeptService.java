package com.wigger.microserviceproviderdepthystrix8001.service;

import com.wigger.microserviceapi.entity.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
