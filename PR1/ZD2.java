public class ZD2 {
    public static void main(String[]args) {
        if (args.length == 1) {
            System.out.println("Вы ввели " + args.length + " параметр");
        } else if (args.length > 1 && args.length < 5) {
            System.out.println("Вы ввели " + args.length + " параметра");   
        } else if (args.length > 4) {
            System.out.println("Вы ввели " + args.length + " параметров");    
        }  else if (args.length == 0 ) {
            System.out.println("Вы не вводили параметров" );  
        }

    }   

}    