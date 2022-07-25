class array{
 public static void main(String[]args)
{
 int arr[] = {1,3,10,20,30,40}; //Initializing array
 int sum = 0;
 System.out.println("the element in array");
 for (int i=0; i<arr.length; i++)
{
 sum=sum+arr[i]; //to find the sum of elements in array
 System.out.println(arr[i]);
}
System.out.println("\nSum of elements "+ sum);
}
}