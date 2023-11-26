package com.example.activiti.service.Impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.activiti.dao.TestAlarmDao;
import com.example.activiti.entity.TestAlarm;
import com.example.activiti.service.TestAlarmService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TestAlarm)表服务实现类
 *
 * @author makejava
 * @since 2023-11-26 15:36:48
 */
@Service
public class TestAlarmServiceImpl implements TestAlarmService {
    @Resource
    private TestAlarmDao testAlarmDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TestAlarm queryById(String id) {
        return this.testAlarmDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param testAlarm   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<TestAlarm> queryByPage(TestAlarm testAlarm, PageRequest pageRequest) {
        long total = this.testAlarmDao.count(testAlarm);
        return null;
    }

    /**
     * 新增数据
     *
     * @param testAlarm 实例对象
     * @return 实例对象
     */
    @Override
    public TestAlarm insert(TestAlarm testAlarm) {
        this.testAlarmDao.insert(testAlarm);
        return testAlarm;
    }

    /**
     * 修改数据
     *
     * @param testAlarm 实例对象
     * @return 实例对象
     */
    @Override
    public TestAlarm update(TestAlarm testAlarm) {
        this.testAlarmDao.update(testAlarm);
        return this.queryById(testAlarm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.testAlarmDao.deleteById(id) > 0;
    }
}
