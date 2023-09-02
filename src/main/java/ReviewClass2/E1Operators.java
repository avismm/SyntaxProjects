package ReviewClass2;

public class E1Operators {
    public static void main(String[] args) {
        boolean isMeat=false;
        boolean isEgg=true;
        boolean isFish=false;
        boolean isMilk=true;
        boolean isVeggies=true;
        boolean isProtain=isEgg||isMeat||isFish;
        boolean isGoodDiet=(isEgg||isMeat||isFish)&&isMilk&&isProtain;
        System.out.println(isGoodDiet);
        System.out.println(isProtain);
    }
}
