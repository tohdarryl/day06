package day06;

import java.util.List;

public class Lambda {

    public static void apply (Greetings greeting, String value) {
        greeting.hello(value);
    }

    public static void toUpperCase (String str){
        System.out.printf(">>> %s = %s\n", str, str.toUpperCase());
    }

    public static void main(String[] args) {
        //Greetings is a Function type
        //JavaScript (name) => { }
        //Anonymous method or Lambda

        Greetings hi = (name) -> {
            System.out.printf("Hello %s\n", name);
        };

        hi.hello("Fred");

        // GreetingClass hi = new GreetingClass();
        
        
        // hi.hello("Fred");


        List <String> names = List.of("fred" ,"barney", "wilma");
        System.out.printf("Say hello to %s\n", names);
        for (String n : names)
            apply(hi, n);

        
        toUpperCase("hello, world");

        Greetings reverseCase = Lambda::toUpperCase; //wtf?
        System.out.printf("To uppercase %s\n", names);
        for (String n : names){
            apply(reverseCase, n);
        }
    }
    
}
