package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList<Reptil>();
	public static int iguanas=0;
	public static int serpientes=0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public static ArrayList<Reptil> getListado(){
		return listado;}
	
	public String getColorEscamas() {
		return colorEscamas;}
	
	public int getLargoCola(){
		return largoCola;}
	
	public static void setListado(ArrayList<Reptil> nuevo) {
		Reptil.listado=nuevo;}
	
	public void setColorEscamas(String nuevo) {
		this.colorEscamas=nuevo;}
	
	public void setLargoCola(int nuevo) {
		this.largoCola=nuevo;}
	
	public static int cantidadReptiles() {
		return listado.size();}
	
	public String movimiento() {
		return "reptar";}
	
	public Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++;
		return new Reptil(nombre,edad,"humedad",genero,"verde",3);
		}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++;
		return new Reptil(nombre,edad,"jungla",genero,"blanco",1);}}
