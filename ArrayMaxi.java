import java.util.Scanner;
public class ArrayMaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		int [] numbers = {10,11,15,3};
		int total =0;
		
		
		
		System.out.println("Welcome! Here are the array values : ");
		for (int element:numbers) {
			System.out.print(element + " ");
			
		}
		System.out.println();
		System.out.println("Array values backwards");
		
		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Are all the values in the array even? ");
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i]%2 == 0) {
				System.out.println("Number " + numbers[i] + " is even");
			}else {
				System.out.println("This number is not even : " + numbers[i]);
			}
		}
		
		
		System.out.println();
		
		System.out.println("Let's find the minimum value of the array: ");
		int min = numbers[0];
		for(int i = 1; i <numbers.length; i++) {
			if (numbers[i] < min ) {
				min = numbers[i];
			}	
		}
		
		System.out.println(min + " is the minimum value ");
		
		System.out.println("Lets print the second and third numbers in the array : ");
		for(int i = 1; i < 3; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please input number " + (i+1)+ " :  ");
			numbers[i] = input.nextInt();
			
		}
		
		System.out.println("Here are the new array values: ");
		for (int element:numbers) {
			System.out.print(element + " ");
		}
		
		System.out.println();
		
		for(int element:numbers) {
			total+= element;
		}
		
		System.out.print("The sum of the new array elements are : "+ total);
		System.out.println();
		
		System.out.println("Let's copy our new values to a different/brand-new array :) ");
		int [] copyer = new int [4];
		System.out.println("These values are :");
		for(int i = 0; i < numbers.length; i++) {
			copyer[i] = numbers[i];
			System.out.print( copyer[i] + " ");
		}
		System.out.println();
		
		System.out.println("The first two values are : " + copyer[0] + " & " + copyer[1]);
		
		int max = copyer[0];
		for (int i = 1; i < copyer.length; i++) {
			if (copyer[i] > max) {
				max = copyer[i];
			}
		}
		
		System.out.println("Are all the values in the new copy array even? ");
		for(int i = 0; i < copyer.length; i++) {
			if (copyer[i]%2 == 0) {
				System.out.println("Number " + copyer[i] + " is even");    
			}else {
				System.out.println("This number is not even : " + copyer[i]);
			}
		}
		
		
		System.out.println("Max value is : " + max);
		
		System.out.println("Please insert a value to search :  ");
		int item = input.nextInt();
		
		System.out.println("You are searching for value " + item + " :");
		for (int i = 0; i < copyer.length; i++) {
			if (copyer[i] == item) {
				System.out.print("Value found as number: " + (i+1) + "\n");
				
			}
			
		}
		
		System.out.println();
		int count = 0;
		for (int i = 0; i < copyer.length; i++) {
			if (item == copyer[i]) {
				count++;
			}
		}
		
		System.out.println("Value found " + count + " times");
		
		
	
		

	}

}
