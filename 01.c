#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    int number, guess, ngusses=1;

    srand(time(0));
    number= rand() % 100 +1;

    do{
        printf("Guess the number \n");
        scanf("%d", &guess);

        if(guess<number){
            printf("Higher number please!\n");
        }
        else if(guess>number){
            printf("Lower number please!\n");
        }
        else{
            printf("You guessed it in %d chances", ngusses);
        }

        ngusses++;
    }while(guess!=number);
    return 0;
}