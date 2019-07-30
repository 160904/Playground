#include<stdio.h>
int main()
{
  int a,j,g;
  scanf("%d",&a);
  j=a%10;
  g=a/10;
  printf("%d",g+j);
  return 0;
}