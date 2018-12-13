package cn.ahjz.service;

import cn.ahjz.model.Dept;
import org.springframework.stereotype.Service;

/**
 * Created by wind on 2018/12/4.
 */

public interface DeptService {

    Dept getDeptByID(int id);
}
