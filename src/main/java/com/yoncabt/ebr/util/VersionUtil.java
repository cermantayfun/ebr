package com.yoncabt.ebr.util;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myururdurmaz
 */
public class VersionUtil {

    public static final long WAR_DATE = 1000L * 1467210571;
    public static final Date START_DATE = new Date();
    public static final String GIT_ID = "ed68006a173444504f39272c0799b12f972e13f5";

    public static void print() {
        System.out.println("WAR_DATE :" + new Date(WAR_DATE));
        System.out.println("START_DATE :" + START_DATE);
        System.out.println("GIT_ID :" + GIT_ID);
    }

}
