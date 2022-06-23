package exercices;
import java.util.Arrays;

public class tp {

  
  public static void exercice1() {
    int k = 0;
    for(int i = 5; i >=k;i--){
      k++;
      System.out.print("*");
      /* 
        Fin Step 0 : i=4, k = 1 -> 4 >=1 == True On continue
        Fin Step 1 : i=3, k=2 -> 3 >=2 == True On continue
        Fin Step 2 : i=2, k=3 -> 2>=3 == False On Arrete
      */
    }
  }
  public static void exercice2(){
    for(int i = 0;i<3;i++){
      for(int k = 0; k <3-i;k++){
        System.out.print("*");
      }
    }
  }
  public static void exercice3(int[] tab){
    for(int i =1; i< tab.length;i++){
      tab[i] = tab[i-1];
    }
    System.out.println(Arrays.toString(tab));
  }
  public static void exercice4(int[] tab){
    for(int i =tab.length-1; i>0;i--){
      tab[i] = tab[i-1];
    }
    System.out.println(Arrays.toString(tab));
  }
  public static void exercice5(int[] tab){
    for(int i =tab.length-1; i>tab.length - i;i--){
      System.out.print(tab[i]+ " ");
    }
  }
  public static void exercice6(int[] tab){
    for(int i =0;i<tab.length -1;i++){
      if(tab[i]>tab[i+1]){
        System.out.print(tab[i]+1);
      }
    }
  }
  public static void exercice7(int[] tab){
    for(int i =0; i<tab.length;i++){
      for(int j = tab[i]-7;j>0;j--){
        System.out.print('*');
      }
      System.out.print('_');
    }
  }
  public static void exercice8(int[][] tab2d){
    for(int i1=0;i1<tab2d.length;i1++){
      for(int i2 = tab2d[i1].length-1;i2>0;i2--){
        System.out.print(tab2d[i1][i2]+ " ");
      }
    }
  }
  public static void exercice9(int[][] tab2d){
    for(int i1 = 0;i1<tab2d.length;i1++){
      for(int i2=0;i2<tab2d[i1].length;i2++){
        if(i1<i2){
          System.out.print(tab2d[i1][i2]+" ");
        }
      }
    }
  }
  public static void exercice10(int[][] tab2d){
    for(int i1 =0;i1<tab2d.length;i1++){
      for(int i2=0;i2<tab2d[i1].length;i2++){
        System.out.print(tab2d[i2][i1]+" ");
      }
    }
  }
  public static void exercice11(int[][] tab2d){
    for(int i1= tab2d.length -1;i1 >=0;i1--){
      for(int i2=0;i2<tab2d[i1].length;i2++){
        tab2d[i1][i2]=i1+i2;
      }
    }
    System.out.println(Arrays.deepToString(tab2d));
  }
  public static void exercice12(int[][] tab2d){
    for(int i =0;i<tab2d.length;i++){
      tab2d[i][i]=3;
    }
    System.out.println(Arrays.deepToString(tab2d));
  }
  public static int exercice13(int n){
    if (n <= 0){
      return 1;
    }
    else{
      return 1 + exercice13(n-2);
    }
  }
  public static void exercice14(int n,int a, int b){
    if(n<=0){
      System.out.print(a+"-"+b+ " ");
    }
    else{
      exercice14(n-1,a+1,b);
      exercice14(n-1,a,b+1);
    }
  }
  public static int exercice15(int n){
    int valeur = -1;
    while(valeur <0){
      for(int k=0;k<=n;k++){
        System.out.println("Valeur: "+ valeur);
        valeur+=(k%2);
      }
    }
    return valeur;
  }

}
