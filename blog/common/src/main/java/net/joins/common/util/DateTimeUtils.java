package net.joins.common.util;

import lombok.val;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

    public static LocalDateTime getDateTime(String dt, String format) {
        val fmt = DateTimeFormatter.ofPattern(format);
        val ldt = LocalDateTime.from(fmt.parse(dt));
        return ldt;
    }

    public static LocalDate getDate(String d, String format) {
        val fmt = DateTimeFormatter.ofPattern(format);
        val ld = LocalDate.from(fmt.parse(d));
        return ld;
    }

    public static LocalTime getTime(String t, String format) {
        val fmt = DateTimeFormatter.ofPattern(format);
        val lt = LocalTime.from(fmt.parse(t));
        return lt;
    }

    public static boolean after(String dt1, String dt2, String format) {
        val std = getDateTime(dt1, format);
        val other = getDateTime(dt2, format);
        return std.isAfter(other);
    }

    public static boolean after(String dt, String format) {
        val std = LocalDateTime.now();
        val other = getDateTime(dt, format);
        return std.isAfter(other);
    }

    public static boolean afterDate(String d1, String d2, String format) {
        val fmt = DateTimeFormatter.ofPattern(format);
        val std = getDate(d1, format);
        val other = getDate(d2, format);
        return std.isAfter(other);
    }

    public static boolean afterTime(String t1, String t2, String format) {
        val fmt = DateTimeFormatter.ofPattern(format);
        val std = getTime(t1, format);
        val other = getTime(t2, format);
        return std.isAfter(other);
    }

}
