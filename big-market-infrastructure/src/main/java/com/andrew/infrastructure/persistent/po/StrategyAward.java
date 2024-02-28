package com.andrew.infrastructure.persistent.po;

import lombok.Data;

@Data
public class StrategyAward {


    /**
     * 自增id
     */
    private Long id;
    /**
     * 抽奖策略ID
     */
    private Long strategyId;
    /**
     * 抽奖奖品ID-内部轮转使用
     */
    private Long awardId;
    /**
     * 抽奖奖品标题
     */
    private Long awardTitle;
    /**
     * 抽奖奖品副标题
     */
    private Long awardSubTitle;
    /**
     * 奖品库存总量
     */
    private Long awardCount;
    /**
     * 奖品剩余库存
     */
    private Long awardCountSurplus;
    /**
     * 奖品中奖概率
     */
    private Long awardRate;
    /**
     * 规则模型，rule配置的模型同步到此表便于使用
     */
    private Long ruleModels;
    /**
     * 排序
     */
    private Long sort;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新时间
     */
    private Long updateTime;
}
