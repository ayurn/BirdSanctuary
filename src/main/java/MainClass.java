public class MainClass {

    public static void main(String[] args){
        System.out.println("Welcome to Bird Sanctuary");

        BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();

        Parrot parrot = new Parrot("p");
        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");
        Duck duck = new Duck("d1");
        Penguin penguin = new Penguin("pn");
        Crow crow = new Crow("c1");

        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(parrot1);
        birdSanctuaryManager.add(parrot2);
        birdSanctuaryManager.add(parrot3);
        birdSanctuaryManager.add(penguin);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(crow);


        birdSanctuaryManager.print();
        //birdSanctuaryManager.remove(parrot1);

        System.out.println("Total birds : " + birdSanctuaryManager.getAllCount());

        System.out.println("Number of Parrots are : " + parrot.getCount());
        System.out.println("Number of Penguins are : " + penguin.getCount());
        System.out.println("Number of Ducks are : " + duck.getCount());
        System.out.println("Number of Crows are : " + crow.getCount());

    }
}
