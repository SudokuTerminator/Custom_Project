package com.shiyanlou.error_correction;

public class CRC {
	public static boolean []CRC32(boolean[] m,int n){
		boolean g[] = {true,true,true,false,true,true,false,true,true,false,true,true,true,false,false,false,true,false,false,false,false,false,true,true,false,false,true,false,false,false,false,false,true};
		boolean c[] = {};
		int count = 0;
		int count2 = 0;
		while(count <= n - 1){
			c[count + 32] = m[count];
			++count;
		}
		count = n + 31;
		while(count >= 32){
			if(c[count] == true){
				count2 = 0;
				while(count2 < 32){
					c[count - count2] ^= g[count - count2];
					++count2;
				}
			}
			--count;
		}
		return c;
	}
}
