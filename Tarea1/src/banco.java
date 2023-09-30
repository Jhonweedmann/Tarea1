public class banco {
    transaccion tra = new transaccion();
    public int numero = 100;
    public String nbanco = "Entel";
    public int dinero = 10000;
    public banco(){

    }
    public void transaccion (int a){
        for(int i = 0; i<a;i++){
            dinero = dinero - tra.cobro;
        }
    }
    public int dineroCuenta(){
        return dinero;
    }
}
