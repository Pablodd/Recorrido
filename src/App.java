import java.util.Scanner;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduce secuencia");

        String secuence = myObj.nextLine();

        System.out.println("La secuencia es: " + secuence);

        char[] myChar = secuence.toCharArray();

        int count = 0;
        ArrayList<String> pack_data = new ArrayList<String>();
        for (int i = 0; i < secuence.length(); i++){
            
            int valor = 0;
            int position = count;
            
            
            System.out.println(position);
            if(position == secuence.length()){
                break;
            }
            for (int x = 0; x < secuence.length(); x++){
                int position2 = position + x;
                
                if(position2 == secuence.length()){
                    
                    break;

                }else if (myChar[position]==myChar[position2]){
                    valor ++;
                    count ++;
                }else{
                    break;
                }
                
            }

            System.out.println(myChar[position] +""+ valor);
            pack_data.add(myChar[position]+""+valor);
        }

        StringBuilder str =new StringBuilder();
        for (String data : pack_data){

            str.append(data);
        }
        System.out.println(str);   
    }
}
