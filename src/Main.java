//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        @SuppressWarnings("unused")
        Cat myCat = new Cat("Stella");

        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not very important");
        }

    }
}