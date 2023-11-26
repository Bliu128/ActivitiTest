package com.example.activiti.Collection;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.activiti.entity.TestAlarm;
import com.example.activiti.service.TestAlarmService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TestAlarm)表控制层
 *
 * @author makejava
 * @since 2023-11-26 15:36:40
 */
@RestController
@RequestMapping("/testAlarm")
public class TestAlarmController {
    /**
     * 服务对象
     */
    @Resource
    private TestAlarmService testAlarmService;

    /**
     * 分页查询
     *
     * @param testAlarm   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TestAlarm>> queryByPage(TestAlarm testAlarm, PageRequest pageRequest) {
        return ResponseEntity.ok(this.testAlarmService.queryByPage(testAlarm, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById")
    public ResponseEntity<TestAlarm> queryById() {
        return ResponseEntity.ok(this.testAlarmService.queryById(1+""));
    }

    /**
     * 新增数据
     *
     * @param testAlarm 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TestAlarm> add(TestAlarm testAlarm) {
        return ResponseEntity.ok(this.testAlarmService.insert(testAlarm));
    }

    /**
     * 编辑数据
     *
     * @param testAlarm 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TestAlarm> edit(TestAlarm testAlarm) {
        return ResponseEntity.ok(this.testAlarmService.update(testAlarm));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.testAlarmService.deleteById(id));
    }

}

