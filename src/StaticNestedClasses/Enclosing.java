package StaticNestedClasses;


/*
* The final type of nested class is not an inner class. A static nested class is a static
* class defined at the member level.
* It can be instantiated without an object of the
* enclosing class, so it can’t access the instance variables without an explicit object of
* the enclosing class.
*/
public class Enclosing {
    static class Nested{
        private int price = 6;
    }

    public static void main(String [] args){

        System.out.println(new Nested().price);
        //System.out.println(Enclosing.Nested.price);
        // DNC because static field cannot access non static field
    }

}
