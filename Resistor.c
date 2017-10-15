#include<stdio.h>
#include<stdlib.h>
int main(){
	system("clear");
	char name[256];
	printf("The file's name:");
	scanf("%s",name);
	FILE * f = fopen(name,"r");
	if(f == NULL){
		fprintf(stderr,"Unabel to open!");
		return EOF;
	}
	int count = 0;
	int num = 0;
	fscanf(f,"%d\n",&num);
	double * Rx = (double *)malloc((size_t)num * sizeof(double));
	double Ru = 1.0f;
	double Rd = 0.0f;
	double Rs = 1.0f;
	double R = 0.0f;
	while(count < num){
		fscanf(f,"%lf\n",&Rx[count]);
		Ru *= Rx[count];
		Rs *= Rx[count];
		++count;
	}
	count = 0;
	while(count < num){
		Rd += Rs / Rx[count];
		++count;
	}
	R = Ru / Rd;
	printf("Result:%lf",R);
	fclose(f);
	return 0;
}
