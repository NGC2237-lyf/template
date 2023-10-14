package tyut.selab.geoguard.common.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;
import tyut.selab.geoguard.common.service.BaseService;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;

/**
 * 基础服务类，所有Service都要继承
 */
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T>  implements BaseService<T> {
    @Resource
    protected M baseDao;

    protected static boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    @Override
    public boolean insert(T entity) {
        return BaseServiceImpl.retBool(baseDao.insert(entity));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertBatch(Collection<T> entityList) {
        return insertBatch(entityList);
    }

    @Override
    public boolean updateById(T entity) {
        return BaseServiceImpl.retBool(baseDao.updateById(entity));
    }

    @Override
    public boolean update(T entity, Wrapper<T> updateWrapper) {
        return BaseServiceImpl.retBool(baseDao.update(entity, updateWrapper));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateBatchById(Collection<T> entityList) {
        return updateBatchById(entityList);
    }

    @Override
    public T selectById(Serializable id) {
        return baseDao.selectById(id);
    }

    @Override
    public boolean deleteById(Serializable id) {
        return SqlHelper.retBool(baseDao.deleteById(id));
    }

}
