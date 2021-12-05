#include<stdio.h>

int main(){
    float Celcius, Fahrenheit;
    
    printf("Enter temperature in Celsius: ");
    scanf("%f", &Celcius);

    Fahrenheit=(1.8*Celcius)+32;
    printf("Temperature in Fahrenheit is = %f", Fahrenheit);

    return 0;
}
