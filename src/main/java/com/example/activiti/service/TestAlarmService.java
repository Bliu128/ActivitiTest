package com.example.activiti.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.activiti.entity.TestAlarm;
import org.springframework.data.domain.PageRequest;

/**
 * (TestAlarm)表服务接口
 *
 * @author makejava
 * @since 2023-11-26 15:36:45
 */
public interface TestAlarmService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TestAlarm queryById(String id);

    /**
     * 分页查询
     *
     * @param testAlarm   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<TestAlarm> queryByPage(TestAlarm testAlarm, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param testAlarm 实例对象
     * @return 实例对象
     */
    TestAlarm insert(TestAlarm testAlarm);

    /**
     * 修改数据
     *
     * @param testAlarm 实例对象
     * @return 实例对象
     */
    TestAlarm update(TestAlarm testAlarm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}
