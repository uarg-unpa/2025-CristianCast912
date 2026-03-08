package POOTALLER.EjercicioEmpresaLact;

public class Empresa {
    private Producto [] productos;
    private int size, next;
        public Empresa(int n){
            this.size=n;
            this.productos = new Producto[size];
            this.next=0;
        }
        public void agregarProducto(Producto producto){
            if (!(this.next < this.size))
            this.enlarge();
            productos[next]=producto;
            this.next++;
        }
        private void enlarge(){
        int count2=0;
        Producto [] aux= new Producto[size*2];
        for (int i=0; i<size; i++){
        aux[count2]=productos[i];
        count2++;
        }
        this.productos = aux;
        this.next = count2;
        this.size = size*2;
                                }
}
