package com.migration.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Job {

    public String jobID;

    public String startFlag;

    public String serviceID;

    public Integer migrationMode;

    public HashMap<String, String> routeMap;

    public long startTime;

    public long endTime;

    public long systemDelay;

    public long transDelay;

    public long wholeTime;
}
