import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public  class homes{
    public static void main(String[] args){
        String file = "homes.csv";
        String line;
        int P1=0,P2=0,P3=0;
        int i=0;
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))){
            while((line = br.readLine()) != null){
                if(i!=0){
                String[] key= line.split(",");
                int p=(Integer.parseInt(key[1].trim()) - Integer.parseInt(key[0].trim()))*1000 - Integer.parseInt(key[8].trim());
                if(p>P1){
                    P1=p;
                }
                else if(p<P1 & p>P2){
                    P2=p;
                }
                else if(p<P2 & p>P3){
                    P3=p;
                }
            }
            else{
                i=i+1;
            }

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Largest profit: "+P1+" \nSecond Largest Profit: "+P2+"\n Third Largest Profit: "+P3);
    }
}