package assignment;
import java.util.*;

public class LazyDog {

	public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog";
        int x = s.indexOf("w");
        System.out.println(s.indexOf("d"));
        System.out.println(s.charAt(2*x));
        System.out.println(s.substring(15, 22));
        System.out.println(s.toUpperCase());
        System.out.println(s.lastIndexOf("u"));
        System.out.println(s.concat(" in the night"));
        

	

	}

}
