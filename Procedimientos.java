/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecadematrices;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author baru
 */
public class Procedimientos {
    
    int matrizA[][]=new int[3][3]; 
    
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        //Declaramos variables
        double determinante,x00,x01,x02,x10,x11,x12,x20,x21,x22;
        //matriz principal
        double [][]B=new double [3][3];
        // Matriz inversa
        double [][]C=new double [3][3];
    
        int [][]A;
        int filas, colum;
    
        int[][] matriz = new int [5][5];
        int cont=1;
        
        int moda = 0 ;
        int maxvecesrepetidas = 0;
        int [] M;
        int datos;
        int nElementos;
        int num;
        int Arreglo1[] = new int[num];
     
       
         int recorrido;
         int arreglo[],pos,aux=0;
         
         
   //Variables suma, resta y multiplicacion      
  int matriz_uno[][] = new int[4][4];
  int matriz_dos[][] = new int[4][4];
  int matriz_resultante[][] = new int[4][4];
  
  
  //Datos para suma, resta y multi
    public void llenarMatrices(int op){
        JOptionPane.showMessageDialog(null, "Ingrese los datos para Matriz 1");
            for (int j = 0; j < matriz_uno.length; j++) {
                for (int k = 0; k < matriz_uno[j].length; k++) {
                  matriz_uno[j][k]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion: "+(j+1) + "," + (k + 1)));
                }
            }
            JOptionPane.showMessageDialog(null, "Ingrese los datos de la segunda matriz ");
             for (int j = 0; j < matriz_dos.length ; j++) {
                 for (int k = 0; k < matriz_dos[j].length; k++) {
                     matriz_dos[j][k]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion: "+(j+1) + "," + (k + 1)));
                 }
        }
             
             
             
    if (op == 1) {
            suma();    
    }else if(op==2){
        resta();
    }else if(op==3){
        multi();
    }   
}
    
    public void imprimirMatriz(int[][] m){
        for (int i=0; i < m.length; i++){
            for (int j=0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimesión De La Matriz: ");
        int n = in.nextInt();
        mostrarMatriz(espiralCaracol(n, 1), n, n);
    }
    
    public int[][] espiralCaracol(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }
    
    public void mostrarMatriz(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }
    
    public void elementoComun(){
  
        System.out.println();
        int[] array1 = new int[10];
        int array2[] = new int[10];
        llenarArray(array1);
        llenarArray(array2);
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
     
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.println("Elemento común: " + array1[i]);
                }
            }
        }
    }
     
    static void llenarArray(int[] pArray){
        Random r = new Random();
        for(int i=0;i<pArray.length;i++){
            pArray[i] = r.nextInt(50) + 1;
        }
       
    }
    
    
    public void cuadroMagico(String[] args){
        
        int[][]m = new int [3][3];

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el dato de la fila"+i);
                int d = sc.nextInt();
                m[i][j]= d;
            }
        }
        esMagico(m);
    }
    
    public static void esMagico(int[][]m){
        int sumaFil = 0;
        int sumaCol = 0;
        int count = 0;
        for (int i=0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                sumaFil += m[i][j];
                sumaCol += m [j][i];
            }
            if(igual(sumaFil, sumaCol )){
                count ++;
                if(count==3){
                    System.out.println("El cuadro es magico");
                    mostrar(m);
                }else{
                    sumaFil = 0;
                    sumaCol = 0;
                }
            }else{
                System.out.println("El cuadro no es magico");
                mostrar(m);
                return;
            }
        }
    }
    private static boolean igual(int sumaFil, int sumaCol){
        return sumaFil == sumaCol;
    }
    private static void mostrar(int[][]m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println();
        }
    }
    
    public int[][] formaEspitalM(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }
    
    public void imprimirM(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }
    
   //opcion 1 suma
    public void suma() {
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos[i].length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
            }
        }
        
        JOptionPane.showMessageDialog(null, "La suma de las matrices es: \n"+  toString());
    }

    //opcion 2 resta
    public void resta() {
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos[i].length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "La resta de las matrices es: \n"+  toString());
    }

    //opcion 3 multiplicacion
    public void multi() {
        int resultado = 0;
            for (int i = 0; i < matriz_dos.length; i++) {
                for (int j = 0; j < matriz_dos.length; j++) {
                    for (int l = 0; l < matriz_dos[j].length; l++) {
                        resultado = resultado + (matriz_uno[i][1]*matriz_dos[1][j]);
                    }
                    matriz_resultante[i][j]=resultado;
                    resultado=0;
                }
                
        }
        JOptionPane.showMessageDialog(null, "La multiplicacion de las matrices es: \n"+  toString());
    }

    public void datosMA(int o){
          //introducimos números de la Matriz A
        System.out.println("Introduce los números de la Matriz A:");
        for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                  System.out.print("Fila "+(i+1)+" Columna "+(j+1)+" = "); 
                  matrizA[i][j]=sc.nextInt();
             }     
        }     
        System.out.println("");
       //Mostramos los números introducidos
       System.out.println("Esta es la matriz introducida:");
       
       System.out.println("");
       System.out.println("MATRIZ A");
       System.out.println("-----------");
       
         if (o == 6) {
             ad();
         }
     }
   
    public void mAdjunta(int matrizA[][]){
        
        int matrizAdjun[][]=new int[3][3];
        
        //CALCULO DE ADJUNTOS
       matrizAdjun[0][0]=(matrizA[1][1]*matrizA[2][2]) - (matrizA[1][2]*matrizA[2][1]);
       matrizAdjun[0][1]=-((matrizA[1][0]*matrizA[2][2]) - (matrizA[1][2]*matrizA[2][0]));
       matrizAdjun[0][2]=(matrizA[1][0]*matrizA[2][1]) - (matrizA[1][1]*matrizA[2][0]);
       
       matrizAdjun[1][0]=-((matrizA[0][1]*matrizA[2][2]) - (matrizA[0][2]*matrizA[2][1]));
       matrizAdjun[1][1]=(matrizA[0][0]*matrizA[2][2]) - (matrizA[0][2]*matrizA[2][0]);
       matrizAdjun[1][2]=-((matrizA[0][0]*matrizA[2][1]) - (matrizA[0][1]*matrizA[2][0]));
       
       matrizAdjun[2][0]=(matrizA[0][1]*matrizA[1][2]) - (matrizA[0][2]*matrizA[1][1]);
       matrizAdjun[2][1]=-((matrizA[0][0]*matrizA[1][2]) - (matrizA[0][2]*matrizA[1][0]));
       matrizAdjun[2][2]=(matrizA[0][0]*matrizA[1][1]) - (matrizA[0][1]*matrizA[1][0]);
       //MATRIZ ADJUNTA
       System.out.println("la Matriz Adjunta de la Matriz A es: ");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){                
                 System.out.print(matrizAdjun[i][j]+" "); 
           }   
          System.out.println(); //Salto de línea
       }
      System.out.println();
    }
    
    public void ad() {
      
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                 System.out.print(matrizA[i][j]+" ");
            }   
            System.out.println();
       }
        System.out.println();
        
        //Llamamos al método de la Matriz Adjunta
        mAdjunta(matrizA);    
    }
    
    
    //Opcion 4 Datos para Matriz ordenada por insercion
    public void datos6(int k){
         System.out.println("Ingrese el numero de elementos: ");
        nElementos = entrada.nextInt();
       arreglo = new int[nElementos];
       
        System.out.println("Ingrese los elementos a ordenar");
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]= entrada.nextInt();
        }

         if (k == 4) {
             id();
         }
     }
    
   //Metodo de insercion
    private void id() {
       for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux =arreglo[i];
            while((pos>0) && arreglo[pos-1]>aux){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        } 
         System.out.println("\nOrdenamiento ascendente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("\nOrdenamiento descendetemente");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
    }
    
     static Scanner sc = new Scanner (System.in);

    
    
    
  
    //Datos para la suma de filas de columna A
  public void sumaCF(int q){
       System.out.println("Ingrese las filas de la matriz");
        filas=sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz?");
        colum=sc.nextInt();
        A=new int [filas][colum];
        
      
      
      if (q == 8) {
          
          ab();
      }
     }       
        public void Filas(int matriz[][], int filas, int col){
     int [] B = new int[filas];
        int sumaFilas=0;
        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < col; x++) {
                if (x < col) {
                    sumaFilas += matriz[i][x];
                }
            }
            B[i]=sumaFilas;
            sumaFilas = 0;
        }
        System.out.println("Suma de las Filas");
        for(int i = 0; i < B.length; i++){ 
                System.out.print(B[i] + " ");
                System.out.println();
        }
        System.out.println();
    
    }
      public static void Columnas(int matriz[][], int filas, int col){
           int [] C = new int[col];
        int sumaCol=0;
        for(int i=0; i<col; i++){
            for(int x=0; x<filas; x++){
                if(x<filas){   
                    sumaCol += matriz [x][i];
                }   
            }
            C[i]=sumaCol;
            sumaCol = 0;   
        }   
        System.out.println("Suma de las Columnas");
        for(int i = 0; i < C.length; i++){ 
                System.out.print(C[i] + " ");
        }
        System.out.println();
    }   
    

    //Metodo de suma de columna A
    public void ab() {
        
        for(int i=0; i<filas; i++){
            for (int x=0; x<colum; x++){
                System.out.println("Ingrese los datos de la posición ["+i+"]["+x+"]");
                A[i][x]=sc.nextInt();
            }
        
            }
        System.out.println();
        System.out.println("Matriz: ");
        for (int[] A1 : A) {
            for (int j = 0; j < A1.length; j++) {
                System.out.print(A1[j] + " ");
            }
            System.out.println();//Salto de linea
        }
        System.out.println();
        
        Filas(A, filas, colum);
        Columnas(A, filas, colum);
    }
    
    
    //Datos para el cambio de columna
       public void intercambiar(int w){
           
     
    for(int fila=0; fila<matriz.length; fila++){
            for(int col=0; col<matriz[fila].length; col++){
                matriz[fila][col]= cont;
                cont++;
            }
        }
       
         if (w == 9) {
             inter();
         }
     }
    
   //Metodo de cambio de columna 
    static void cambioColumna(int [][] a){
        
        int[][] matriz = a;
        int cont=1;
        
        int[] aux= new int[5];
        int[] auxU= new int[5];
        
        for(cont=0; cont<5; cont++){
            auxU[cont]= matriz[cont][4];
        }
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = fila; col > 0; col--){ 
		matriz[fila][col]= matriz[fila][col-1];
                } 
        }
        
        for(cont=0; cont<5; cont++){
            matriz[cont][0]= auxU[cont];
        }
        
        for(cont=0; cont<5; cont++){
            aux[cont]= matriz[cont][1];
        }
        
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = 1; col < fila; col++){ 
		matriz[fila][col]= matriz[fila][col+1];
                } 
        }
        
        for(cont=0; cont<5; cont++){
            matriz[cont][4]= aux[cont];
        }
        
        
        System.out.println();
        System.out.println("Matriz intercambiada");
        System.out.println();
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = 0; col < matriz[fila].length; col++){ 
		System.out.print(matriz[fila][col] + "\t");
                } 
            System.out.println();
        
        }
}
 
    public void inter() {
        
        System.out.println("Matriz original");
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = 0; col < matriz[fila].length; col++){ 
		System.out.print(matriz[fila][col] + "\t");
                } 
            System.out.println();
        
        }
        
    cambioColumna(matriz);
    }
    
     //matriz simetrica
    static int[][] matrizS;
    public void MSimetrica(String[] args) {
        inicializar();
        visualizar();
        System.out.printf("\nLa matriz %s simétrica.", esMatrizSimetrica()?"es":"no es");
    }
 
    static boolean esMatrizSimetrica(){
        for(int i=0; i < matrizS.length; i++){
            for(int j=0; j < matrizS[i].length ; j++){
                if(matrizS[i][j] != matrizS[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
 
    static void inicializar(){
        System.out.println("Inicializando la matriz...\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimensión de la matriz: ");
        int dim = sc.nextInt();
        matrizS = new int[dim][dim];
        for(int i=0;i<matrizS.length;i++){
            for(int j=0;j<matrizS[i].length;j++){
                System.out.printf("Introduce el valor fila %d - columna %d: ", (i+1), (j+1));
                matrizS[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void visualizar(){
        System.out.println("\nVisualizando la matriz...\n");
        for(int i=0;i<matrizS.length;i++){
            for(int j=0;j<matrizS[i].length;j++){
                System.out.print(matrizS[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void MInversa(int p){

        // Pedimos valores de la matriz
        System.out.println("Ingrese los valores de la matriz :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=entrada.nextByte();
            }
        }
        System.out.println();
        // Mostramos la matriz principal
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("|"+ B[i][j] +"|");
            }
            System.out.println();
        }
   
       
         if (p == 7) {
             in();
         }
     }
    
   //Metodo para matriz inversa
    public void in() {
          //Hallamos determinante de nuestra matriz principal
        determinante=(B[0][0]*((B[1][1]*B[2][2])-(B[1][2]*B[2][1])))-(B[0][1]*((B[1][0]*B[2][2])-(B[2][0]*B[1][2])))+(B[0][2]*((B[1][0]*B[2][1])-(B[2][0]*B[1][1])));
        System.out.println();
        System.out.println("Determinate:" + determinante);
        System.out.println();
        // Calculamos los valores de la matriz inversa ya dividido entre la determinante
        if(determinante!=0){
            x00=((B[1][1]* B[2][2] - B[2][1]* B[1][2]))/determinante;
            x01=(-(B[1][0]* B[2][2] - B[2][0]* B[1][2]))/determinante;
            x02=((B[1][0]* B[2][1] - B[2][0]* B[1][1]))/determinante;
            x10=(-(B[0][1]* B[2][2] - B[2][1]* B[0][2]))/determinante;
            x11=((B[0][0]* B[2][2] - B[2][0]* B[0][2]))/determinante;
            x12=(-(B[0][0]* B[2][1] - B[2][0]* B[0][1]))/determinante;
            x20=((B[0][1]* B[1][2] - B[1][1]* B[0][2]))/determinante;
            x21=(-(B[0][0]* B[1][2] - B[1][0]* B[0][2]))/determinante;
            x22=((B[0][0]* B[1][1] - B[1][0]* B[0][1] ))/determinante;
            // Hacemos el intercambio de que las filas pasen como columnas
            C[0][0]=x00;
            C[0][1]=x10;
            C[0][2]=x20;
            C[1][0]=x01;
            C[1][1]=x11;
            C[1][2]=x21;
            C[2][0]=x02;
            C[2][1]=x12;
            C[2][2]=x22;
            // Mostramos la matriz inversa
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print("|"+ C[i][j] +"|");
                }
                System.out.println();
            } 
        }
        else{
            System.out.print("Error la matriz no tiene inversa");
        }
    }

  @Override
    public String toString(){
        String mensajematrizResultante="";
            for (int i = 0; i < matriz_resultante.length; i++) {
                for (int j = 0; j < matriz_resultante[i].length; j++) {
                    mensajematrizResultante = mensajematrizResultante + matriz_resultante[i][j]+"";
                }
                mensajematrizResultante = mensajematrizResultante+"\n";
        }
            return mensajematrizResultante;
}
 
}














 /*public void imprimirMatriz(int[][] m){
        for (int i=0; i < m.length; i++){
            for (int j=0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimesión De La Matriz: ");
        int n = in.nextInt();
        mostrarMatriz(espiralCaracol(n, 1), n, n);
    }
    
    public int[][] espiralCaracol(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }
    
    public void mostrarMatriz(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }
    
    public void elementoComun(){
  
        System.out.println();
        int[] array1 = new int[10];
        int array2[] = new int[10];
        llenarArray(array1);
        llenarArray(array2);
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
     
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.println("Elemento común: " + array1[i]);
                }
            }
        }
    }
     
    static void llenarArray(int[] pArray){
        Random r = new Random();
        for(int i=0;i<pArray.length;i++){
            pArray[i] = r.nextInt(50) + 1;
        }
       
    }
    
    
    public void cuadroMagico(String[] args){
        
        int[][]m = new int [3][3];

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el dato de la fila"+i);
                int d = sc.nextInt();
                m[i][j]= d;
            }
        }
        esMagico(m);
    }
    
    public static void esMagico(int[][]m){
        int sumaFil = 0;
        int sumaCol = 0;
        int count = 0;
        for (int i=0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                sumaFil += m[i][j];
                sumaCol += m [j][i];
            }
            if(igual(sumaFil, sumaCol )){
                count ++;
                if(count==3){
                    System.out.println("El cuadro es magico");
                    mostrar(m);
                }else{
                    sumaFil = 0;
                    sumaCol = 0;
                }
            }else{
                System.out.println("El cuadro no es magico");
                mostrar(m);
                return;
            }
        }
    }
    private static boolean igual(int sumaFil, int sumaCol){
        return sumaFil == sumaCol;
    }
    private static void mostrar(int[][]m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println();
        }
    }
    
    public int[][] formaEspitalM(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }
    
    public void imprimirM(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }*/