import java.util.Scanner;

//Alper İnan 2021 / kurumsal.alper@gmail.com
//Sieve Of Eratosthenes
//This algorithm is for calculating prime numbers up to given number by user.(up to integer max value!)
//Pseudocode from Wikipedia(https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes);
/*let A be an array of Boolean values, indexed by integers 2 to n,
initially all set to true.

for i = 2, 3, 4, ..., not exceeding √n do
    if A[i] is true
        for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do
            A[j] := false

return all i such that A[i] is true.*/

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		//asks for top limit
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt() + 1;
		//creates the array
		boolean[] array = new boolean[number];
		//sets all the values initially true
		for(int i=2;i<number;i++) {
			array[i]=true;
		}
		//algorithm works here, it eliminates i squared and its multiples
		for(int i=2;i<((int)Math.sqrt(number));i++) {
			if(array[i]==true) {
				for(int j=i*i;j<number;j+=i) {
					array[j]=false;
				}
			}
		}
		//prints remained true values
		for(int i=2;i<number;i++) {
			if(array[i]==true) {
				System.out.println(i);
			}
		}
	}
}
