package com.zhangsan.entity;

import java.sql.Date;

public class Shop {
			private int sid;
			private String sname;
			private Date stime;
			public int getSid() {
				return sid;
			}
			public void setSid(int sid) {
				this.sid = sid;
			}
			public String getSname() {
				return sname;
			}
			public void setSname(String sname) {
				this.sname = sname;
			}
			public Date getStime() {
				return stime;
			}
			public void setStime(Date stime) {
				this.stime = stime;
			}
}
