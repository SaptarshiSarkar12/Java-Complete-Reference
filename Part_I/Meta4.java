package Part_I;

import java.lang.annotation.*;
import java.lang.reflect.*;
// An annotation type declaration that includes defaults.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str() default "Testing";
    int val() default 9000;
}

class Meta4 {
    // Annotate a method using the default values.
    @MyAnno2()
    public static void myMeth() {
        Meta4 ob = new Meta4();
        // Obtain the annotation for this method
        // and display the values of the members.
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno2 anno = m.getAnnotation(MyAnno2.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
