package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static ArrayList<Animal> animales=new ArrayList<Animal>();
	
	public Zona() {	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;}
	
	public String getNombre() {
		return this.nombre;}
	
	public Zoologico getZoo() {
		return this.zoo;}
	
	public static ArrayList<Animal> getAnimales() {
		return animales;}
	
	public void setNombre(String nuevo) {
		this.nombre=nuevo;}
	
	public void setZoologico(Zoologico nuevo) {
		this.zoo=nuevo;}
	
	public static void setAnimales(ArrayList<Animal> nuevo) {
		Zona.animales=nuevo;}
	
	public static void agregarAnimales(Animal animal) {
		Zona.animales.add(animal);}
	
	public int cantidadAnimales() {
		return animales.size();}}
