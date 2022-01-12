public class HelloWorld {  // Save as HelloJNI.java
   public static void main(String[] args){
      System.out.println("Hello World"); // Load native library hello.dll (Windows) or libhello.so (Unixes)
                                   //  at runtime
                                   // This library contains a native method called sayHello()
   }
}