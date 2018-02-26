package simpleArray;

public class MyArrayClass {
	//Two fields or instance variables. 
	private int[] arr;
	private int iNumElements; 	//# of elements in the array, not the size of the array.

	//Constructor. Initializes both instance variables. Does not
	// create a new array.
	public  MyArrayClass(int[] arr, int iNumElements){
	this.arr = arr;
	this.iNumElements = iNumElements;
	
	}
	
	// Displays the fifth element
	public void DisplayAt(int i){
	System.out.println("Value at index" + i + " is:" + arr[i]);
	
	}
	// Display all elements in the array that have a value
	public void DisplayAll(){
		for(int i = 0; i < iNumElements; i++){
			System.out.print(arr[i] + " ");
		}
	}

	// Key - value to search in the array
	// return value - index where key was found
	public int find(int key){
		for(int i = 0; i < iNumElements; i++){
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
public void insert (int n){
	arr[iNumElements++] = n;

	}
// which means that you must move up rest of the elements.
	
	public void Delete(int key){
		
		int index = find(key);
		
		if(index > -1) {
			for(int i = index; i < iNumElements; i++){
				arr[i] = arr[i+1];
			}
			iNumElements--;
		}
		
	

}
public void bubbleSort() {
	int out, in;
	int temp;

	for (out = iNumElements - 1; out > 0; out--) // outer loop (backward)
	{
		for (in = 0; in < out; in++) // inner loop (forward)
		{

			// combined the old "swap" into the "if" loop
			if (arr[in] > arr[in + 1]) {
				temp = arr[in];
				arr[in] = arr[in + 1];
				arr[in + 1] = temp;
			} // end if
		} // inner for loop
	} // outer for loop
}
}
