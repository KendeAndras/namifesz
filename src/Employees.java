public class Employees implements NamesInterface {

/*
* File: Employees.java
* Author: KorcsmarosKendeAndras
* Copyright: 2022 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2022-11-27
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/

    String[] names = {"Béla", "Géza"};
    
    @Override
    public String[] getNames() {
        return names;
    }

}
