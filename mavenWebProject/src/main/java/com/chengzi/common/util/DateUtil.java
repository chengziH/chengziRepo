package com.chengzi.common.util;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * 
 * 
 * @Filename DateUtil.java
 * 
 * @Description
 * 
 * @Version 1.0
 * 
 * @Author zjl
 * 
 * @Email zjialin@yiji.com
 * 
 * @History <li>Author: zjil</li> <li>Date: 2013-6-13</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 * 
 */
public class DateUtil {
	
//	protected static final Logger	logger					= LoggerFactory
//		.getLogger(DateUtil.class);
	/**
     * 完整时间 yyyy-MM-dd HH:mm:ss
     */
    public static final String simple = "yyyy-MM-dd HH:mm:ss";
    /**
     * 年月日 yyyy/MM/dd
     */
    public static final String dtSimpleSlash = "yyyy/MM/dd";
	
	/** 完整时间 yyyy-MM-dd HH:00:00 */
	public static final String		dtSimpleYmdh			= "yyyy-MM-dd HH:00:00";
	
	/** 完整时间 yyyy-MM-ddHH:00:00 */
	public static final String		dtSimpleYmdhNoSpace		= "yyyy-MM-ddHH:00:00";
	
	public static final String		dtSimpleYmdhms			= "yyyy-MM-dd HH:mm:ss";

	/**
	 * 精确到毫秒
	 */
	public static final String		dtSimpleYmdhmsSSS		= "yyyy-MM-dd HH:mm:ss:SSS";
	
	private static SimpleDateFormat	format					= new SimpleDateFormat(dtSimpleYmdhms);
	
	public static final String		dtSimpleYmdhChinese		= "yyyy年MM月dd日 HH:00:00";
	
	public static final String		mdhChinese				= "yyyy年MM月dd日";
	
	public static final String		ymChinese				= "yyyy年MM月";
	
	public static final String		MdHmsChinese			= "MM月dd日   HH:mm:ss";
	
	/** 完整时间 yyyy-MM-dd */
	public static final String		dtSimple				= "yyyy-MM-dd";
	
	/** 完整时间 yyyy/MM/dd */
	public static final String		dtSimpleYmdBySprit		= "yyyy/MM/dd";
	/** 完整时间 yyyy/MM/dd 12:20:36 */
	public static final String		dtSimpleYmdhmsBySprit	= "yyyy/MM/dd HH:mm:ss";
	
	public static final String		dtSimpleYm				= "yyyy/MM";
	
	public static final String		dtSimpleYm2				= "yyyy-MM";
	
	public static final String		dtSimpleMd				= "MM/dd";

	public static final String		dtSimplePYZX				= "yyyyMMdd HH:mm:ss";

	public static final String pattern5 = "yyyyMMddHHmmss";
	
	 /**
     * 年-月-日 小时:分钟 yyyy-MM-dd HH:mm
     */
    public static final String simpleFormat = "yyyy-MM-dd HH:mm";

	private static SimpleDateFormat	longSdf					= new SimpleDateFormat("yyyy-MM-dd");


	public static final String simpleFormatPattern5(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(pattern5).format(date);
	}
	
	public static final String simpleFormatYmdhNoSpace(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYmdhNoSpace).format(date);
	}
	
	public static String simpleMdHmsChinese(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(MdHmsChinese).format(date);
	}
	
	public static final String formatDay(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimple).format(date);
	}
	
	public static String simpleDateFormatChinese(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYmdhChinese).format(date);
	}
	
	public static String simpleDateFormatmdhChinese(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(mdhChinese).format(date);
	}
	
	public static String simpleDateFormatYmChinese(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(ymChinese).format(date);
	}
	
	/**
	 * yyyy-MM-dd HH:00:00
	 * 
	 * @param date
	 * @return
	 */
	public static final String simpleFormatYmdh(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYmdh).format(date);
	}
	
	public static final String simpleFormatYmdhms(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYmdhms).format(date);
	}

	public static final String simpleFormatYmdhmsSSS(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYmdhmsSSS).format(date);
	}
	
	public static final String dtSimpleYmdhmsBySprit(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYmdhmsBySprit).format(date);
	}
	
	public static final String dtSimple(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimple).format(date);
	}
	
	public static final String dtSimpleYmdBySprit(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYmdBySprit).format(date);
	}
	
	public static final String dtSimpleYm(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYm).format(date);
	}
	
	public static final String dtSimpleYm2(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleYm2).format(date);
	}
	
	public static final String dtSimpleMd(Date date) {
		if (date == null) {
			return "";
		}
		return getFormat(dtSimpleMd).format(date);
	}
	
	/**
	 * 获取指定时间的前一天时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getBeforeDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		date = calendar.getTime();
		return date;
	}
	
	/**
	 * 获取指定时间的后一天时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getAfterDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		date = calendar.getTime();
		return date;
	}
	
	/**
	 * 获取一周前的日期(当前日期往前推7天)
	 * 
	 * @param date
	 * @return
	 */
	public static Date getWeekdayBeforeDate(Date date) {
		long beforeTime = (date.getTime() / 1000) - 24 * 60 * 60 * 7;
		date.setTime(beforeTime * 1000);
		return date;
	}

	/**
	 * 获取一周后的日期(当前日期往后推7天)
	 *
	 * @param date
	 * @return
	 */
	public static Date getWeekdayAfterDate(Date date) {
		long afterTime = (date.getTime() / 1000) + 24 * 60 * 60 * 7;
		date.setTime(afterTime * 1000);
		return date;
	}

	/**
	 * 获取一周前的日期(当前日期往前推7天)
	 * 
	 * @param date
	 * @return
	 */
	public static String getWeekdayBeforeNow(Date date) {
		java.text.Format formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		long beforeTime = (date.getTime() / 1000) - 24 * 60 * 60 * 7;
		date.setTime(beforeTime * 1000);
		return formatter.format(date);
	}
	
	/**
	 * 获取一月前的日期(当前日期往前推7天)
	 * 
	 * @param date
	 * @return
	 */
	public static Date getMonthdayBeforeDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -1);
		date = calendar.getTime();
		return date;
	}
	
	/**
	 * 获取一月前的日期(当前日期往前推7天)
	 * 
	 * @param date
	 * @return
	 */
	public static String getMonthdayBeforeNow(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -1);
		date = calendar.getTime();
		java.text.Format formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(date);
	}

	/**
	 * 获取下月最后一天时间
	 */
	public static Date getNextMonthDate(Date date) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date);
		calendar1.add(Calendar.MONTH, 2);
		calendar1.set(Calendar.DATE, 0);
		return calendar1.getTime();
	}

	
	/**
	 * 获取指定时间的前三月时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getThreeMonthDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DATE);
		calendar.set(Calendar.DATE, day + 1);
		calendar.add(Calendar.MONTH, -3);
		date = calendar.getTime();
		return date;
	}
	
	/**
	 * 获取指定时间的前六月时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getSixMonthDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -6);
		date = calendar.getTime();
		return date;
	}
	
	/***
	 * 获取指定时间所在月份第一天字符串
	 * @param date
	 * @return
	 */
	public static String getCurrMonthFirstDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, 01);
		java.text.Format formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(calendar.getTime());
	}
	
	/***
	 * 获取指定时间所在月份的上个月第一天字符串
	 * @param date
	 * @return
	 */
	public static String getLastMonthFirstDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, 01);
		java.text.Format formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(calendar.getTime());
	}
	
	/**
	 * 转换日期yyyy-MM-dd hh:mm:ss
	 * @param source
	 * @return
	 * @throws
	 */
	public static Date parse(String source, Date defaultDate) {
		try {
			return format.parse(source);
		} catch (java.text.ParseException e) {
//			logger.error(e.getMessage(), e);
			return defaultDate;
		}
	}
	
	/**
	 * 转换日期yyyy-MM-dd hh:mm:ss 或 yyyy-MM-dd
	 * @param source
	 * @return
	 * @throws
	 */
	public static Date parse(String source) {
		
		if (source.length() == 10) {
			return parse(source + " 00:00:00", new Date());
		} else {
			return parse(source, new Date());
		}
		
	}
	
	/**
	 * 日期加月
	 * @param date
	 * @param months
	 * @return
	 */
	public static Date getDateByMonth(Date date, int months) {
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, months);
		return calendar.getTime();
	}
	
	public static String getDateByLongStr(String unixDate) {
		SimpleDateFormat fm1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long unixLong = 0;
		String date = "";
		try {
			unixLong = Long.parseLong(unixDate);
		} catch (Exception ex) {
//			logger.error(ex.getMessage(), ex);
		}
		try {
			date = fm1.format(unixLong);
		} catch (Exception ex) {
//			logger.error(ex.getMessage(), ex);
		}
		return date;
	}
	
	/**
	 * 判断一个日期是否日节假日 法定节假日只判断月份和天，不判断年
	 * @param date
	 * @return
	 */
	public static boolean isFestival(Date date) {
		boolean festival = false;
		Calendar fcal = Calendar.getInstance();
		Calendar dcal = Calendar.getInstance();
		dcal.setTime(date);
		//		List<Date> list = getFestival();
		//		for (Date dt : list) {
		//			fcal.setTime(dt);
		//			
		//			//法定节假日判断
		//			if (fcal.get(Calendar.MONTH) == dcal.get(Calendar.MONTH)
		//				&& fcal.get(Calendar.DATE) == dcal.get(Calendar.DATE)) {
		//				festival = true;
		//			}
		//		}
		return festival;
	}
	
	/**
	 * 周六周日判断
	 * @param date
	 * @return
	 */
	public static boolean isWeekend(Date date) {
		boolean weekend = false;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
			|| cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			weekend = true;
		}
		return weekend;
	}
	
	/**
	 * 是否是工作日 法定节假日和周末为非工作日
	 * @param date
	 * @return
	 */
	public static boolean isWorkDay(Date date) {
		boolean workday = true;
		if (isFestival(date) || isWeekend(date)) {
			workday = false;
		}
		return workday;
	}
	
	/**
	 * 是否已到当前时间
	 * @param date
	 * @return
	 */
	public static boolean isBeforeNow(Date date) {
		boolean currDay = false;
		
		if (date != null && date.before(new Date())) {
			currDay = true;
		}
		return currDay;
	}
	
	/**
	 * 判断两个日期是否是同一天
	 * @param date1
	 * @return
	 */
	public static boolean isSameDate(Date date1,Date date2) {
		if(date1 == null || date2 == null){
			return false;
		}
		Calendar cal1 = Calendar.getInstance();
	    cal1.setTime(date1);

	    Calendar cal2 = Calendar.getInstance();
	    cal2.setTime(date2);

	    boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
	    boolean isSameMonth = isSameYear && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
	    boolean isSameDate = isSameMonth && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
	    return isSameDate;
	}
	
	/**
	 * 获得本月第一天0点时间	
	 * @return
	 */
	public static Date getTimesMonthmorning() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0,
			0, 0);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		return cal.getTime();
	}
	
	/**
	 *  获得本月最后一天24点时间
	 * @return
	 */
	public static Date getTimesMonthnight() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0,
			0, 0);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY, 24);
		return cal.getTime();
	}
	
	/**
	 * 获取上月最后一天时间
	 */
	public static Date getTimesBeforeMonth() {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}
	
	/**
	 * 获得今天是几号
	 */
	public static int getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, +1);
		date = calendar.getTime();
		int day = date.getDate();
		return day;
	}
	
	/**
	 * 获取一月后的日期(当前日期往前推7天)
	 *
	 * @param date
	 * @return
	 */
	public static Date getMonthdayAfter(Date date, int monthlyLoanTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, +1);
		if (monthlyLoanTime > 0) {
			calendar.set(Calendar.DAY_OF_MONTH, monthlyLoanTime);
		}
		date = calendar.getTime();
		return date;
	}
	
	/**
	 * 获得当前时间new date
	 */
	public static long getNowTime() {
		Date now = new Date();
		return now.getTime();
	}
	
	/**
	 * 获得本月的开始时间，即2012-01-01 00:00:00
	 *
	 * @return
	 */
	public static Date getCurrentMonthStartTime() {
		Calendar c = Calendar.getInstance();
		Date now = null;
		try {
			c.set(Calendar.DATE, 1);
			now = longSdf.parse(longSdf.format(c.getTime()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}
	
	/**
	 * 当前月的结束时间，即2012-01-31 23:59:59
	 *
	 * @return
	 */
	public static Date getCurrentMonthEndTime() {
		Calendar c = Calendar.getInstance();
		Date now = null;
		try {
			c.set(Calendar.DATE, 1);
			c.add(Calendar.MONTH, 1);
			c.add(Calendar.DATE, -1);
			now = longSdf.parse(longSdf.format(c.getTime()) + " 23:59:59");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}
	
	/**
	 * 获取指定日期的当月开始时间，即2012-01-01 00:00:00
	 * @param d
	 * @return
	 */
	public static Date getCurrentMonthStartTime(Date d) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		Date now = null;
		try {
			c.set(Calendar.DATE, 1);
			now = longSdf.parse(longSdf.format(c.getTime()) + " 00:00:00");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}
	
	/**
	 * 获取指定日期的当月结束时间，即2012-01-31 23:59:59
	 * @param d
	 * @return
	 */
	public static Date getCurrentMonthEndTime(Date d) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		Date now = null;
		try {
			c.set(Calendar.DATE, 1);
			c.add(Calendar.MONTH, 1);
			c.add(Calendar.DATE, -1);
			now = longSdf.parse(longSdf.format(c.getTime()) + " 23:59:59");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}

	/**
	 * 获取指定日期的当年开始时间，即2012-01-01 00:00:00
	 * @param d
	 * @return
	 */
	public static Date getCurrentYearStartTime(Date d) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		Date now = null;
		try {
			c.set(Calendar.DATE, 1);
			c.set(Calendar.MONTH, 0);
			now = longSdf.parse(longSdf.format(c.getTime()) + " 00:00:00");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}
	
	/**
	 * 获取指定日期的当年结束时间，即2012-12-31 23:59:59
	 * @param d
	 * @return
	 */
	public static Date getCurrentYearEndTime(Date d) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		Date now = null;
		try {
			c.set(Calendar.DATE, 1);
			c.set(Calendar.MONTH, 0);
			c.add(Calendar.YEAR, 1);
			c.add(Calendar.DATE, -1);
			now = longSdf.parse(longSdf.format(c.getTime()) + " 23:59:59");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}
	
	/**
	 * 计算尾款还款日
	 */
	public static Date calculateLastTime(int stagesNum, Date fristLoadTime) {
		Date lastLoanTime = null;
		int index = 1;
		for (int i = 0; i < stagesNum; i++) {
			if (index == stagesNum) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(fristLoadTime);
				calendar.add(Calendar.MONTH, index - 1);
				lastLoanTime = DateUtil.getEndTimeOfTheDate(calendar.getTime());
			}
			index++;
		}
		return lastLoanTime;
	}

	public static int countDaysBetweenTwoDate(Date dateStart, Date dateEnd) {
		if ((dateStart == null) || (dateEnd == null)) {
			return -1;
		}
		String temp_dateStart = DateUtil.simpleFormat(dateStart);
		String temp_dateEnd = DateUtil.simpleFormat(dateEnd);
		Date dateStart1 = DateUtil.string2Date(temp_dateStart, DateUtil.dtSimple);
		Date dateEnd1 = DateUtil.string2Date(temp_dateEnd, DateUtil.dtSimple);
		int interdays = (int) ((dateEnd1.getTime() - dateStart1.getTime()) / (1000 * 60 * 60 * 24));
		return interdays;
	}
	
	/**
	 * yyyyMMdd 转化 yyyy-MM-dd
	 */
	public static Date formatDate(String str) {
		StringBuffer sb = new StringBuffer();
		String strDate = "";
		if (StringUtil.isNotEmpty(str)) {
			sb.append(str.substring(0, 4));
			sb.append("-");
			sb.append(str.substring(4, 6));
			sb.append("-");
			sb.append(str.substring(6, 8));
			strDate = sb.toString();
		}
		return strToDtSimpleFormat(strDate);
	}
	
	/**
	 * 加减月份
	 * @param aDate
	 * @param months
	 * @return
	 */
	public static final Date increaseMonthDate(Date aDate, int months) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(aDate);
		cal.add(Calendar.MONTH, months);
		return cal.getTime();
	}

	private static int getMonday() {
		Calendar cd = Calendar.getInstance();
		int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == 1) {
			return -6;
		} else {
			return 2 - dayOfWeek;
		}
	}

	/**
	 * 获取当前时间 本周一开始时间
	 * @return
	 */
	public static Date getCurrentMonday(Date d) {
		int monday = getMonday();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(d);
		currentDate.add(GregorianCalendar.DATE, monday);
		return getStartTimeOfTheDate(currentDate.getTime());
	}

	/**
	 * 获取当前时间 本周日结束时间
	 * @return
	 */
	public static Date getPreviousSunday(Date d) {
		int monday = getMonday();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.setTime(d);
		currentDate.add(GregorianCalendar.DATE, monday +6);
		return getEndTimeOfTheDate(currentDate.getTime());
	}
	
	public static Date getMonthForYear(Date aDate, int months) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(aDate);
		cal.set(Calendar.MONTH, months - 1);
		return cal.getTime();
	}


	public static Calendar dateToCalendarDate(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}


	public static XMLGregorianCalendar dateToXmlDate(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		GregorianCalendar gcal =new GregorianCalendar();
		XMLGregorianCalendar xgcal= null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		xgcal.setYear(cal.get(Calendar.YEAR));
		//由于Calendar.MONTH取值范围为0~11,需要加1
		xgcal.setMonth(cal.get(Calendar.MONTH)+1);
		xgcal.setDay(cal.get(Calendar.DAY_OF_MONTH));
		xgcal.setHour(cal.get(Calendar.HOUR_OF_DAY));
		xgcal.setMinute(cal.get(Calendar.MINUTE));
		xgcal.setSecond(cal.get(Calendar.SECOND));
		return xgcal;
	}


	public static void main(String[] args) {
		//        Calendar calendar = Calendar.getInstance();
		//        calendar.setTime(new Date());
		//        calendar.add(Calendar.HOUR, 6);
		
		//		System.out.print(com.yjf.common.lang.util.DateUtil.longDate(new Date()));
		//        System.out.print(getMonthdayAfter(new Date()));
		
		//        Calendar calendar = Calendar.getInstance();
		//        calendar.setTime(new Date());
		//        calendar.add(Calendar.DATE, 0);
		//        System.out.print(DateUtil.dtSimple(calendar.getTime()));
		
		//		org.objectweb.asm.Type CONVERTER = TypeUtils
		//			.parseType("com.yjf.common.lang.beans.cglib.Converter");
		//		BeanCopier.staticCopy(new HashMap(), new HashMap());
//		NumberFormat numberFormat = NumberFormat.getNumberInstance();
//		numberFormat.setMaximumFractionDigits(6);
//		String s = numberFormat.format(NumberUtil.parseDouble("0.007000") * 100);
//
//		float ss = (float) 1 / 6;
		String date = "2017-4-09 16:24:24";
		Date date1 = parse(date);
//		System.out.println(DateUtil.simpleFormat(date1));
//		//        System.out.println(DateUtil.simpleFormat(getRefundTime(date1,0)));
//
//		Date now = new Date();
//		System.out.println(DateUtil.increaseMonthDate(now, 3));

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 7);
//		System.out.println(getCurrentMonday());
//		System.out.println(getPreviousSunday());
//		System.out.println(countDaysBetweenTwoDays(date1,new Date()));
//		System.out.println(new Date());
//		System.out.println(cal.getTime());
//		System.out.println(getWeekdayAfterDate(cal.getTime()));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);
		System.out.println(formatDay(calendar.getTime()));


		try {
			Date startDate = DateUtil.getCurrentMonthStartTime();
			Date endDate = DateUtil.getMonthdayAfter(startDate,1);
			Date startNextDate  =  increaseMonthDate(startDate,1);
			Date endNextDate  =  increaseMonthDate(endDate,1);
			System.out.println("----"+DateUtil.simpleDate(startNextDate));
			System.out.println("----"+DateUtil.simpleDate(endNextDate));



			Calendar calendar1 = Calendar.getInstance();
			calendar1.setTime(new Date());
			calendar1.add(Calendar.MONTH, 2);
			calendar1.set(Calendar.DATE, 0);

			System.out.println(DateUtil.getNextMonthDate(startDate));



			System.out.println("-----:"+DateUtil.dateToCalendarDate(strToDtSimpleSlashFormat("2011/10/31")));
		} catch (Exception e) {
			e.printStackTrace();
		}



	}



	public static final Date stringDateToDate(String stringDate) throws ParseException {
		if (stringDate == null) {
			return null;
		}
		return getFormat(dtSimplePYZX).parse(stringDate);
	}
	
	/**
	 * 获取日期季度值
	 * @param date
	 * @return
	 */
	public static int getDateSeason(Date date) {  
        int season = 0;  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int month = c.get(Calendar.MONTH);  
        switch (month) {  
        case Calendar.JANUARY:  
        case Calendar.FEBRUARY:  
        case Calendar.MARCH:  
            season = 1;  
            break;  
        case Calendar.APRIL:  
        case Calendar.MAY:  
        case Calendar.JUNE:  
            season = 2;  
            break;  
        case Calendar.JULY:  
        case Calendar.AUGUST:  
        case Calendar.SEPTEMBER:  
            season = 3;  
            break;  
        case Calendar.OCTOBER:  
        case Calendar.NOVEMBER:  
        case Calendar.DECEMBER:  
            season = 4;  
            break;  
        default:  
            break;  
        }  
        return season;  
    }  
	
	
	
	/**
     * 获取格式
     *
     * @param format
     * @return
     */
    public static final DateFormat getFormat(String format) {
        return new SimpleDateFormat(format);
    }
    public static final String simpleFormat(Date date) {
        if (date == null) {
            return "";
        }
        return getFormat(simple).format(date);
    }
    public static final Date string2Date(String stringDate) throws ParseException {
        if (stringDate == null) {
            return null;
        }
        return getFormat(dtSimple).parse(stringDate);
    }
    public static Date string2Date(String str, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            return null;
        }
    }
    public static final Date strToDtSimpleFormat(String strDate) {
        if (strDate == null) {
            return null;
        }
        try {
            return getFormat(dtSimple).parse(strDate);
        } catch (Exception e) {
        }
        return null;
    }
    public static final Date strToDtSimpleSlashFormat(String strDate) {
        if (strDate == null) {
            return null;
        }
        try {
            return getFormat(dtSimpleSlash).parse(strDate);
        } catch (Exception e) {
        }
        return null;
    }
    /**
     * 获取date那天的开始时间，00:00:00
     *
     * @param date
     * @return
     */
    public static Date getStartTimeOfTheDate(Date date) {
        if (date == null) {
            return null;

        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 获取date那天的结束时间，23:59:
     *
     * @param date
     * @return
     */
    public static Date getEndTimeOfTheDate(Date date) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }
    public static final String simpleDate(Date date) {
        if (date == null) {
            return "";
        }
        return getFormat(simpleFormat).format(date);
    }

}
