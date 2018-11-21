package arrays;

public class SnakesArrayProba {

    public static void main(String[] args) {
        int n=6;//размерность массива
        int r=0;//переменная "строки"
        int c=0;//переменная "столбцы"
        int spec=0;//переменная, инкрементируя которую, уменьшаем кол-во шагов следующего цикла
        int i=0;//значение конкретной ячейки
        int matr[][]=new int[n][n];
        for(int z=0;i<n*n-1;z++){

            for(int j=0;j<n-spec;j++){
                matr[r][c++]=++i;
            }
            c--;//уменьшаем "с" на один, т.к. при выходе из цикла,- "с" инкрементируется на раз больше, чем нужно
            ++spec;// уменьшаем кол-во шагов следующего цикла

            for(int k=0;k<n-spec;k++){
                matr[++r][c]=++i;
            }

            for(int l=0;l<n-spec;l++){
                matr[r][--c]=++i;
            }
            ++spec;// уменьшаем кол-во шагов следующего цикла

            for(int m=0;m<n-spec;m++){
                matr[--r][c]=++i;
            }
            c++;//увеличиваем "с" на один, для "постановки" 1-го цикла на нужный столбец
        }

        for(int d=0;d<n;d++){
            for(int s=0;s<n;s++){
                System.out.print(matr[d][s]+"\t");
            }
            System.out.println();
        }

    }

}
