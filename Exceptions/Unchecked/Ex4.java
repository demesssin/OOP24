package Exceptions.Unchecked;

public class Ex4 {
    public static void main(String[] args) {
        //String name = null;
        //name.length();    // Один из видов Unchecked exception - NullPointerException

        try {
            int[] arr = new int[2];
        } catch (RuntimeException e){
            System.out.println("Обработка runtime исключения");
        }
         // Однако обработка и ловля Unchecked exceptions не имеет смысла, ибо, это явные ошибки в программе
        // это не просто исключительный случай, хоть мы и можем попробовать с помощью try catch оформить это
        // В этом опять же нет никакого смысла!


    }
}
