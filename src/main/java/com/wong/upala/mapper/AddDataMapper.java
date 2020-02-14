package com.wong.upala.mapper;

import com.wong.upala.entity.Position;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

/********************************
 *  @program position
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-22 15:02
 *  @description 添加城市信息mapper
 ********************************/

@Mapper
public interface AddDataMapper {

    Integer addData(List<Position> param);

    List<LinkedHashMap> queryProvince(@Param("parentId") Integer parentId);

}
