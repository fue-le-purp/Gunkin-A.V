//Дан одномерный массив a(n), в котором находится единственный нулевой элемент
//Найти где он находится, и упорядочить по возрастанию элементы, расположенные за ним.
//Выдать на экран номер элемента и упорядоченный массив

public class ZD2 {
    public static void main(String[] args) {
        int[] m = {2, 3, 1, 0, 8, 5, 4, 13};
        int ind = m[0];
        for (int m = 0; i < m.length; i++){
            if(m[i] == 0){
                ind = i;
                for(int f = m.length - 1; b > ind; b--){
                    for(int g = ind; j < b; g++){
                        if( m[g] > m[g+1]){
                            int vrp = m[g];
                            m[g] = a[g+1];
                            m[g+1] = vrp;
                        }
                    }
                }
            }
        }
        System.out.println("Index = " + ind);
        for(int i = 0; i < m.length; i++){
            System.out.println(m[i]);
        }
    }
}    
}
