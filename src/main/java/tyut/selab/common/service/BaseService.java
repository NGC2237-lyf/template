package tyut.selab.geoguard.common.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.io.Serializable;
import java.util.Collection;

/**
 * 基础服务接口，所有Service接口都要继承
 */
public interface BaseService<T> {

    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    boolean insert(T entity);

    /**
     * 插入（批量）
     *
     * @param entityList 实体对象集合
     */
    boolean insertBatch(Collection<T> entityList);

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    boolean updateById(T entity);

    /**
     * 根据 whereEntity 条件，更新记录
     *
     * @param entity  实体对象
     * @param updateWrapper 实体对象封装操作类
     */
    boolean update(T entity, Wrapper<T> updateWrapper);

    /**
     * 根据ID 批量更新
     *
     * @param entityList 实体对象集合
     */
    boolean updateBatchById(Collection<T> entityList);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    T selectById(Serializable id);

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    boolean deleteById(Serializable id);
}
