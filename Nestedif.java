public class Nestedif {
    public static void main(String[] args) {
        int age=65;
        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to vote and avail government fund");
            }else
                System.out.println("we are eligible to vote but not eligible to avail government");

        } else
                 System.out.println("we are not eligiblle to vote and not eligible to avail government"); 
    
}
}