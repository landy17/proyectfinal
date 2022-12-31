package ar.com.codoacodo.herencia;

//hereda de Articulo: "es un articulo"
//musica es un articulo, porque musica herada de articulo


public class Musica extends Articulo {

    //atributo propio
    private String selloDiscografico;

    //este constructor es propio de musica 
    public Musica(Long id, String titulo, String autor, String selloDiscografico){

        //pero la primera linea debe ser invocar al constructor padre

        //primero debo crear Articulo
        //super es Articulo
        super(id, titulo, autor);//llamando al constructor del padre:Articulo

        // Ahora SI, si tengo mas articulos puedo "seterlos"
        //this Musica
        this.selloDiscografico = selloDiscografico;
    }

    public String getSelloDiscografico(){
        return selloDiscografico;
    }
    public void getSelloDiscografico(String selloDiscografico){
        this.selloDiscografico = selloDiscografico;
    }
    
}
