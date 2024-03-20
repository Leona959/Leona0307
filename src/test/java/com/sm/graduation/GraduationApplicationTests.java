package com.sm.graduation;

import com.sm.graduation.health.pojo.HealthRecords;
import com.sm.graduation.health.service.HealthRecordsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GraduationApplicationTests {

    @Autowired
    HealthRecordsService healthRecordsService;

    @Test
    void contextLoads() {
        final List<HealthRecords> healthRecords = healthRecordsService.listAll(null);
        System.out.println(healthRecords);
    }
}
