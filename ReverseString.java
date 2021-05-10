public class ReverseString
{
  //reversing a string using reverse iterative method
    public String reverse(String a){
        String rev = "";
        char ch[] = a.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev += ch[i];
        }
        return rev;
    }
  
  //Reversing a string using inbuilt method
  public String reverseString(String a){
        StringBuffer sb = new StringBuffer(a);
        sb.reverse();
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println("Hello World");
		ReverseString revObj=new ReverseString();
		System.out.println("reverse of a string is "+revObj.reverse("Hello World"));
    System.out.println("reverse of a string using inbuilt method: "+revObj.reverseString(""Hello World"));
	}
}
/* output
Hello World                                                                                                           
reverse of a string is dlroW olleH
*/
