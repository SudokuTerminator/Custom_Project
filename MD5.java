import java.lang.Math;
class MD5{
	private int A = 0x67452301;
	private int B = 0xEFCDAB89;
	private int C = 0x98BADCFE;
	private int D = 0x10325476;
	private static double dabs(double num){
		return (num >= 0.0f) ? num : -num;
	}
	static int t(int i){
		return (int) Math.floor(4294967296.0f * dabs(Math.sin((double)i + 1.0f)));
	}
	static byte[] fillCharacter(byte[] source){
		long len = (source.length / 64) * 64 + (source.length % 64 == 0) ? 0 : 1
		byte ret[] = new char[len];
		int a = 0;
		while(a < source.length)
			ret[a] = source[a++];
		if(a < len)
			ret[a++] = 0x80;
		while(a < len)
			ret[a++] = 0;
		return ret;
	}
	
