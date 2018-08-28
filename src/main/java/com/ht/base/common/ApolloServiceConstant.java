package com.ht.base.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhengyi
 * @date 2018/7/19 4:34 PM
 **/
@Getter
@AllArgsConstructor
public class ApolloServiceConstant {
    public static final String ELASTIC = "tiku.elastic-6.3.1";
    public static final String RABBITMQ = "tiku.rabbitmq";
    public static final String MONGO = "tiku.mongo-cluster";
    public static final String TIKU_DB = "tiku.db";
}