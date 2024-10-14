public class MetodosBusqueda {
    public int busquedaSecuencial (int[] array,int valorBuscado){
        int pos = -1;
        for(int i = 0; i< array.length ; i++){
            if(array[i] == valorBuscado){
                pos = i;
            }

        }
        return pos;
    }

    
    public void printArray (int[] array){
        for(int elem:array){
            System.out.println(elem+" ");
        }
    }
    
    
    public int busquedaBinaria(int[] array,int value){
        int inicio = 0;
        int fin = array.length -1;

        while (inicio <= fin) {
            int medio = inicio + (fin -inicio)/2;

            if(array[medio] == value){
                //ELEMENTO ENCONTRADO
                return medio;
            }

            if(array[medio] < value){
                inicio =medio+1; //Buscar en la mitad de la derecha
            }else{
                fin = medio -1; //Buscar en la mitad de la izquierda
            }
            
        }

        return -1;
    }

}

   
    