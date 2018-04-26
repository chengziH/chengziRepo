package com.chengzi.common.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberUtil {
//	static final Logger	logger	= LoggerFactory.getLogger(NumberUtil.class);
	
	/**
	 * 格式化数字
	 * @param num
	 * @param format
	 * @return
	 */
	public static String format(Number num, String format) {
		DecimalFormat nf = new DecimalFormat(format);
		return nf.format(num);
	}
	
	public static int parseInt(String strInt) {
		return (int) parseLong(strInt, 0);
	}
	
	public static long parseLong(String strLong, long defaultValue) {
		if (StringUtil.isEmpty(strLong))
			return defaultValue;
		try {
			return Long.parseLong(strLong);
		} catch (Exception e) {
//			if (logger.isInfoEnabled())
//				logger.info("parseLong error", e);
		}
		return defaultValue;
	}
	
	public static double parseDouble(String strDouble, double defaultValue) {
		if (StringUtil.isEmpty(strDouble))
			return defaultValue;
		try {
			return Double.parseDouble(strDouble);
		} catch (Exception e) {
//			if (logger.isInfoEnabled())
//				logger.info("parseLong error", e);
		}
		return defaultValue;
	}
	
	public static double parseDouble(String strDouble) {
		return parseDouble(strDouble, 0.0);
	}
	
	public static long parseLong(String strLong) {
		return parseLong(strLong, 0);
	}
	
	public static String formatMoney(double num) {
		double tempNum = num / 100.0;
		DecimalFormat nf = new DecimalFormat("###,###,##0.00");
		return nf.format(tempNum);
	}
	
	public static String formatRate(double num) {
		double tempNum = num / 100.0;
		DecimalFormat nf = new DecimalFormat("###,###,##0.000000");
		return nf.format(tempNum);
	}
	
	public static String formatDouble(double num) {
		DecimalFormat nf = new DecimalFormat("###,###,##0.0000");
		return nf.format(num);
	}
	
	public static String parseMoneyToString(String strMoney) {
		double tempNum = parseDouble(strMoney) * 100;
		long value = new Double(tempNum).longValue();
		return String.valueOf(value);
	}
	
	public static long parseMoneyToLong(String strMoney) {
		double tempNum = parseDouble(strMoney) * 100;
		long value = new Double(tempNum).longValue();
		return value;
	}

    public static String parseFormatDouble(double douRate){
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(6);
        String value = numberFormat.format(douRate*100);
        return value;
    }
}
