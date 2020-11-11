package spring.dao;

import org.apache.ibatis.annotations.Mapper;
import spring.entity.Swaggerperson;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Swaggerperson)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-03 18:49:56
 */
@Mapper
public interface SwaggerpersonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Swaggerperson queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Swaggerperson> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param swaggerperson 实例对象
     * @return 对象列表
     */
    List<Swaggerperson> queryAll(Swaggerperson swaggerperson);

    /**
     * 新增数据
     *
     * @param swaggerperson 实例对象
     * @return 影响行数
     */
    int insert(Swaggerperson swaggerperson);

    /**
     * 修改数据
     *
     * @param swaggerperson 实例对象
     * @return 影响行数
     */
    int update(Swaggerperson swaggerperson);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}