
public class ejercicio2 {
    
    public static void mostrar(int vec[],int n){
        System.out.print("El arreglo = [ ");
        for(int i = 0;i < n; i++)
        {
            System.out.print("   " + vec[i]);
        }
        System.out.println("]");
    } 
    
    public static void main(String[] args) {
        int n = (int)(Math.random()*(20-10+1)+10);
        System.out.println("cantidad = " + n);
        int [] num = new int[n];
        int ingreso = 0;
        //Llenado de datos al array
        for(int i = 0;i < n;i++)
        {   
            ingreso = (int)(Math.random()*(100-10+1)+10);
            num[i] = ingreso;
        }
        mostrar(num,n);
        //suma de los pares
        int sumap=0;
        for (int i = 0; i<n ; i++)
        {
            if (num[i] % 2 == 0)
            {
                sumap = sumap + num[i];
            }
        }
        System.out.println("La suma es = " + sumap);
        //cantidad de numeros impares
        int contador = 0;
        for (int i = 0; i<n ; i++)
        {
            if (num[i] % 2 == 1)
            {
                contador = contador +1;
            }
        }
        System.out.println("Cantidad de impares = " + contador);
        
        
        
        
    }
    
}
