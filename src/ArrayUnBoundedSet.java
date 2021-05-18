import java.util.Random;

/********************************************************************
 ArrayUnBoundedSet.java     
 Implements SetADT using array.
********************************************************************/

public class ArrayUnBoundedSet<T> implements SetADT<T> {

    private int count;  // the current number of elements in the set 
    private T[] contents; // the set as an array
    private final int DEFAULT_CAPACITY = 5;
	private int subCount;
   
    /******************************************************************
     Creates an empty set with default capacity.
    ******************************************************************/
    public ArrayUnBoundedSet() {
        
        count = 0;
        contents = (T[])(new Object[DEFAULT_CAPACITY]);  
        
    }

    /******************************************************************
     Creates an empty set with specified capacity.
    ******************************************************************/
    public ArrayUnBoundedSet(int initCapacity) {
        
        count = 0;
        contents = (T[])(new Object[initCapacity]); 
        
    }

    /* Complete the definition of this ArrayUnBoundedSet class by implementing
       all methods required by the interface SetADT. Note that this is an 
       unbounded array implementation. Thus, you should double the size of 
       the array when full. Eclipse can add stubs for all the required methods. */

    /******************************************************************
	 In your implementation, the following method must be recursive.
	 It returns elements of the contents array as a string starting with
	 the given index through the count, which is the number of elements
	 in the underlying set. Use space or comma as a separator.
	******************************************************************/
	private String toStringHelper(int index) {
		// complete the implementation of this recursive method
		if(index ==contents.length) 
			return null;
//		if(contents[index]==null) {
//			return null;
//		}
		 else
			 System.out.print(contents[index] + ", ");
		return toStringHelper(index+1);
	}

	private boolean equalsHelper(SetADT<T> otherset, int index) {
		if (index == otherset.size())
			return true;
		else 
			if(contents.equals(otherset.toArray()[index]) && equalsHelper(otherset, index+1))
				return contents.equals(otherset.toArray()[index]) && equalsHelper(otherset, index+1);
			else
			 System.out.println("This is false");
			return false ;
		
	}
	
//	private static boolean subsetHelper(String[] nameArr, String name, int pos) {
//		if (pos == nameArr.length)
//			return false;
//		else 
//			return name.equals(nameArr[pos]) || subsetHelper(nameArr, name, pos+1);
//
//	}

	/******************************************************************
	 Returns a string representation of this set. Uses the recursive 
	 method toStringHelper defined above with starting index of 0.
	******************************************************************/
	@Override
	public String toString() {// Do not modify this method.

		return toStringHelper(0);
		}

	@Override
	public void doubleArray() {
		T[] largerArray = (T[])(new Object[contents.length * 2]);
		for(int i = 0; i <= contents.length-1; i ++) {
			largerArray[i] = contents[i];
		}
		contents = largerArray;
	}

	@Override	
	public void add(T element) {
	
	 T addElement = element;
	
	if(count >= contents.length) {
		doubleArray();
	}
	
	if(!contains(element)) {
		
	for(int i = 0; i > contents.length ; i--) {
		contents[i+1] = contents [i];
	}
	contents [count] = addElement;
	count ++;
		
	}
}

	@Override
	public boolean contains(T target) {
		
		for(int i = 0; i< contents.length; i++) {
			if (contents[i] == target) {

				return true;
			}
		}
		
		return false;
	}

	@Override
	public T remove(T element) throws ElementNotFoundException, EmptySetException {
		
		if(isEmpty()==true) 
			throw new EmptySetException("This array is empty.  There are no elements to be removed.");	
		if(!contains(element)) 
			throw new ElementNotFoundException("That element does not exist in this array.");
		
		for(int i = 0; i < contents.length ; i++) {
					
			if (element == contents[i]) {
				contents[i] = null;
				count --;				
			}
		}
							
		return null;
	}

	@Override
	public T removeRandom() throws EmptySetException {
		
		if(isEmpty()==true) {
			throw new EmptySetException("A random element cannot be removed "
					+ "because this array is empty.");
		}
		
		Random rand = new Random();
		int randInt = 0;
		randInt = rand.nextInt(count);
			
		contents [randInt] = null;
		count --;
		
		return null;
	}

	@Override
	public SetADT<T> union(SetADT<T> otherset) {
		
		T[] otherSetArray = otherset.toArray();
		int index = count + otherSetArray.length;
		SetADT <T> unionSet = new ArrayUnBoundedSet<T>(index);
		
		for(int i = 0; i < contents.length; i++) {
			unionSet.add(contents[i]);	
		}
		
		for(int i =0; i < otherSetArray.length; i++) {
			if(!contains(otherSetArray[i])) {
			unionSet.add(otherSetArray[i]) ;	
			//count ++;
			}
		}

		return unionSet;
	}

	@Override
	public SetADT<T> intersect(SetADT<T> otherset) {
		
		T[] otherSetArray = otherset.toArray();
		int index = count + otherSetArray.length;

		SetADT <T> interSet = new ArrayUnBoundedSet<T>(index);
		
		//int newCount = 0;
		
		for(int i =0; i < otherSetArray.length; i++) {
			
			if(contains(otherSetArray[i])) {
			interSet.add(otherSetArray[i]);
			//newCount ++;
			}
		}
		//count = newCount;
		
		return interSet;
	}

	@Override
	public boolean subset(SetADT<T> otherset) {
		
		T[] otherSetArray = otherset.toArray();
		int index = count + otherSetArray.length;
		SetADT <T> subSet = new ArrayUnBoundedSet<T>(index);
		
		for (int i = 0; i < contents.length; i++) 
			for(int j = 0; j < otherSetArray.length; j++) {
				
			if(contents[i] == otherSetArray [j]) {
				
				subSet.add(otherSetArray [j]);
				subCount++;
			}
				
			}
			
			if(subSet.size() > 0) {
				return true;
			}
			
		return false;
	}

	@Override
	public boolean equals(SetADT<T> otherset) {
		
//		subset(otherset);
		
		T[] otherSetArray = otherset.toArray();
		int index = count + otherSetArray.length;
		SetADT <T> subSet = new ArrayUnBoundedSet<T>(index);
		
		for (int i = 0; i < contents.length; i++) 
			for(int j = 0; j < otherSetArray.length; j++) {
				
			if(contents[i] == otherSetArray [j]) {
				
				subSet.add(otherSetArray [j]);
				subCount++;
			}
			}
		
		if(subCount == count) 
			return true;
		
		return false;
		
	}
	
	@Override
	public boolean isEmpty() {
		if (count ==0)	
			return true;
		else
			return false;		
	}

	@Override
	public int size() {
		int size = count;
		System.out.println("The number of elements in this array is: " + size);
		return size;
	}

	@Override
	public T[] toArray() {
		
		T[] newArr = (T[])(new Object[count]);
		
		for (int i =0; i < count; i++) {
			newArr[i] = contents [i];
		}

		return newArr;
	}
}
