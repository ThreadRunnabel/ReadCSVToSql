package com.util;

import java.io.File;

public class Constants {
	
	/****************** 业务相关常量 开始 **************************/
	
	
	/**
	 * Space
	 */
	public static final String	HALF_SIZE_SPACE					= " ";
	
	/**
	 * 空字符串
	 */
	public static final String	NULLSTRING						= "";
	
	/**
	 * 斜杠
	 */
	public static final String	SLASH							= "/";
	
	/**
	 * 中划线
	 */
	public static final String	HALF_SIZE_HYPHEN				= "-";
	
	/**
	 * 下划线
	 */
	public static final String	UNDERLINE						= "_";
	/**
	 * 波浪号
	 */
	public static final String	TILDE							= "~";
	
	/**
	 * 反斜杠
	 */
	public static final String	WQ								= "\"";
	
	/**
	 * 竖号
	 */
	public static final String	VC								= "\\|";
	
	/**
	 * 点
	 */
	public static final String	DOT								= ".";
	/**
	 * 空格
	 */
	public static final char	CHAR_BLANK						= ' ';
	/**
	 * 冒号
	 */
	public final static String	COLON							= ":";
	/**
	 * 分号
	 */
	public final static String	SEMICOLON						= ";";
	/**
	 * 逗号
	 */
	public final static String	COMMA							= ",";
	/**
	 * 文件分隔符
	 */
	public final static String	FILE_SEPARATOR					= File.separator;
	
	/**
	 * 换行（CRLF）
	 */
	public static final String	CRLF							= "\r\n";
	
	/**
	 * 换行（CR）0x0d
	 */
	public static final String	CR								= "\r";
	
	/**
	 * 换行（LF）0x0a
	 */
	public static final String	LF								= "\n";
	
	/**
	 * tab
	 */
	public static final String	TAB								= "\t";
	/**
	 * br
	 */
	public static final String	BR								= "<br>";
	
	/**
	 * HTTP
	 */
	public static final String	HTTP							= "http";
	
	/**
	 * HTTPS
	 */
	public static final String	HTTPS							= "https";
	
	/**
	 * 后缀PDF
	 */
	public static final String	EXTENSION_PDF					= ".pdf";
	
	/**
	 * 后缀HTML
	 */
	public static final String	EXTENSION_HTML					= ".html";
	
	/**
	 * 后缀PNG
	 */
	public static final String	EXTENSION_PNG					= ".png";
	
	/**
	 * 后缀TXT
	 */
	public static final String	EXTENSION_TXT					= ".txt";
	
	/**
	 * 后缀XML
	 */
	public static final String	EXTENSION_XML					= ".xml";
	
	/**
	 * 后缀XLS
	 */
	public static final String	EXTENSION_XLS					= ".xls";
	
	/**
	 * 后缀XLSX
	 */
	public static final String	EXTENSION_XLSX					= ".xlsx";
	
	/**
	 * 美国语言
	 */
	public static final String	LANGUAGE_USE					= "use";
	/**
	 * 中国语言
	 */
	public static final String	LANGUAGE_CN						= "cn";
	
	/**
	 * 公用消息文件
	 */
	public static final String	MESSAGE_COMMON					= "/message_common.xml";
	
	/**
	 * 业务
	 */
	public static final String	MESSAGE_BUSINESS				= "/message_business.xml";
	
	/**
	 * 共通配置文件
	 */
	public static final String	CONFIG_COMMON					= "/config_common.xml";
	
	/**
	 * ?
	 */
	public static final String	REQ_OPR							= "?";
	
	/**
	 * 地址
	 */
	public static final String	MAIL_PARA_TO_ADDRESS			= "toAddress";
	
	/**
	 * title
	 */
	public static final String	MAIL_PARA_TITLE					= "title";
	
	/**
	 * mail内容
	 */
	public static final String	MAIL_PARA_BODY					= "body";
	
	/**
	 * 
	 */
	public static final String	MAIL_PARA_REQUIREMENT			= "requirement";
	
	/**
	 * result
	 */
	public static final String	NODE_RESULT						= "result";
	
	/**
	 * cd
	 */
	public static final String	NODE_ATTRIBUTE_CD				= "cd";
	
	/**
	 * =
	 */
	public static final String	EQUAL_OPR						= "=";
	
	/**
	 * &
	 */
	public static final String	AND_OPR							= "&";
	
	/**
	 * CONTENT TYPE
	 */
	public static final String	CONTENT_TYPE_XML				= "text/xml;charset=UTF-8";
	
	/**
	 * CONTENT TYPE
	 */
	public static final String	CONTENT_TYPE_DOWNLOAD			= "application/x-download";
	/**
	 * CONTENT TYPE
	 */
	public static final String	CONTENT_TYPE_JSON				= "application/json;charset=utf-8";
	
	/**
	 * HTTP 200
	 */
	public static final int		HTTP_STATUS_NORMAL				= 200;
	
	/**
	 * HTTP 400
	 */
	public static final int		HTTP_STATUS_ERROR				= 400;
	
	/**
	 * String 0
	 */
	public static final String	STRING_ZERO						= "0";
	
	/**
	 * String 1
	 */
	public static final String	STRING_ONE						= "1";
	
	/**
	 * String 2
	 */
	public static final String	STRING_TWO						= "2";
	
	/**
	 * String 3
	 */
	public static final String	STRING_THREE					= "3";
	
	/**
	 * String 4
	 */
	public static final String	STRING_FOUR						= "4";
	
	/**
	 * String 5
	 */
	public static final String	STRING_FIVE						= "5";
	
	/**
	 * String 6
	 */
	public static final String	STRING_SIX						= "6";
	
	/**
	 * String 7
	 */
	public static final String	STRING_SEVEN					= "7";
	
	/**
	 * String 8
	 */
	public static final String	STRING_EIGHT					= "8";
	
	/**
	 * String 9
	 */
	public static final String	STRING_NINE						= "9";
	
	/**
	 * String 10
	 */
	public static final String	STRING_TEN						= "10";
	
	/**
	 * String -1
	 */
	public static final String	STRING_MINUS_ONE				= "-1";
	
	/**
	 * INT -1
	 */
	public static final Integer	INT_MINUS_ONE					= -1;
	
	/**
	 * INT 0
	 */
	public static final int		INT_ZERO						= 0;
	
	/**
	 * INT 1
	 */
	public static final int		INT_ONE							= 1;
	
	/**
	 * INT 2
	 */
	public static final int		INT_TWO							= 2;
	
	/**
	 * INT 3
	 */
	public static final int		INT_THREE						= 3;
	
	/**
	 * INT 4
	 */
	public static final int		INT_FOUR						= 4;
	
	/**
	 * INT 5
	 */
	public static final int		INT_FIVE						= 5;
	
	/**
	 * INT 6
	 */
	public static final int		INT_SIX							= 6;
	
	/**
	 * INT 7
	 */
	public static final int		INT_SEVEN						= 7;
	
	/**
	 * INT 8
	 */
	public static final int		INT_EIGHT						= 8;
	
	/**
	 * INT 9
	 */
	public static final int		INT_NINE						= 9;
	
	/**
	 * INT 10
	 */
	public static final int		INT_TEN							= 10;
	
	/**
	 * DOUBLE 0
	 */
	public static final Double	DOUBLE_ZERO						= 0.0;
	
}
