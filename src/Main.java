public class Main {
    public static void main(String[] args) {
        Famaly[] mumbers={
                new Kvartira(),
                new Kvartira(),
                new Kvartira(),
                new Kvartira(),
                new Kvartira(),
                new Obshejitie(),
                new Obshejitie(),
                new Obshejitie(),
                new Obshejitie(),
                new Gostinitsa(),
                new Gostinitsa(),
                new Gostinitsa(),
        } ;
        int counter1=0;
        int counter2=0;
        int counter3=0;

        for (Famaly f:mumbers){
            f.arenda();
            if(f.getClass().getName().equals("Kvartira")){
                counter1++;
            }
            if (f.getClass().getName().equals("Obshejitie")){
                counter2++;
            }
            if(f.getClass().getName().equals("Gostinitsa")){
                counter3++;
            }
            System.out.println("Kvartirada: "+counter1+"adam jashait");
            System.out.println("Obshejitiede: " +counter2+"adam jashait");
            System.out.println("Gostinitsada: "+counter3+"adam jashait");
        };






    }
}