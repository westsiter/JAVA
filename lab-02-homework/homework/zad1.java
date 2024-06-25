public class zad1 {
    public static void main(){
        MyWater myWater = new MyWater();
        myWater.addLarge(21);
        myWater.addMedium(29);
        myWater.addSmall(54);
        System.out.println("Mam teraz " + myWater.water() + " litrow wody");
        System.out.println("duzych butelek: " + myWater.getL() );
        System.out.println("srednich butelek: " + myWater.getM());
        System.out.println("malych butelek: " + myWater.getS());

    }
}
