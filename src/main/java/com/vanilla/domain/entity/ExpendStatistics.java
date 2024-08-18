package com.vanilla.domain.entity;

import com.vanilla.domain.entity.superclass.CuDate;

public class ExpendStatistics extends CuDate {
    private Long statisticsId;

    private String memberId;

    private int statisticsYear;
    private int statisticsMonth;

    private String statisticsMemo;
    private Long sumFixed;
    private Long sumClassification;
    private Long sumSpend;
}
