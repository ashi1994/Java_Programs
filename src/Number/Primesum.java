package Number;
class Primesum
{


public static void main(String args[]) {

    int number = 20;
    int count = 0;
    long sum = 0;
    while(count < 2000000){

        if(isPrimeNumber(number)){
            sum += number;
            count++;
        }

        number++;
    }
    System.out.println(sum);
}

private static boolean isPrimeNumber(int number){   

    for(int i=2; i<=number/2; i++){

        if(number % i == 0){
            return false;
        }

    }

    return true; 
}
}