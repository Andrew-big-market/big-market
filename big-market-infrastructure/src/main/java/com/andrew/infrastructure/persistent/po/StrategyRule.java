package com.andrew.infrastructure.persistent.po;

import lombok.Data;

/**
 * 策略规则
 */
@Data
public class StrategyRule {

    /**
     * 自增ID
     */
    private Long id;
    /**
     * 抽奖策略ID
     */
    private Long strategyId;
    /**
     * 抽奖奖品ID
     */
    private Long awardId;
    /**
     * 抽象规则类型：1-策略规则，2-奖品规则
     */
    private Long ruleType;
    /**
     * 抽奖规则类型【rule_random - 随机值计算、rule_lock - 抽奖几次后解锁、rule_luck_award - 幸运奖(兜底奖品)】
     */
    private Long ruleModel;
    /**
     * 抽奖规则比值
     */
    private Long ruleValue;
    /**
     * 抽奖规则描述
     */
    private Long ruleDesc;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新时间
     */
    private Long updateTime;
}
