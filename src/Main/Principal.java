package Main;

import java.util.Scanner;

import Implementacion.ImplementacionIngCivil;
import Implementacion.ImplementacionLicInformatica;
import Model.IngCivil;
import Model.LicInformatica;

public class Principal {

	public static void main(String[] args) {
		
		Scanner lectura = null;
		
		long cedula;
		String carrera;
		String grado;
		float salario;
		String area;

		IngCivil civil = null;
		LicInformatica info = null;
		
		int menuPrin, menuPrincIngCivil, menuPrincLicInfo;

		ImplementacionIngCivil impCivil = new ImplementacionIngCivil();
		ImplementacionLicInformatica impInfo = new ImplementacionLicInformatica();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1--CRUD DE ING CIVIL");
			System.out.println("2--CRUD DE LIC INFORMATICA");
			System.out.println("3--SALIR");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {

			case 1: //-----------------CRUD DE ING CIVIL
				do {
					System.out.println("MENU ING. CIVIL");
					System.out.println("1--ALTA");
					System.out.println("2--MOSTRAR");
					System.out.println("3--BUSCAR");
					System.out.println("4--EDITAR");
					System.out.println("5--ELIMINAR");
					System.out.println("6--SALIR");

					lectura = new Scanner(System.in);
					menuPrincIngCivil = lectura.nextInt();

					switch (menuPrincIngCivil) {
					case 1:
						try {
							System.out.print("Ingrese la cédula: ");
							cedula = lectura.nextLong();
							
							System.out.print("Ingrese la carrera: ");
							lectura.nextLine();
							carrera = lectura.nextLine();
							
							System.out.print("Ingrese el grado: ");
							grado = lectura.nextLine();
							
							System.out.print("Ingrese el salario: ");
							salario = lectura.nextFloat();

							civil = new IngCivil(cedula, carrera, grado, salario);
							impCivil.guardar(civil);
							System.out.println("Se guardó");
						} catch (Exception e) {
							System.out.println("Error al guardar: " + e.getMessage());
						}
						break;

					case 2:
						impCivil.mostrar();
						break;

					case 3:
						try {
							System.out.print("Ingrese la cédula a buscar: ");
							cedula = lectura.nextLong();
							lectura.nextLine();

							civil = impCivil.buscar(cedula);

							if (civil != null) {
								System.out.println("Registro encontrado:");
								System.out.println(civil);
							} else {
								System.out.println("No se encontró ningún registro con esa cédula.");
							}
						} catch (Exception e) {
							System.out.println("Error al buscar: " + e.getMessage());
							lectura.nextLine();
						}
						break;

					case 4:
						try {
							System.out.print("Ingresa la cédula para editar el salario: ");
							cedula = lectura.nextLong();
							lectura.nextLine();

							civil = impCivil.buscar(cedula);
							if (civil != null) {
								System.out.println("Registro encontrado: " + civil);

								System.out.print("Ingresa el nuevo salario: ");
								salario = lectura.nextFloat();
								lectura.nextLine();

								civil.setSalario(salario);
								impCivil.editar(civil);
								System.out.println("El salario se editó correctamente.");
							} else {
								System.out.println("No se encontró un registro con esa cédula.");
							}

						} catch (Exception e) {
							System.out.println("Error al editar: " + e.getMessage());
						}
						break;

					case 5:
						try {
							System.out.print("Ingresa la cédula para eliminar: ");
							cedula = lectura.nextLong();
							lectura.nextLine();

							impCivil.eliminar(cedula);
							System.out.println("Se eliminó el registro correctamente.");
						} catch (Exception e) {
							System.out.println("Error al eliminar: " + e.getMessage());
						}
						break;

					case 6:
						break;
					}
				} while (menuPrincIngCivil != 6);
				break;

			case 2: //-----------------CRUD DE LIC INFORMATICA
				do {
					System.out.println("MENU LIC. INFORMATICA");
					System.out.println("1--ALTA");
					System.out.println("2--MOSTRAR");
					System.out.println("3--BUSCAR");
					System.out.println("4--EDITAR");
					System.out.println("5--ELIMINAR");
					System.out.println("6--SALIR");

					lectura = new Scanner(System.in);
					menuPrincLicInfo = lectura.nextInt();

					switch (menuPrincLicInfo) {
					case 1:
						try {
							System.out.print("Ingrese la cédula: ");
							cedula = lectura.nextLong();

							System.out.print("Ingrese la carrera: ");
							lectura.nextLine();
							carrera = lectura.nextLine();

							System.out.print("Ingrese el área: ");
							area = lectura.nextLine();

							System.out.print("Ingrese el salario: ");
							salario = lectura.nextFloat();

							info = new LicInformatica(cedula, carrera, area, salario);
							impInfo.guardar(info);
							System.out.println("Se guardó");
						} catch (Exception e) {
							System.out.println("Error al guardar: " + e.getMessage());
						}
						break;

					case 2:
						impInfo.mostrar();
						break;

					case 3:
						try {
							System.out.print("Ingrese la cédula a buscar: ");
							cedula = lectura.nextLong();
							lectura.nextLine();

							info = impInfo.buscar(cedula);

							if (info != null) {
								System.out.println("Registro encontrado:");
								System.out.println(info);
							} else {
								System.out.println("No se encontró ningún registro con esa cédula.");
							}
						} catch (Exception e) {
							System.out.println("Error al buscar: " + e.getMessage());
							lectura.nextLine();
						}
						break;

					case 4:
						try {
							System.out.print("Ingresa la cédula para editar el salario: ");
							cedula = lectura.nextLong();
							lectura.nextLine();

							info = impInfo.buscar(cedula);
							if (info != null) {
								System.out.println("Registro encontrado: " + info);

								System.out.print("Ingresa el nuevo salario: ");
								salario = lectura.nextFloat();
								lectura.nextLine();

								info.setSalario(salario);
								impInfo.editar(info);
								System.out.println("El salario se editó correctamente.");
							} else {
								System.out.println("No se encontró un registro con esa cédula.");
							}

						} catch (Exception e) {
							System.out.println("Error al editar: " + e.getMessage());
						}
						break;

					case 5:
						try {
							System.out.print("Ingresa la cédula para eliminar: ");
							cedula = lectura.nextLong();
							lectura.nextLine();

							impInfo.eliminar(cedula);
							System.out.println("Se eliminó el registro correctamente.");
						} catch (Exception e) {
							System.out.println("Error al eliminar: " + e.getMessage());
						}
						break;

					case 6:
						break;
					}
				} while (menuPrincLicInfo != 6);
				break;

			case 3:
				break;
			}
		} while (menuPrin != 3);

		lectura.close();
	}
}