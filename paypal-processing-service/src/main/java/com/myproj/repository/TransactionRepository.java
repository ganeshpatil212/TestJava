package com.myproj.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myproj.entity.TransactionEntity;

@Repository
public class TransactionRepository {

    private final NamedParameterJdbcTemplate namedJdbc;

    @Autowired
    public TransactionRepository(NamedParameterJdbcTemplate namedJdbc) {
        this.namedJdbc = namedJdbc;
    }


    public List<TransactionEntity> getPendingTransactions(int pendingStatusId) {

        String sql = """
                SELECT t.* 
                FROM transaction t
                WHERE transaction_status_id=2
                AND t.retry_count < 3
                """;

        Map<String, Object> params = new HashMap<>();
        params.put("transaction_status_id", pendingStatusId);
        System.out.println("Executing SQL: " + sql + " with params: " + params);
        return namedJdbc.query(
                sql,
                params,
                new BeanPropertyRowMapper<>(TransactionEntity.class)
        );
    }
}
