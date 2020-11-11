package spring.controller;

import org.springframework.beans.factory.annotation.Required;
import spring.entity.Swaggerperson;
import spring.service.SwaggerpersonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Swaggerperson)表控制层
 *
 * @author makejava
 * @since 2020-04-03 18:49:57
 */
@RestController
public class SwaggerpersonController {
    /**
     * 服务对象
     */
    @Resource
    private SwaggerpersonService swaggerpersonService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @Required
    @RequestMapping(value = "getMapping/{id}",method = RequestMethod.GET)
    public Swaggerperson selectOne(Integer num,@PathVariable int id) {
        return this.swaggerpersonService.queryById(id);
    }

}