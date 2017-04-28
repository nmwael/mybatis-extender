package org.ops4j.mybatis.extender.sample.mappers;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by nmw on 26-04-2017.
 */
public interface SampleAnnotationMapper {

    @Select("SELECT TOP 1 TABLE_NAME FROM INFORMATION_SCHEMA.TABLES")
    public String sayHello();

    @Select("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES")
    public List<String> getAllTables();

}
