public class StringMethod {
    public static void main(String[] args) {

        String name = "Asif Iqbal";
        String s = "    Buet Cse  ";
        s = s.trim();
        s = s.replace('B','K');

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastindex = name.lastIndexOf('a');


        System.out.println("String length: "+length);
        System.out.println("First letter: "+letter);
        System.out.println("Index of space: "+index);
        System.out.println("Last index of a: "+lastindex);
        System.out.println("Trimmed & replaced version of s:"+s);
        System.out.println("My string is empty: "+s.isEmpty());
        //name.equalsIgnoreCase("Password");
        if(name.equals("Asif Iqbal")){
            System.out.println("That name is already taken. Try different one.");
        }
        else{
            System.out.println("Alright! Your are good to go.");
        }
    }
}
