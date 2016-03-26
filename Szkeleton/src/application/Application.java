package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application
{

	public static void main(String[] args)
	{
		/*
		Jóni Dani 2016.03.26.
		Menüs vezérlés implementálása
		 */



		boolean exit = false;
		String input = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (!exit){
			System.out.println("1: Lépés");
			System.out.println("2: Dobozfelvétel");
			System.out.println("3: Dobozlerakás");
			System.out.println("4: Lövés");
			System.out.println("5: Új játék indítása");
			System.out.println("6: Feladás");
			System.out.println("7: Játék megnyerése");
			System.out.println("8: Játék elvesztése");
			System.out.println("9: Kilépés");

			try {
				input = br.readLine();
			} catch (Exception e) { e.printStackTrace(); }

				switch (input){
					case "1":		//Lépés
						System.out.println("1: Falra");
						System.out.println("2: Padlóra");
						System.out.println("3: Mérlegre");
						System.out.println("4: Ajtóra");
						System.out.println("5: Csillagkapura");
						System.out.println("6: Szakadékra");

						try {
							input = br.readLine();
						} catch (Exception e) { e.printStackTrace(); }

						switch (input){
							case "1":
								break;

							case "2":
								break;

							case "3":
								break;

							case "4":
								break;

							case "5":
								break;

							case "6":
								break;

							default:
								break;
						}

						break;


					case "2":		//Dobozfelvétel
						System.out.println("1: A játékossal szemben van doboz");
						System.out.println("2: A játékossal szemben nincs doboz");
						System.out.println("3: A játékosnál már van doboz");
						System.out.println("4: A játékos mérlegről vesz fel dobozt");

						try {
							input = br.readLine();
						} catch (Exception e) { e.printStackTrace(); }

						switch (input){
							case "1":
								break;

							case "2":
								break;

							case "3":
								break;

							case "4":
								break;

							default:
								break;
						}

						break;


					case "3":		//Dobozlerakás
						System.out.println("1: Falra");
						System.out.println("2: Padlóra");
						System.out.println("3: Mérlegre");
						System.out.println("4: Ajtóra");
						System.out.println("5: Csillagkapura");
						System.out.println("6: Dobozra");
						System.out.println("7: Szakadékra");

						try {
							input = br.readLine();
						} catch (Exception e) { e.printStackTrace(); }

						switch (input){
							case "1":
								break;

							case "2":
								break;

							case "3":
								break;

							case "4":
								break;

							case "5":
								break;

							case "6":
								break;

							case "7":
								break;

							default:
								break;
						}

						break;


					case "4":		//Lövés
						System.out.println("1: Sima falra");
						System.out.println("2: Speciális falra");
						System.out.println("3: Mérlegre");
						System.out.println("4: Ajtóra");
						System.out.println("5: Dobozra");
						System.out.println("6: Csillagkapura");

						try {
							input = br.readLine();
						} catch (Exception e) { e.printStackTrace(); }

						switch (input){
							case "1":
								break;

							case "2":
								break;

							case "3":
								break;

							case "4":
								break;

							case "5":
								break;

							case "6":
								break;

							default:
								break;
						}

						break;


					case "5":		//Új játék indítása
						break;


					case "6":		//Feladás
						break;


					case "7":		//Játék megnyerése
						break;


					case "8":		//Játék elvesztése
						break;


					case "9":		//Kilépés
						exit = true;
						break;


					default:
						break;
				}


		}


	}

}
