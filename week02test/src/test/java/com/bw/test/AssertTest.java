package com.bw.test;

import org.junit.Test;

import com.bw.execption.Assertutil;
import com.bw.execption.RuntimeExecption;

public class AssertTest {
		@Test
		public void fun1Test(){
			try {
				Assertutil.isTrue(true, "�ⲻ�����");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void fun1Test1(){
			try {
				Assertutil.isTrue(false, "�ⲻ�����");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void fun1Tes2t(){
			try {
				Assertutil.isFalse(false, "�ⲻ�Ǽٵ�");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void fun1Tes3t(){
			try {
				Assertutil.isFalse(true, "�ⲻ�Ǽٵ�");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
}
