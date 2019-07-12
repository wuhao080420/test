package com.bw.execption;

import java.util.Collection;
import java.util.Map;

public class Assertutil {

	
	
		public static void isTrue(boolean exp,String message){
		
			if(!exp){
			throw new RuntimeExecption(message);
			}
		}
		public static void isFalse(boolean exp,String message){
			
			if(exp){
				throw new RuntimeExecption(message);
			}
		}
		public static void isNotNull(Object exp,String message){
			
			if(exp==null){
				throw new RuntimeExecption(message);
			}
		}
	
		public static void isNull(Object exp,String message){
				
				if(exp!=null){
					throw new RuntimeExecption(message);
				}
			}
		
		public static void Collectionis(Collection<?> exp,String message){
			
			if(exp==null||exp.size()==0){
				throw new RuntimeExecption(message);
			}
		}
		
		public static void Mapis(Map<?, ?>map,String message){
				
				if(map==null||map.size()==0){
					throw new RuntimeExecption(message);
				}
			}
			
		public static void Stringis(String str,String message){
			
			if(!(str.trim().length()>0)){
				throw new RuntimeExecption(message);
			}
		}
		
	public static void isd(int str,String message){
			
			if(str<=0){
				throw new RuntimeExecption(message);
			}
		}
}
