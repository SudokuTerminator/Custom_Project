#include<stdio.h>
int main()
{
	unsigned int i;
	scanf("%x",&i);
	unsigned long N = (unsigned long)i << 32L;
	int count = 63;
	while(count >= 32)
	{
		if(((N >> count) & 1) == 1)
			N ^= 0x104C11DB7L << (unsigned long)(count - 32);
		--count;
	}
	printf("%08x",N);
	return 0;
}
