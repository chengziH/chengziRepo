package com.chengzi.common.util;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
//	static final Logger logger = LoggerFactory.getLogger(StringUtil.class);
	
	/**
	 * subString("acd中央人民广播电台", 5, "..") 返回： “acd中央人民..”
	 * @param text 原始字符串
	 * @param length 截取长度
	 * @param endWith 超过截取长度时，用来什么字符串省略代替，
	 * @return subString("acd中央人民广播电台", 5, "..") 返回： “acd中央人民..”
	 */
	public static String subString(String text, int length, String endWith) {
		if (isBlank(text))
			return "";
		int textLength = text.length();
		int byteLength = 0;
		StringBuffer returnStr = new StringBuffer();
		for (int i = 0; i < textLength && byteLength < length * 2; i++) {
			String str_i = text.substring(i, i + 1);
			if (str_i.getBytes().length == 1) {//英文   
				byteLength++;
			} else {//中文   
				byteLength += 2;
			}
			returnStr.append(str_i);
		}
		try {
			if (byteLength < text.getBytes("GBK").length) {//getBytes("GBK")每个汉字长2，getBytes("UTF-8")每个汉字长度为3   
				returnStr.append(endWith);
			}
		} catch (UnsupportedEncodingException e) {
//			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return returnStr.toString();
	}
    /**  
     *   
     * 基本功能：过滤所有以"<"开头以">"结尾的标签  
     * <p>  
     *   
     * @param str  
     * @return String  
     */  
    public static String filterHtml(String str) {   
		if (isBlank(str)){
			return "";
		}
        Pattern pattern = Pattern.compile("<([^>]*)>");   
        Matcher matcher = pattern.matcher(str);   
        StringBuffer sb = new StringBuffer();   
        boolean result1 = matcher.find();   
        while (result1) {   
            matcher.appendReplacement(sb, "");   
            result1 = matcher.find();   
        }   
        matcher.appendTail(sb);   
        return sb.toString();   
    }  
    
    /**  
     *   
     * 基本功能：过滤引号
     * <p>  
     *   
     * @param str  
     * @return String  
     */  
    public static String filterXSS(String str) {   
		if (isBlank(str)){
			return "";
		}
        Pattern pattern = Pattern.compile("\"|\'");   
        Matcher matcher = pattern.matcher(str);   
        StringBuffer sb = new StringBuffer();   
        boolean result1 = matcher.find();   
        while (result1) {   
            matcher.appendReplacement(sb, "");   
            result1 = matcher.find();   
        }   
        matcher.appendTail(sb);   
        return sb.toString();   
    }  
    
    
	public static String nullToEmpty(String str) {
		if (str == null) {
			return "";
		}
		return str;
	}
	
	
	public static String replaceBlank(String str) {
        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }
	
	
	/**
	 * 检查字符串是否不是<code>null</code>和空字符串<code>""</code>。
	 * <p/>
	 * 
	 * <pre>
     * StringUtil.isNotEmpty(null)      = false
     * StringUtil.isNotEmpty("")        = false
     * StringUtil.isNotEmpty(" ")       = true
     * StringUtil.isNotEmpty("bob")     = true
     * StringUtil.isNotEmpty("  bob  ") = true
     * </pre>
	 *
	 * @param str 要检查的字符串
	 * @return 如果不为空, 则返回<code>true</code>
	 */
	public static boolean isNotEmpty(String str) {
		str = replaceBlank(str);
		return ((str != null) && (str.length() > 0));
	}
	
	/**
	 * str是否包含val值
	 * @param str
	 * @param val
	 * @return
	 */
	public static int indexOf(String str,String val) {
        return str.indexOf(val);
    }
	
	public static String getStringInArray(String[] stringArray, int i) {
		return stringArray[i];
	}
	
	/***
	 * 银行卡
	 * @param value
	 * @return
	 */
	public static String fixBankNoKey(String value){
		if(StringUtil.isEmpty(value)){
			return null;
		}
		Pattern p = Pattern.compile("(\\w{4})(\\w+)(\\w{4})"); 
		Matcher m = p.matcher(value);  
		int length = value.length() - 8;
		String temp = "";
		for(int i = 0 ; i < value.length() - 8 ; i++){
			temp = temp + "*";
		}
		return m.replaceAll("$1"+temp+"$3");
	}
	
	/**
	 * 手机号码
	 * @param value
	 * @return
	 */
	public static String fixCertCardKey(String value){
		if(StringUtil.isEmpty(value)){
			return null;
		}
		Pattern p = Pattern.compile("(\\w{4})(\\w+)(\\w{4})");
		Matcher m = p.matcher(value);  
		int length = value.length() - 8;
		String temp = "";
		for(int i = 0 ; i < value.length() - 8 ; i++){
			temp = temp + "*";
		}
		return m.replaceAll("$1"+temp+"$3");
	}
	
	// 完整的判断中文汉字和符号
	public static boolean isChinese(String strName) {
		char[] ch = strName.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (isChinese(c)) {
				return true;
			}
		}
		return false;
	}

	// 根据Unicode编码完美的判断中文汉字和符号
	private static boolean isChinese(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
			return true;
		}
		return false;
	}
	
	public static boolean isNumber(String numStr) {
		if (numStr == null) {
			return false;
		}
		try{
//			Long.parseLong(numStr);
			Double.parseDouble(numStr);
			return true;
		} catch(NumberFormatException e) {
			try {
				Integer.parseInt(numStr);
				return true;
			} catch (NumberFormatException e1) {
				
			}
			return false;
		}
	}
	
	/**
	 * 前面start位字符， 后面end位字符， 中间用endWith替换每个字符
	 * */
	public static String subString3(String text, int start, int end, String endWith) {
		if (isBlank(text))
			return "";
		int textLength = text.length();
		String returnStr;
		String endWith2="";
		if (textLength > start + end) {
			for(int i=0;i<textLength-(start+end);i++){
				endWith2=endWith2+endWith;
			}
			returnStr = text.substring(0, start) + endWith2
						+ text.substring(textLength - end, textLength);
		} else if (textLength > start && (textLength < start + end || textLength == start + end)) {
			for(int i=0;i<textLength-start;i++){
				endWith2=endWith2+endWith;
			}
			returnStr = text.substring(0, start) + endWith2;
		} else {
			for(int i=0;i<textLength-1;i++){
				endWith2=endWith2+endWith;
			}
			returnStr = text.substring(0, 1) + endWith2;
		}
		
		return returnStr.toString();
	}
	
	public static boolean isContainStr(String src, String str) {
	    if (isBlank(src) || isBlank(str)) 
	        return false;
	    String[] srcArr = src.split(",");
	    for (String s : srcArr) {
	        if (s.equals(str)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean isBlank(String str) {
		int length;
		
		if ((str == null) || ((length = str.length()) == 0)) {
			return true;
		}
		
		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isEmpty(String str) {
		return ((str == null) || (str.length() == 0));
	}
}
