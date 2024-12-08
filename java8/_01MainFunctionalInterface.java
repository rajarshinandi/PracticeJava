import java.util.Arrays;

public class _01MainFunctionalInterface {
    public static void main(String[] args) {

//      Here we are Creating the reference of the Functional Interface and Implementing the method right away
        _01SampleFunctionalInterface fi = (name) -> "Hello " + name;
        _01SampleFunctionalInterface fi2 = name -> "Good Morning " + name;
        _01SampleFunctionalInterface findWordCount = (name) -> "Your name has " + name.length() + " letters!";

//       Lambda with function body
        _01SampleFunctionalInterface reverseName = name -> {
            char[] charArray = name.toCharArray();
            Arrays.sort(charArray);
            return Arrays.toString(charArray);
        };

//        Calling the function
        String greetMember = fi.sayHello("Raj");
        String greetMemberMorning = fi2.sayHello("Raj");
        String greetMemberWithWordCount = findWordCount.sayHello("Raj");
        System.out.println(greetMember);
        String greetMemberInReverse = reverseName.sayHello("rajarshi");

//        Print - Output
        System.out.println(greetMemberMorning);
        System.out.println(greetMemberWithWordCount);
        System.out.println(greetMemberInReverse);

    }
}