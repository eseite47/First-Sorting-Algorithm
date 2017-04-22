class SwapTwo
{
	private int[] array;
	int[] odd = new int[10];
	int[] even = new int[10];
	int oddSize = 0;
	int evenSize = 0;
	
	public SwapTwo(int[] array)
	{
		this.array = array;
	}

	void sortItOut() 
	{
		//get value from array
    		for (int i = 0; i < array.length; i++)
    		{
      			int value = array[i];
      
      			//check if the value needs to go right
      			if (value % 2 == 0)
      			{
				even[evenSize] = value;
				evenSize++;
			}
			else
			{
				odd[oddSize] = value;
				oddSize++;
			}
		}
	
		for (int i = 0; i < odd.length-1; i++)
		{
			for (int j = i+1; j < odd.length; j++)
			{
				if (odd[i]>odd[j])
				{
				int temp = odd[j];
				odd[j] = odd[i];
				odd[i] = temp;
				}
			}
		}

		for (int i = 0; i < even.length-1; i++)
		{
			for (int j = i+1; j <even.length; j++)
			{
				if (even[i]<even[j])
				{
				int temp = even[j];
				even[j] = even[i];
				even[i] = temp;
				}
			}
		}
	}

	void printList()
	{
		for(int i = 0; i < odd.length; i++)
		{
			if (odd[i] != 0){
			System.out.print(odd[i]);
			}
		}
		for(int i = 0; i < even.length; i++)
		{
			if (even[i] != 0){			
			System.out.print(even[i]);
			}
		}
		System.out.println();
	}
}
