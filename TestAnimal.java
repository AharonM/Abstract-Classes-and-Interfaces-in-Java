/**
 *  PART II
 */
public class TestAnimal {
    public static void main(String []args){
Object [] animal = {new Dog(), new Goldfish(), new Duck()};

for(int i=0; i<animal.length;i++){
    System.out.print(animal[i].getClass().getName());

     if(animal[i] instanceof Animal){
         System.out.print(" Mammal:" +((Animal)animal[i]).isAMammal());
         System.out.print(" Carnivourous:" +
                 ((Animal)animal[i]).isCarnivourous());
         System.out.print(" Sound:" +((Animal)animal[i]).getHello());
     }

     if(animal[i] instanceof LandAnimal){
         System.out.print(" Number of Legs:" + 
                 ((LandAnimal)animal[i]).getNumberOfLegs());
         System.out.print(" Tail:" + ((LandAnimal)animal[i]).hasATail());
     }

     if(animal[i] instanceof WaterAnimal){
         System.out.print(" Gills:" + ((WaterAnimal)animal[i]).hasGills());
         System.out.print(" Eggs:" + ((WaterAnimal)animal[i]).laysEggs());
     }

        System.out.println();
        System.out.println();
        }
    }
}
