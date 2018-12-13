package cn.ahjz.dao;

import cn.ahjz.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by wind on 2018/12/3.
 */
@Mapper//与dao层的@Mapper二选一写上即可
@Repository
public interface DeptMapper {

    @Select("SELECT * FROM t_dept WHERE deptid=#{id}")
    Dept getDeptByID(int id);

}
