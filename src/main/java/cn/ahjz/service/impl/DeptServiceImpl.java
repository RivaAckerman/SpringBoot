package cn.ahjz.service.impl;

import cn.ahjz.dao.DeptMapper;
import cn.ahjz.model.Dept;
import cn.ahjz.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wind on 2018/12/4.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptByID(int id) {

        Dept dept = deptMapper.getDeptByID(id);

        return dept;
    }
}
