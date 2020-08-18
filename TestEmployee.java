public static void main(String[] args) {
 
  Employee e[] = new Employee[5];
  
  System.out.println("Clone");
  System.out.println("Child2");
}
}

  for(int i=0; i<5; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  System.out.println("child1");
  
  for(int i=0; i<5; i++) {
   
   e[i].display();
  }
 }