//write a function to reverse a string

//making use of StringBuilder

public String reverseStr(String A){
  int end = A.length() - 1;
  int start = 0;
  
  StringBuilder sb = new StringBuilder(A);  //initializing the StringBuilder
  
  while(end > start){
    sb.setCharAt(start, A.charAt(end));  //swap the start character with the end character in the string
    sb.setCharAt(end, A.charAt(start));   //swap the end character with the start character in the string
    
    end--; //reduce the end pt
    start++; //increase the start pt
  }
  
  return sb.toString(); //convert the StringBuilder to String and return
}
