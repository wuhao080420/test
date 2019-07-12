package com.bw.test;

import org.junit.Test;

import com.bw.execption.Assertutil;
import com.bw.execption.RuntimeExecption;

public class AssertTest {
		@Test
		public void fun1Test(){
			try {
				Assertutil.isTrue(true, "这不是真的");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void fun1Test1(){
			try {
				Assertutil.isTrue(false, "这不是真的");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void fun1Tes2t(){
			try {
				Assertutil.isFalse(false, "这不是假的");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void fun1Tes3t(){
			try {
				Assertutil.isFalse(true, "这不是假的");
			} catch (RuntimeExecption e) {
				e.printStackTrace();
			}
		}
}
