package fun.fengwk.automapper.processor.demo;

import fun.fengwk.automapper.annotation.AutoMapper;

import java.util.List;

/**
 * @author fengwk
 */
@AutoMapper
public interface DemoMapper extends BaseMapper<DemoDO> {

    DemoDO findByName(@org.apache.ibatis.annotations.Param("name") String name);

}
