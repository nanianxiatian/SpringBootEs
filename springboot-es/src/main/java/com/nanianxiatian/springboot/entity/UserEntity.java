package com.nanianxiatian.springboot.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author nanianxiatian
 * @date 2021-2-23 12:11
 */
@Document(indexName = "test_index")
@Data
public class UserEntity {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Integer sex;
}
