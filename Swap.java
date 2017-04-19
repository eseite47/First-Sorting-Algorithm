class Swap
{
	private int[] array;
	
	public Swap(int[] array)
	{
		this.array = array;
	}

	public void sortItOut() 
	{
    
		//get value from array
    		for (int i = 0; i < array.length; i++)
    		{
      			int value = array[i];
      
      			//check if the value needs to go right
      			if (value % 2 == 0)
      			{
        			//check value to the right
        			for (int a = i; a < array.length -1; a++)
        			{
          				int next = array[a];
          
          				// if it is odd, swap right
          				if (next % 2 == 1)
          				{
              					array[a] = value;
              					array[i] = next;
          				}
          
          				// else if is bigger, swap right
         				else if (value < next)
          				{
              					array[a] = value;
              					array[i] = next;
          				}
        			}
      			}
      			// or if the value should go left
      			else
			{
        			//check value to the left
        			for (int a = i; a > 0; a--)
        			{
         				int next = array[a];
          
          				// if it is even, swap left
          				if (next % 2 == 0)
          				{
              					array[a] = value;
              					array[i] = next;
          				
          
          				// else if is bigger, swap left
          				else if (value < next)
          				{
              					array[a] = value;
              					array[i] = next;
          				}
        			}
      			}
		}
  	}

	public void print()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
