//Передавать в качестве параметров два целочисленных числа. 
//Вывести на экран как сами значения, так и их сумму (“3 + 2 = 5”). 
//Если количество параметров не равно 2, вывести сообщение “Неверное количество параметров”.

public class ZD3 {
    public static void main(String p[]){
    	if(p.length==2){
    		int f = Integer.parseInt(p[0]);
    		int s = Integer.parseInt(p[1]);
    		System.out.println(p[0]+" + "+p[1]+" = "+(f+s));}
    	else{
    		System.out.println("Неверное количество параметров ");}
    	}
    }
