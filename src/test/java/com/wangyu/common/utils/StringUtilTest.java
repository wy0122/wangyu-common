package com.wangyu.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
/**
 * 
    * @ClassName: StringUtilTest
    * @Description: 测试手机号、邮箱等
    * @author 王宇
    * @date 2019年9月9日
    *
 */
public class StringUtilTest {

	@Test
	public void testHasLength() {
		Boolean string = StringUtil.isPhoneNumber("13766");
		System.out.println(string);
		
		Boolean string1 = StringUtil.isPhoneNumber("17802552482");
		System.out.println(string1);
	}

	@Test
	public void testHasText() {
		String string = StringUtil.toHtml("9月5日一大早,又有了新情况。");
		String string1 = StringUtil.toHtml("上午9点多，传出中美经贸高级别磋商签头人通话的消息。");
		String string2 = StringUtil.toHtml("9月5日一上午，中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。");
		String string3 = StringUtil.toHtml("易代表莱特希泽、财政部长姆努钦通话。");
		System.out.println(string);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
	}

	@Test
	public void emailTest() {
		Boolean string = StringUtil.isEmail("123");
		System.out.println(string);
		
		Boolean string1 = StringUtil.isEmail("a2242413180@qq.com");
		System.out.println(string1);
	}
	
	@Test
	public void testRandomChineseString() {
	 for(int i=0;i<10;i++) {
		 String string = StringUtil.randomChineseString();
		 System.out.print(string+" ");
	 }
	}

	
	@Test
	public void testRandomChineseString2() {
		 for(int i=0;i<10;i++) {
			 String string = StringUtil.randomSimpleChinese();
			 System.out.print(string+" ");
		 }
		
	}
	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
		
		
	}

	@Test
	public void testGenerateChineseName() {
		 for(int i=0;i<10;i++) {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
		 }
	}

	
	
	@Test
	public void genderatePerson() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		
		for(int i =0;i<10000;i++) {
			Person person = new Person(StringUtil.generateChineseName(),RandomUtil.random(1, 120),
					StringUtil.randomChineseString(140),DateUtil.randomDate(c.getTime(), new Date()));
			System.out.println(person);
		}
		
		
	}
}
