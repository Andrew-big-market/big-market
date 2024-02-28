package com.andrew.domain.strategy.service.armory;

import com.andrew.domain.strategy.service.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * 策略装配库(兵工厂)，负责初始化策略计算
 */
public interface IStrategyArmory {


    void assembleLotteryStrategy(Long strategyId);

    Integer getRandomAwardId(Long strategyId);
}
