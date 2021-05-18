
public class Proj1Main {

	public static void main(String[] args) throws EmptySetException, ElementNotFoundException {
		
		// Include all your test cases here
		
		
		SetADT <Integer> s1 = new ArrayUnBoundedSet<Integer>();
		SetADT <Integer> s2 = new ArrayUnBoundedSet<Integer>();
		SetADT <Integer> s3 = new ArrayUnBoundedSet<Integer>();
		SetADT <String> s4 = new ArrayUnBoundedSet<String>();

		
//This test shows that the array doubles when it reaches the default capacity
//and that the same element will not be added twice. 		
//		s1.add(10);
//		s1.add(7);
//		s1.add(0);
//		s1.add(6);
//		s1.add(10);
//		s1.add(3);
//		s1.add(2);
//		
//		s1.toString();
		
//		s1.remove(1);
		
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
		
//		s1.remove(3);

//		
//		s1.toString();
		
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
//		
//		s1.remove(4);
//		
//		s1.toString();
		
//		s4.add("Justin");
//		s4.add("Hazel");
//		s4.add("Billy");
//		s4.add("Rosabelle");
//		
//		s4.toString();
//		System.out.println();
//		s4.removeRandom();
//		s4.toString();
		
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
//		s1.add(4);
//		
//		s2.add(1);
//		s2.add(30);
//		s2.add(2);	
//
//		s1.union(s2);
//
//		System.out.println(s1.union(s2));
//		
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
//		s1.add(4);
//		
//		s2.add(1);
//		s2.add(30);
//		s2.add(2);	
//
//		s1.intersect(s2);
//
//		System.out.println(s1.intersect(s2));
		
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
//		s1.add(4);
//		
//		s2.add(1);
//		s2.add(30);
//		s2.add(2);
//		s2.add(40);
//			
//		System.out.println(s1.subset(s2));
		
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
//		s1.add(4);
//		
//		s2.add(1);
//		s2.add(30);
//		s2.add(2);
//		s2.add(40);
//			
//		System.out.println(s1.equals(s2));
		
		
//		System.out.println(s4.isEmpty());
//		
//		s4.add("Algorithms + Data Structures is awesome!!");
//		
//		System.out.println(s4.isEmpty());
		
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
//		s1.add(4);
//		
//		s1.size();
		

		SetADT <Integer> A = new ArrayUnBoundedSet<Integer>();
		SetADT <Integer> B = new ArrayUnBoundedSet<Integer>();
		SetADT <Integer> C = new ArrayUnBoundedSet<Integer>();
		SetADT <Integer> emptySet = new ArrayUnBoundedSet<Integer>();
		
		A.add(1);
		A.add(2);
		A.add(3);
		
		B.add(2);
		B.add(4);
		B.add(6);
		
		C.add(1);
		C.add(2);
		C.add(7);
		
//		A.union(A);
//
//		A.toString();
//		System.out.println();
//		System.out.println(A.equals(A));
		

//		System.out.println(A.union(emptySet).equals(A));
//		System.out.println(A.union(emptySet));
		
//		System.out.println(A.union(B));
//		System.out.println(B.union(A));
//		System.out.println(A.union(B).equals(A.union(B)));
		
//		System.out.println(A.union(B.union(C)));
//		System.out.println(A.union(B).union(C));
//		System.out.println(A.union(B.union(C)).equals(A.union(B).union(C)));
		
//		A∪(B∩C)=(A∪B)∩(A∪C)
		
//		System.out.println(A.union(B.intersect(C)));
//		System.out.println(A.union(B).intersect(A.union(C)));
//		System.out.println(A.union(B.intersect(C)).equals(A.union(B).intersect(A.union(C))));
		
//		System.out.println(A.intersect(A));
//		System.out.println(A.intersect(A).equals(A));
		
//		System.out.println(A.intersect(emptySet));
//		System.out.println(A.intersect(emptySet).equals(emptySet));

//		System.out.println(A.intersect(B));
//		System.out.println(B.intersect(A));
//		System.out.println(A.intersect(B).equals(B.intersect(A)));
		
//		A ∩ (B ∩ C) = (A ∩ B) ∩ C
//		System.out.println(A.intersect(B.intersect(C)));
//		System.out.println(A.intersect(B).intersect(C));
//		System.out.println(A.intersect(B.intersect(C)).equals(A.intersect(B).intersect(C)));
		
//		A∩(B∪C)=(A∩B)∪(A∩C)	
		System.out.println(A.intersect(B.union(C)));
		System.out.println(A.intersect(B).union(A.intersect(C)));
		System.out.println(A.intersect(B.union(C)).equals(A.intersect(B).union(A.intersect(C))));
		
		
		


		
		
		
		
		
		
		
	
	}

}
