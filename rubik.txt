#include<iostream>
using namespace std;
unsigned long long fact(int n)
{
	int count = 1;
	unsigned long long N = 1;
	while(count <= n)
	{
		N *= count;
		++count;
	}
	return N;
}
unsigned long long pow(unsigned long long x,int y)
{
	unsigned long long z = 1;
	int count = 1;
	while(count <= y)
	{
		z *= x;
		++count;
	}
	return z;
}
int main()
{
	int n;
	unsigned long long N;
	cout << "Please input an integer value:";
	cin >> n;
	if(n % 2 == 1)
		N = pow(fact(24),(n-3)*(n+1)/4) / pow(24,3*(pow(n-2,2)-1)/2) * 40320 * 2187 * 479001600 * 1024;
	else
		N = pow(fact(24),n*(n-2)/4) / pow(24,3*pow(n-2,2)/2) * 5040 * 729;
	cout << "N = " << N << endl;
	return 0;
}