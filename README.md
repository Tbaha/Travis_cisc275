# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	*Dog("Fido", 4) 
	*Dog("Fido", 3)
	*Dog("Alfie". 4)
	*sorted list of dogs by comparable
	*sorted list of dogs by comparator
3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
	The Comparator constructor call is public int compare(Animal a, Animal b). The class defintion is Collections.sort(dogs, new Comparator<Animal>()
