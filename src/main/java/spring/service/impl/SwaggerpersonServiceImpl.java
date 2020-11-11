package spring.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import spring.entity.Swaggerperson;
import spring.dao.SwaggerpersonDao;
import spring.service.SwaggerpersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Swaggerperson)表服务实现类
 *
 * @author makejava
 * @since 2020-04-03 18:49:56
 */
@Service("swaggerpersonService")
public class SwaggerpersonServiceImpl implements SwaggerpersonService {
    @Autowired
    private SwaggerpersonDao swaggerpersonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Swaggerperson queryById(Integer id) {
        return this.swaggerpersonDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Swaggerperson> queryAllByLimit(int offset, int limit) {
        return this.swaggerpersonDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param swaggerperson 实例对象
     * @return 实例对象
     */
    @Override
    public Swaggerperson insert(Swaggerperson swaggerperson) {
        this.swaggerpersonDao.insert(swaggerperson);
        return swaggerperson;
    }

    /**
     * 修改数据
     *
     * @param swaggerperson 实例对象
     * @return 实例对象
     */
    @Override
    public Swaggerperson update(Swaggerperson swaggerperson) {
        this.swaggerpersonDao.update(swaggerperson);
        return this.queryById(swaggerperson.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.swaggerpersonDao.deleteById(id) > 0;
    }
}