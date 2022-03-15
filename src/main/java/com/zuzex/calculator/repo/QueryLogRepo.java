package com.zuzex.calculator.repo;

import com.zuzex.calculator.entity.QueryLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryLogRepo extends JpaRepository<QueryLog, Long> {
}
