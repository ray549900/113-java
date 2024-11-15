public class SwordsMan extends Role {
    public void fight() {
        super.fight();
        System.out.println("揮劍攻擊");
    }

    @Override
    public String toString(){
        return String.format("劍士:%s%n",super.toString());
    }
}