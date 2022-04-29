//Определить марицу, заполнить ее случайными значениями. Построить вектор, который будет возвращать сумму отрцательных элементов в каждом столбце

import java.util.Vector;

    public class ZD3 {
    
        public static void main(String[] args) {
            Vector vector = new Vector();
            int sum = 0;
            int[][] gt = new int[4][4];
            for(int i = 0; i < gt.length; i++){
                for(int g = 0; g < gt.length; g++){
                    gt[i][g] = (int) (Math.random() * 100 - 50);
                }
            }
            for(int i = 0; i < gt.length; i++){
                for(int g = 0; g < gt.length; g++){
                    System.out.print(gt[j][i] + "   ");
                }
                System.out.println();
            }
            for(int i = 0; i < gt.length; i++){
                for(int g = 0; g < gt.length; g++){
                    if (gt[i][g] < 0){
                        sum += gt[i][g];
                    }
                }
                vector.add(sum);
                sum = 0;
            }
            System.out.println(vector);
        }
    }    

