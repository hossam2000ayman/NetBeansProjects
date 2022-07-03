
#include<stdio.h>

int main(){
int a[10] , i , j , temp;

INPUT_ARRAY();
SORT_IN_ASCENDING();
SORT_IN_DESCENDING();
READ_SORTED_ARRAY();


return 0;
}


INPUT_ARRAY(){

printf("Enter Array Element");

for(i=0;i<10;i++){
	scanf("%d",&a[i]);
}
}

SORT_IN_ASCENDING(){
for(j=i+1;j<10;j++){
// in if condition specify if it's in ascending or descending
	if(a[i]>a[j]){ // IN ASCENDING
	 temp = a[i];
	 a[i]=a[j];
	 a[j] = temp;
	}
}
}

SORT_IN_DESCENDING(){
	/* IN DESCENDING */
	if(a[i]<a[j]){ 
	 temp = a[i];
	 a[i]=a[j];
	 a[j] = temp;
	}
}

READ_SORTED_ARRAY(){
printf("Array Elements: ");
for(int i=0;i<10;i++){
	printf("%d",a[i]);
}
}
