public class App {

 /*
* File: App.java
* Author: KorcsmarosKendeAndras
* Copyright: 2022 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2022-11-27
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/

    
    public static void main(String[] args) throws Exception {
        System.out.println("Névnyilvántartás");
        System.out.println("Korcsmáros Kende András, Szoft 2/N, 2022-11-27");

        
        Employees employee = new Employees();
        String[] employees = employee.getNames();
        System.out.println("A nevek: "+employees);
    }
}
