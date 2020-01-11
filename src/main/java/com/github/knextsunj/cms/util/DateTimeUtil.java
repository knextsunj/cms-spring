/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.knextsunj.cms.util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kk
 */
public class DateTimeUtil {
    
    public static LocalDate buildLocalDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
       return LocalDate.parse(dateString, formatter);
    }
    
    public static String buildDateString(Date date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       return date.toLocalDate().format(dateTimeFormatter);
    }
    
    public static LocalDateTime getPresentDateTimeInUTC() {
    	return ZonedDateTime.now(ZoneId.of("UTC")).toLocalDateTime();
    }
}
