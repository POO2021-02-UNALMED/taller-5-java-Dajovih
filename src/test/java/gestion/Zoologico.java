package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<Zona>();
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;}
	
	public String getNombre() {
		return nombre;}
	
	public String getUbicacion() {
		return ubicacion;}
	 
	public ArrayList<Zona> getZonas() {
		return zonas;}
	
	public void setNombre(String nuevo) {
		this.nombre=nuevo;}
	
	public void setUbicacion(String nuevo) {
		this.ubicacion=nuevo;}
	
	public void setZonas(ArrayList<Zona> nuevo) {
		this.zonas=nuevo;}
	
	public void agregarZonas(Zona nueva){
		this.zonas.add(nueva);}
	
	public int cantidadTotalAnimales() {
		return this.zonas.get(0).getAnimales().get(0).getTotalAnimales();}}
